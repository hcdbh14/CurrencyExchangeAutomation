package AppiumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UserActions {



    public static void click(WebElement element) {
        element.click();
    }

    public static void sendKeys(IOSDriver<IOSElement> driver, WebElement element , String keys) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
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

    public static void scroll(IOSDriver<IOSElement> driver, WebElement element) {
        TouchActions action = new TouchActions(driver);
        action.scroll(element, 10, 100);
        action.perform();
    }
}
