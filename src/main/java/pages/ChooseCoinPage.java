package pages;

import utilities.InitPages;
import org.openqa.selenium.WebElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChooseCoinPage extends InitPages {

    public ChooseCoinPage(IOSDriver<IOSElement> driver) {
        super(driver);
    }

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
}
