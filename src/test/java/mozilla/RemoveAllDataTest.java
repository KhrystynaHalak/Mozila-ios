package mozilla;

import org.testng.annotations.Test;

public class RemoveAllDataTest extends BaseTest {

    @Test
    public void deleteData(){
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();

        allOtherPages.scrollDownAPage();
        dataManagementPage.dataManagementClick();
        dataManagementPage.removeClick();
    }
}
