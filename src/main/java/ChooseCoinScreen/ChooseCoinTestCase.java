package ChooseCoinScreen;
import AppiumUtilities.ServerConnect;
import AppiumUtilities.UserActions;
import MenuScreen.MenuElements;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ChooseCoinTestCase {

    public static IOSDriver<IOSElement> driver;
    public static MenuElements menuPage;
    public static ChooseCoinElements chooseCoinPage;


    @Before
    public void getDriver() {
        driver = ServerConnect.setUp();
    }


    @Test
    public void verifyCurrencyPicElements() {
        menuPage = new MenuElements(driver);
        chooseCoinPage = new ChooseCoinElements(driver);

        UserActions.click(menuPage.addCurrencyButton);

        UserActions.elementToBeVisible(driver, chooseCoinPage.downArrow);
        UserActions.elementToBeVisible(driver, chooseCoinPage.currencyIHave);
        UserActions.elementToBeVisible(driver, chooseCoinPage.currencyIWant);
        UserActions.elementToClickable(driver, chooseCoinPage.closeButton);
        UserActions.elementToBeVisible(driver, chooseCoinPage.pickTitle);
    }

    @After
    public void afterTest() {
        driver.closeApp();
    }
}
