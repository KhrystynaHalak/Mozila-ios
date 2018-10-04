package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SettingsTest extends BaseTest {

    @Test
    public void ScrollingTest() throws InterruptedException, IOException {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        settingsPage.ScrollTo("PasscodeForLoginsBtn");

        //Passcode for Logins
        settingsPage.passcodeForLoginsBtnClick();
        String currentMenu = settingsPage.getMenuNameHeaderText();
        Assert.assertEquals(currentMenu, "Passcode For Logins");
        settingsPage.returnToSettingsBtnClick();

        //settingsPage.ScrollTo("NewTabBtn");

       /* //New Tab
        settingsPage.newTabBtnClick();
        settingsPage.returnToSettingsBtnClick();
        settingsPage.ScrollTo("TrackingProtectionBtn");
*/
/*        //Tracking Protection
        settingsPage.trackingProtectionBtnClick();
        settingsPage.returnToSettingsBtnClick();*/

        //Search
        settingsPage.ScrollTo("NewTabBtn");
        settingsPage.newTabBtnClick();
        currentMenu = settingsPage.getMenuNameHeaderText();
        Assert.assertEquals(currentMenu, "New Tab");
        settingsPage.returnToSettingsBtnClick();


        //Show Tour
        settingsPage.ScrollTo("ShowTourBtn");
        settingsPage.showTourBtnClick();
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
        settingsPage.ScrollTo("ShowTourBtn");
        settingsPage.showTourBtnClick();
    }
}
