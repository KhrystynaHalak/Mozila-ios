package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData(){
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        //allOtherPages.scrollDownAPage();
        dataManagementPage.dataManagementClick();

        dataManagementPage.scrollDownAPage();
        dataManagementPage.removeClick();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();

        Assert.assertEquals(historyPage.ItemInHistoryList.size(), 0);
    }
}
