package ChooseCoinScreen;
import AppiumUtilities.Base;
import MenuScreen.MenuElements;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static AppiumUtilities.Base.*;

public class ChooseCoinTestCase {

    public static IOSDriver<IOSElement> driver;
    public static MenuElements menuPage;
    public static ChooseCoinElements chooseCoinPage;

    @Before
    public void getDriver() {
        driver = Base.setUp();
        menuPage = new MenuElements(driver);
        chooseCoinPage = new ChooseCoinElements(driver);
    }

    @Test
    public void verifyChooseCoinElements() {
        click(menuPage.addCurrencyButton);
        elementToBeVisible(chooseCoinPage.downArrow);
        elementToBeVisible(chooseCoinPage.currencyIHave);
        elementToBeVisible(chooseCoinPage.currencyIWant);
        elementToClickable(chooseCoinPage.closeButton);
        elementToBeVisible(chooseCoinPage.pickTitle);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}
