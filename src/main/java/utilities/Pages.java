package utilities;

import pages.ChooseCoinPage;
import pages.CoinSelectionPage;
import pages.MenuPage;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Pages {

    public MenuPage menuPage;
    public ChooseCoinPage chooseCoinPage;
    public CoinSelectionPage coinSelectionPage;

    Pages(IOSDriver<IOSElement> driver) {
        this.chooseCoinPage = new ChooseCoinPage(driver);
        this.coinSelectionPage = new CoinSelectionPage(driver);
        this.menuPage = new MenuPage(driver);
    }
}
