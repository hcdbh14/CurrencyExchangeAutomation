package CoinSelectionScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CoinSelectionElements {
    IOSDriver<IOSElement> driver;

    @iOSXCUITFindBy(accessibility = "רובל רוסי")
    public WebElement lastListElement;

    public CoinSelectionElements(IOSDriver<IOSElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
