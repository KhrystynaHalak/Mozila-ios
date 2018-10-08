package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickSettingsBtn();

        settingsPage.ScrollTo("DataManagmentBtn");
        dataManagementPage.clickDataManagement();

        dataManagementPage.clickRemove();
        dataManagementPage.clickOk();
        dataManagementPage.clickBackToSettingsBtn();
        dataManagementPage.clickDoneBtn();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickHistoryBtn();

        for(int i = 0; i < historyPage.ItemInHistoryList().size(); i++){
            System.out.println(historyPage.ItemInHistoryList().get(i));
        }
        Assert.assertEquals(historyPage.ItemInHistoryList().size(), 0);
    }

    @Test
    public void removeDataWithAllOptionsEnabled() {

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickSettingsBtn();

        settingsPage.ScrollTo("DataManagmentBtn");
        dataManagementPage.clickDataManagement();

        dataManagementPage.selectAllRadioBtns();

        Assert.assertTrue(dataManagementPage.checkIfAllEnabled());
    }
}
