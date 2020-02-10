package pages;

import appiumUtilities.InitPages;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CoinSelectionPage extends InitPages {

    public CoinSelectionPage(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "רובל רוסי")
    public WebElement lastListElement;

}
