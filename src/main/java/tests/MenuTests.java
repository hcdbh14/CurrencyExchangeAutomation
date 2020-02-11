package tests;

import utilities.Base;
import org.junit.Test;
import org.junit.After;

public class MenuTests extends Base {

    @Test
    public void verifyIntroPageElements() {
        elementToClickable(pages.menuPage.addCurrencyButton);
        elementToClickable(pages.menuPage.editButton);
        elementToBeVisible(pages.menuPage.menuTitle);
    }

    @After
    public void afterTest() {

        driver.closeApp();
    }
}