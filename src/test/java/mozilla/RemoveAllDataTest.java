package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData() throws InterruptedException {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        settingsPage.ScrollTo("DataManagmentBtn");
        dataManagementPage.dataManagementClick();

        dataManagementPage.removeClick();
        dataManagementPage.clickOk();
        dataManagementPage.backToSettingsBtnClick();
        dataManagementPage.doneBtnClick();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();

        for(int i = 0; i < historyPage.ItemInHistoryList().size(); i++){
            System.out.println(historyPage.ItemInHistoryList().get(i));
        }
        Assert.assertEquals(historyPage.ItemInHistoryList().size(), 0);
    }

    @Test
    public void removeDataWithAllOptionsEnabled() {

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        settingsPage.ScrollTo("DataManagmentBtn");
        dataManagementPage.dataManagementClick();

        dataManagementPage.selectAllRadioBtns();

        Assert.assertTrue(dataManagementPage.checkIfAllEnabled());
    }
}
