package mozilla.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOtherPages extends HomePage {

    // Init Page
    public AllOtherPages(IOSDriver driver) {
        super(driver);
    }

    //Elements

    @FindBy(xpath = "//*[@name='TabLocationView.pageOptionsButton']")
    public WebElement threeDotsBtn;

    @FindBy(xpath = "//*[@name='action_share']")
    public WebElement ShareActionBtn;

    @FindBy(xpath = "//*[@name='Bookmark This Page']")
    public WebElement BookmarkThisPageBtn;

    @FindBy(xpath = "//*[@name='Send to Device']")
    public WebElement SendToDeviceBtn;

    @FindBy(xpath = "//*[@name='Copy Address']")
    public WebElement CopyAdressBtn;

    @FindBy(xpath = "//*[@name='Find in Page']")
    public WebElement FindInPageBtn;

    @FindBy(xpath = "//*[@name='Request Desktop Site']")
    public WebElement RequestDesktopSiteBtn;

    @FindBy(xpath = "//*[@name='Pin to Top Sites']")
    public WebElement PinToTopSitesBtn;

    @FindBy(xpath = "//*[@name='PhotonMenu.close']")
    public WebElement CloseBtn;


    //Actions

    public void threeDotsBtnClick(){
        threeDotsBtn.click();
    }

    public void sharePageWithBtnClick(){
        ShareActionBtn.click();
    }

    public void bookmarkThisPageBtnClick(){
        BookmarkThisPageBtn.click();
    }

    public void sendToDeviceBtnClick(){
        SendToDeviceBtn.click();
    }

    public void copyAdressBtnClick(){
        CopyAdressBtn.click();
    }

    public void findInPageBtnClick(){
        FindInPageBtn.click();
    }

    public void requestDesktopSiteBtnClick(){
        RequestDesktopSiteBtn.click();
    }

    public void pinToTopSitesBtnClick(){
        PinToTopSitesBtn.click();
    }

    public void closeBtnClick() {
        CloseBtn.click();
    }

}
