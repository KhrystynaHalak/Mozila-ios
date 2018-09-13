package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOtherPages {

    //Elements

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

    public void SharePageWithBtnClick(){
        ShareActionBtn.click();
    }

    public void BookmarkThisPageBtnClick(){
        BookmarkThisPageBtn.click();
    }

    public void SendToDeviceBtnClick(){
        SendToDeviceBtn.click();
    }

    public void CopyAdressBtnClick(){
        CopyAdressBtn.click();
    }

    public void FindInPageBtnClick(){
        FindInPageBtn.click();
    }

    public void RequestDesktopSiteBtnClick(){
        RequestDesktopSiteBtn.click();
    }

    public void PinToTopSitesBtnClick(){
        PinToTopSitesBtn.click();
    }

    public void CloseBtnClick() {
        CloseBtn.click();
    }

}
