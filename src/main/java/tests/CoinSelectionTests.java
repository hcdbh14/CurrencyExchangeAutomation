package tests;

import appiumUtilities.Base;
import org.junit.Test;
import org.junit.After;

public class CoinSelectionTests extends Base {

    @Test
    public void scrollToLastElement() {
        click(pages.menuPage.addCurrencyButton);
        click(pages.chooseCoinPage.currencyIHave);
        scrollTo(pages.coinSelectionPage.lastListElement);
        click(pages.coinSelectionPage.lastListElement);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}
