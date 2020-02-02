//import java.net.MalformedURLException;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.util.concurrent.TimeUnit;

public class MenuTestCase {

    public static IOSDriver<IOSElement> driver;
    public static Pages menuPage;
    public static Pages CurrencyPick;

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

    @BeforeClass
    public static void getDriver() {
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
    public void verifyCurrencyPicElements() throws InterruptedException {
        CurrencyPick = new Pages(driver);

        Thread.sleep(5);
        elementToBeVisible(CurrencyPick.arrowLeft);
        elementToBeVisible(CurrencyPick.currencyIHave);
        elementToBeVisible(CurrencyPick.currencyIWant);
        elementToClicable(CurrencyPick.closeButton);
        elementToBeVisible(CurrencyPick.pickTitle);
    }
}