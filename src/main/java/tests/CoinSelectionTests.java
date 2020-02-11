package tests;

import utilities.Base;
import org.junit.Test;
import org.junit.After;

public class CoinSelectionTests extends Base {

    @Test
    public void scrollToLastElement() {
        click(pages.menuPage.addCurrencyButton);
        click(pages.chooseCoinPage.currencyIHave);
        scrollTo(pages.coinSelectionPage.russianCoin);
        click(pages.coinSelectionPage.russianCoin);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}
