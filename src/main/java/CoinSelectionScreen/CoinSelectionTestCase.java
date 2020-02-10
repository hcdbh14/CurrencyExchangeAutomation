package CoinSelectionScreen;
import AppiumUtilities.Base;
import ChooseCoinScreen.ChooseCoinElements;
import MenuScreen.MenuElements;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static AppiumUtilities.Base.*;

public class CoinSelectionTestCase {

    public static IOSDriver<IOSElement> driver;
    public static MenuElements menuPage;
    public static ChooseCoinElements chooseCoinPage;
    public static CoinSelectionElements coinSelectionPage;

    @Before
    public void getDriver() {
       driver = Base.setUp();
       menuPage = new MenuElements(driver);
       chooseCoinPage = new ChooseCoinElements(driver);
       coinSelectionPage = new CoinSelectionElements(driver);
    }

    @Test
    public void scrollToLastElement() {
        click(menuPage.addCurrencyButton);
        click(chooseCoinPage.currencyIHave);
        scroll();
        scrollTo(coinSelectionPage.lastListElement);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}
