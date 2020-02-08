package ChooseCoinScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChooseCoinElements {

    IOSDriver<IOSElement> driver;

    @iOSXCUITFindBy(accessibility = "בחרו מטבעות להשוואה")
    public WebElement pickTitle;

    @iOSXCUITFindBy(accessibility = "down-arrow")
    public WebElement downArrow;

    @iOSXCUITFindBy(accessibility = "coinIHave")
    public WebElement currencyIHave;

    @iOSXCUITFindBy(accessibility = "coinIWant")
    public WebElement currencyIWant;

    @iOSXCUITFindBy(accessibility = "סגור")
    public WebElement closeButton;

    public ChooseCoinElements(IOSDriver<IOSElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
