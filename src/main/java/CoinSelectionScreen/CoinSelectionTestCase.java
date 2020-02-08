package CoinSelectionScreen;
import AppiumUtilities.ServerConnect;
import AppiumUtilities.UserActions;
import ChooseCoinScreen.ChooseCoinElements;
import MenuScreen.MenuElements;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class CoinSelectionTestCase {
    public static IOSDriver<IOSElement> driver;
    public static MenuElements menuPage;
    public static ChooseCoinElements chooseCoinPage;
    public static CoinSelectionElements coinSelectionPage;

    @Before
    public void getDriver() {
        driver = ServerConnect.setUp();
    }

    @Test
    public void scrollToLastElement() {
        menuPage = new MenuElements(driver);
        chooseCoinPage = new ChooseCoinElements(driver);
        coinSelectionPage = new CoinSelectionElements(driver);

        UserActions.click(menuPage.addCurrencyButton);
        UserActions.click(chooseCoinPage.currencyIHave);
        UserActions.scroll(driver, coinSelectionPage.lastListElement);
    }

    @After
    public void afterTest() { driver.closeApp(); }
}
