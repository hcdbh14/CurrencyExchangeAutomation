import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ServerConnect {
    static IOSDriver<IOSElement> driver;

    public static IOSDriver<IOSElement> setUp()  {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("platformVersion", "13.3");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleId", "kenny.CurrencyExchange");
        capabilities.setCapability("udid", "5EE89D49-FEA1-4771-9201-6C407BFD480C");
        capabilities.setCapability("app",
                "/Users/kennykurochkin/Library/Developer/Xcode/DerivedData/CurrencyExchange-hdukkrajbgrqrpbqsmmientuztpc/Build/Products/Debug-iphonesimulator/CurrencyExchange.app");

        URL url;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver<IOSElement>(url, capabilities);
        } catch (MalformedURLException e) {
            //
        }
        System.out.println("Application is launched");
        return driver;
    }
}