package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData() throws InterruptedException {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        dataManagementPage.dataManagementClick();

        Thread.sleep(3000);
        dataManagementPage.removeClick();
        Thread.sleep(3000);
        dataManagementPage.clickOk();
        Thread.sleep(3000);
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
