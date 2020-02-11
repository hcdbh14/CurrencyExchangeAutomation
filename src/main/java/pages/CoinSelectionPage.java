package pages;

import utilities.InitPages;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CoinSelectionPage extends InitPages {

    public CoinSelectionPage(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "דירהאם")
    public WebElement moroccanCoin;

    @iOSXCUITFindBy(accessibility = "פסו ארגנטינאי")
    public WebElement argentinianCoin;

    @iOSXCUITFindBy(accessibility = "דולר האוסטרלי")
    public WebElement australianCoin;

    @iOSXCUITFindBy(accessibility = "לב בולגרי")
    public WebElement bulgarianCoin;

    @iOSXCUITFindBy(accessibility = "ריאל ברזילאי")
    public WebElement brazilianCoin;

    @iOSXCUITFindBy(accessibility = "דולר בהאמי")
    public WebElement bahamianCoin;

    @iOSXCUITFindBy(accessibility = "דולר קנדי")
    public WebElement canadianCoin;

    @iOSXCUITFindBy(accessibility = "פרנק שוויצרי")
    public WebElement swissCoin;

    @iOSXCUITFindBy(accessibility = "פזו צ'יליאני")
    public WebElement chileanCoin;

    @iOSXCUITFindBy(accessibility = "רנמינבי")
    public WebElement chineseCoin;

    @iOSXCUITFindBy(accessibility = "פזו קולומביאני")
    public WebElement colombianCoin;

    @iOSXCUITFindBy(accessibility = "קורונה צ'כית")
    public WebElement czechCoin;

    @iOSXCUITFindBy(accessibility = "כתר דני")
    public WebElement danishCoin;

    @iOSXCUITFindBy(accessibility = "פזו דומניקני")
    public WebElement dominicanCoin;

    @iOSXCUITFindBy(accessibility = "לירה מצרית")
    public WebElement egyptianCoin;

    @iOSXCUITFindBy(accessibility = "אירו")
    public WebElement euroCoin;

    @iOSXCUITFindBy(accessibility = "דולר פיג'י")
    public WebElement fijianCoin;

    @iOSXCUITFindBy(accessibility = "לירה שטרלינג")
    public WebElement britishCoin;

    @iOSXCUITFindBy(accessibility = "קצאל")
    public WebElement guatemalanCoin;

    @iOSXCUITFindBy(accessibility = "דולר הונג קונג")
    public WebElement hongKongCoin;

    @iOSXCUITFindBy(accessibility = "קונה קרואטי")
    public WebElement croatianCoin;

    @iOSXCUITFindBy(accessibility = "פורינט הונגרי")
    public WebElement hungarianCoin;

    @iOSXCUITFindBy(accessibility = "רופיה אינדונזית")
    public WebElement indonesianCoin;

    @iOSXCUITFindBy(accessibility = "שקל חדש")
    public WebElement israeliCoin;

    @iOSXCUITFindBy(accessibility = "רופי הודי")
    public WebElement indianCoin;

    @iOSXCUITFindBy(accessibility = "כתר איסלנדי")
    public WebElement icelandicCoin;

    @iOSXCUITFindBy(accessibility = "ין יפני")
    public WebElement japaneseCoin;

    @iOSXCUITFindBy(accessibility = "וון דרום קוריאני")
    public WebElement southKoreanCoin;

    @iOSXCUITFindBy(accessibility = "טנגה קזחסטני")
    public WebElement kazakhstanCoin;

    @iOSXCUITFindBy(accessibility = "פסו מקסיקני")
    public WebElement mexicanCoin;

    @iOSXCUITFindBy(accessibility = "רינגיט מלזי")
    public WebElement malaysianCoin;

    @iOSXCUITFindBy(accessibility = "כתר נורבגי")
    public WebElement norwegianCoin;

    @iOSXCUITFindBy(accessibility = "דולר ניו זילנדי")
    public WebElement newZealandCoin;

    @iOSXCUITFindBy(accessibility = "בלבואה")
    public WebElement panamanianCoin;

    @iOSXCUITFindBy(accessibility = "נואבו סול פרואני")
    public WebElement peruvianCoin;

    @iOSXCUITFindBy(accessibility = "פזו פיליפיני")
    public WebElement filipinoCoin;

    @iOSXCUITFindBy(accessibility = "רופיה פקיסטנית")
    public WebElement pakistaniCoin;

    @iOSXCUITFindBy(accessibility = "זלוטי פולני")
    public WebElement polishCoin;

    @iOSXCUITFindBy(accessibility = "פרגוואי גוארני")
    public WebElement paraguayanCoin;

    @iOSXCUITFindBy(accessibility = "לאו רומני")
    public WebElement romanianCoin;

    @iOSXCUITFindBy(accessibility = "רובל רוסי")
    public WebElement russianCoin;

    @iOSXCUITFindBy(accessibility = "ריאל סעודי")
    public WebElement SaudiCoin;

    @iOSXCUITFindBy(accessibility = "כתר שוודי")
    public WebElement swedishCoin;

    @iOSXCUITFindBy(accessibility = "דולר סינגפורי")
    public WebElement singaporeCoin;

    @iOSXCUITFindBy(accessibility = "באט תאילנדי")
    public WebElement thaiCoin;

    @iOSXCUITFindBy(accessibility = "לירה טורקית")
    public WebElement turkishCoin;

    @iOSXCUITFindBy(accessibility = "דולר טאיוואני חדש")
    public WebElement taiwanCoin;

    @iOSXCUITFindBy(accessibility = "הריבניה")
    public WebElement ukrainianCoin;

    @iOSXCUITFindBy(accessibility = "דולר אמריקני")
    public WebElement americanCoin;

    @iOSXCUITFindBy(accessibility = "פזו אורוגוואי")
    public WebElement uruguayanCoin;

    @iOSXCUITFindBy(accessibility = "דונג ויאטנמי")
    public WebElement vietnameseCoin;

    @iOSXCUITFindBy(accessibility = "ראנד דרום אפריקאי")
    public WebElement southAfricanCoin;
}
