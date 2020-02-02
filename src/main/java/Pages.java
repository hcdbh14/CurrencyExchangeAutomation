//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Pages {


    IOSDriver<IOSElement> driver;

    // Menu
    @iOSXCUITFindBy(accessibility = "עריכה")
    public WebElement editButton;

    @iOSXCUITFindBy(accessibility = "מטבעות שלי")
    public WebElement pageTitle;

    @iOSXCUITFindBy(accessibility = "plus")
    public WebElement addCurrencyButton;

    // Currency Pick
    @iOSXCUITFindBy(accessibility = "בחרו מטבעות להשוואה")
    public WebElement pickTitle;

    @iOSXCUITFindBy(accessibility = "arrow.left")
    public WebElement arrowLeft;

    @iOSXCUITFindBy(accessibility = "currencyIHave")
    public WebElement currencyIHave;

    @iOSXCUITFindBy(accessibility = "currencyIWant")
    public WebElement currencyIWant;

    @iOSXCUITFindBy(accessibility = "סגור")
    public WebElement closeButton;

    public Pages(IOSDriver<IOSElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
