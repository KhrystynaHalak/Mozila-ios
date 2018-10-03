package mozilla;

import org.testng.annotations.Test;

public class SettingsTest extends BaseTest {

    @Test
    public void ScrollingTest() throws InterruptedException {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        settingsPage.ScrollTo(settingsPage.getPasscodeForLoginsBtn());

        //Passcode for Logins
        settingsPage.getPasscodeForLoginsBtn().click();
        Thread.sleep(2000);
        settingsPage.returnToSettingsBtnClick();

        settingsPage.ScrollTo(settingsPage.getNewTabBtn());

        //New Tab
        settingsPage.getNewTabBtn().click();
        Thread.sleep(2000);
        settingsPage.returnToSettingsBtnClick();

        settingsPage.ScrollTo(settingsPage.getTrackingProtectionBtn());

        //Tracking Protection
        settingsPage.getTrackingProtectionBtn().click();
        Thread.sleep(2000);
        settingsPage.returnToSettingsBtnClick();

        //Show Tour
        settingsPage.ScrollTo(settingsPage.getShowTourBtn());
        settingsPage.getShowTourBtn().click();
        Thread.sleep(5000);
        /*settingsPage.getSearchBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getNewTabBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getHomepageBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getMailAppBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getDisplayBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getBlockPopUpRdBtn().click();
        settingsPage.getSaveLoginsRfBtn().click();
        settingsPage.ScrollTo(settingsPage.getOpenCopiedLinksRdBtn());
        settingsPage.getOpenCopiedLinksRdBtn().click();
        settingsPage.getLoginBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getPasscodeForLoginsBtn().click();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.getPasscodeForLoginsBtn().click();
        settingsPage.returnToSettingsBtnClick();*/

    }

    @Test
    public void Test2() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();
        settingsPage.ScrollTo(settingsPage.getVersionTxt());
        settingsPage.showTourBtnClick();
    }
}
