package AppiumUtilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static AppiumUtilities.ServerConnect.driver;

public class UserActions {



    public static void click(WebElement element) {
        element.click();
    }

    public static void sendKeys(IOSDriver<IOSElement> driver, WebElement element , String keys) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(keys);
    }

    public static void elementToClickable(IOSDriver<IOSElement> driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println(element.getText() + " is available for Click");
    }

    public static void elementToBeVisible(IOSDriver<IOSElement> driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(element.getText() + "is visible");
    }


    public static void scrollTo(WebElement element) {
        int countScrolls = 0;

        while (countScrolls < 10) {
            if (element.isDisplayed()) {
                System.out.println("Element Is Located - " + element);
                break;
            }
            countScrolls ++;
            scroll();
        }
    }

    public static void scroll() {
        TouchAction action = new TouchAction(driver);
        int startX = driver.manage().window().getSize().getWidth() / 2;

        PointOption pointOption = new PointOption();
        pointOption.withCoordinates(startX ,(int)((double) driver.manage().window().getSize().getWidth() * 0.6D));

        PointOption pointOption1 = new PointOption();
        pointOption1.withCoordinates(startX ,(int)((double) driver.manage().window().getSize().getWidth() * 0.3D));

        action.longPress(pointOption).moveTo(pointOption1).release().perform();
    }
}
