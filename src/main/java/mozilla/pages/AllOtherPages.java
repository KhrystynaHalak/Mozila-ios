package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOtherPages {

    //Elements

    @FindBy(id = "TabLocationView.pageOptionsButton")
    public WebElement threeDotsBtn;

    @FindBy(id = "action_share")
    public WebElement ShareActionBtn;

    @FindBy(id = "menu-Bookmark")
    public WebElement BookmarkThisPageBtn;

    @FindBy(id = "menu-Send-to-Device")
    public WebElement SendToDeviceBtn;

    @FindBy(id = "menu-Copy-Link")
    public WebElement CopyAdressBtn;

    @FindBy(id = "menu-FindInPage")
    public WebElement FindInPageBtn;

    @FindBy(id = "menu-RequestDesktopSite")
    public WebElement RequestDesktopSiteBtn;

    @FindBy(id = "action_pln")
    public WebElement PinToTopSitesBtn;

    @FindBy(id = "ProtonMenu.close")
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
