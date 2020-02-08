package MenuScreen;
import AppiumUtilities.ServerConnect;
import AppiumUtilities.UserActions;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class MenuTestCase {

    public static IOSDriver<IOSElement> driver;
    public static MenuElements menuPage;

    @Before
    public void getDriver() {
        driver = ServerConnect.setUp();
    }

    @Test
    public void verifyIntroPageElements() {
        menuPage = new MenuElements(driver);
        UserActions.elementToClickable(driver, menuPage.addCurrencyButton);
        UserActions.elementToClickable(driver, menuPage.editButton);
        UserActions.elementToBeVisible(driver, menuPage.menuTitle);
    }

    @After
    public void afterTest() {
        driver.closeApp();
    }
}