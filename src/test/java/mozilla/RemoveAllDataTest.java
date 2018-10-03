package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData() throws InterruptedException {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        dataManagementPage.dataManagementClick();

        dataManagementPage.removeClick();
        dataManagementPage.clickOk();
        dataManagementPage.backToSettingsBtnClick();
        dataManagementPage.doneBtnClick();
        //dataManagementPage.refresh();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();

        for(int i = 0; i < historyPage.ItemInHistoryList.size(); i++){
            System.out.println(historyPage.ItemInHistoryList.get(i));
        }
        //System.out.println(historyPage.ItemInHistoryList.size());
        Assert.assertEquals(historyPage.ItemInHistoryList.size(), 0);
    }
}
