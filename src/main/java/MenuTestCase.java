//import java.net.MalformedURLException;
//import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class MenuTestCase {

    public static IOSDriver<IOSElement> driver;
    public static Pages menuPage;


    public void click(WebElement element) {
        elementToClicable(element);
        element.click();
    }

/*    public void sendKeys(WebElement element , String keys) {
        elementToClickable(element);
        element.sendKeys(keys);
    }*/

    public void elementToClicable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println(element.getText() + " is available for Click");
    }

    public void elementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(element.getText() + "is visible");
    }

    @Before
    public void getDriver() {
        driver = ServerConnect.setUp();
    }

    @Test
    public void verifyIntroPageElements() {
        menuPage = new Pages(driver);
        elementToClicable(menuPage.addCurrencyButton);
        elementToClicable(menuPage.editButton);
        elementToBeVisible(menuPage.pageTitle);
    }

    @Test
    public void navigateFromIntroToCurrencyPick() {
        menuPage = new Pages(driver);
        click(menuPage.addCurrencyButton);
    }

    @Test
    public void verifyCurrencyPicElements() {
        menuPage = new Pages(driver);

        click(menuPage.addCurrencyButton);
        elementToBeVisible(menuPage.downArrow);
        elementToBeVisible(menuPage.currencyIHave);
        elementToBeVisible(menuPage.currencyIWant);
        elementToClicable(menuPage.closeButton);
        elementToBeVisible(menuPage.pickTitle);
    }

    @After
    public void afterTest() {
        driver.closeApp();
    }
}