package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickSettingsBtn();

        dataManagementPage.dataManagementClick();

        dataManagementPage.removeClick();
        dataManagementPage.clickOk();
        dataManagementPage.backToSettingsBtnClick();
        dataManagementPage.doneBtnClick();
        //dataManagementPage.refresh();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickHistoryBtn();

        for(int i = 0; i < historyPage.ItemInHistoryList.size(); i++){
            System.out.println(historyPage.ItemInHistoryList.get(i));
        }
        //System.out.println(historyPage.ItemInHistoryList.size());
        Assert.assertEquals(historyPage.ItemInHistoryList.size(), 0);
    }
}
