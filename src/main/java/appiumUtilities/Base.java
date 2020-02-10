package appiumUtilities;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    public static IOSDriver<IOSElement> driver;
    public static Pages pages;

    @Before
    public void init() {

        pages = new Pages(driver);
    }

    public Base() {

        driver = setUp();
    }

    public static IOSDriver<IOSElement> setUp()  {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("platformVersion", "13.3");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleId", "kenny.CurrencyExchange");
        capabilities.setCapability("udid", "5EE89D49-FEA1-4771-9201-6C407BFD480C");
        capabilities.setCapability("app",
                "/Users/kennykurochkin/Library/Developer/Xcode/DerivedData/CurrencyExchange-hdukkrajbgrqrpbqsmmientuztpc/Build/Products/Debug-iphonesimulator/CurrencyExchange.app");

        URL url;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver<IOSElement>(url, capabilities);
        } catch (MalformedURLException e) {
            //
        }
        System.out.println("Application is launched");
        return driver;
    }

    public void click(WebElement element) {
        System.out.println("click on - " + element.getText());
        element.click();
    }

    public void sendKeys(WebElement element , String keys) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("send keys as - " + element.getText());
        element.sendKeys(keys);
    }

    public void elementToClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println(element.getText() + " is available for Click");
    }

    public void elementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(element.getText() + "is visible");
    }

    public void scrollTo(WebElement element) {
        int countScrolls = 0;

        while (countScrolls < 10) {

            if (element.isDisplayed()) {
                System.out.println("Element Is Located - " + element.getText());
                break;
            } else {
                countScrolls++;
                scroll();
            }
        }
    }

    public void scroll() {
        TouchAction action = new TouchAction(driver);
        int startX = driver.manage().window().getSize().getWidth() / 2;
        PointOption pointOption = new PointOption();
        pointOption.withCoordinates(startX ,(int)((double) driver.manage().window().getSize().getWidth() * 0.8D));
        PointOption pointOption1 = new PointOption();
        pointOption1.withCoordinates(startX ,(int)((double) driver.manage().window().getSize().getWidth() * 0.3D));
        action.longPress(pointOption).moveTo(pointOption1).release().perform();
    }
}