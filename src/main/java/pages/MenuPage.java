package pages;

import utilities.InitPages;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuPage extends InitPages {

    public MenuPage(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "עריכה")
    public WebElement editButton;

    @iOSXCUITFindBy(accessibility = "מטבעות שלי")
    public WebElement menuTitle;

    @iOSXCUITFindBy(accessibility = "plus")
    public WebElement addCurrencyButton;
}
