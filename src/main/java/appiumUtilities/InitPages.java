package appiumUtilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class InitPages {

    public InitPages(IOSDriver<IOSElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
