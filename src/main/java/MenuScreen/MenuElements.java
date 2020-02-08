package MenuScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuElements {

    IOSDriver<IOSElement> driver;

    @iOSXCUITFindBy(accessibility = "עריכה")
    public WebElement editButton;

    @iOSXCUITFindBy(accessibility = "מטבעות שלי")
    public WebElement menuTitle;

    @iOSXCUITFindBy(accessibility = "plus")
    public WebElement addCurrencyButton;


    public MenuElements(IOSDriver<IOSElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
