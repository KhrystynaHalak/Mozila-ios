package mozilla;

import org.testng.annotations.Test;

public class SettingsTest extends BaseTest {

    @Test
    public void Test1() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();
        settingsPage.ScrollTo(settingsPage.versionTxt);
        settingsPage.showTourBtnClick();
    }
}
