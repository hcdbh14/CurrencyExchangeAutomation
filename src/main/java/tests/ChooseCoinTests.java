package tests;

import appiumUtilities.Base;
import org.junit.Test;
import org.junit.After;

public class ChooseCoinTests extends Base {

    @Test
    public void verifyChooseCoinElements() {
        click(pages.menuPage.addCurrencyButton);
        elementToBeVisible(pages.chooseCoinPage.downArrow);
        elementToBeVisible(pages.chooseCoinPage.currencyIHave);
        elementToBeVisible(pages.chooseCoinPage.currencyIWant);
        elementToClickable(pages.chooseCoinPage.closeButton);
        elementToBeVisible(pages.chooseCoinPage.pickTitle);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}
