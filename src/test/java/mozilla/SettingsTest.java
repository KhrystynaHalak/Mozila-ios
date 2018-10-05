package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SettingsTest extends BaseTest {

    @Test
    public void ScrollingTest() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        //Scroll to Passcode for Logins
        settingsPage.ScrollTo("PasscodeForLoginsBtn");

        //Check if scrolled correctly
        settingsPage.passcodeForLoginsBtnClick();
        String currentMenu = settingsPage.getMenuNameHeaderText();
        Assert.assertEquals(currentMenu, "Passcode For Logins");
        settingsPage.returnToSettingsBtnClick();

        //Scroll to New Tab
        settingsPage.ScrollTo("NewTabBtn");

        //Check if scrolled correctly
        settingsPage.newTabBtnClick();
        currentMenu = settingsPage.getMenuNameHeaderText();
        Assert.assertEquals(currentMenu, "New Tab");
        settingsPage.returnToSettingsBtnClick();

    }

}
