package MenuScreen;
import AppiumUtilities.Base;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static AppiumUtilities.Base.elementToBeVisible;
import static AppiumUtilities.Base.elementToClickable;


public class MenuTestCase {

    public static IOSDriver<IOSElement> driver;
    public static MenuElements menuPage;

    @Before
    public void getDriver() {
        driver = Base.setUp();
        menuPage = new MenuElements(driver);
    }

    @Test
    public void verifyIntroPageElements() {
        elementToClickable(menuPage.addCurrencyButton);
        elementToClickable(menuPage.editButton);
        elementToBeVisible(menuPage.menuTitle);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}