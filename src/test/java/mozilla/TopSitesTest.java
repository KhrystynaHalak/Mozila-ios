package mozilla;

import mozilla.pages.BasePage;
import org.testng.annotations.Test;

public class TopSitesTest extends BaseTest {

    @Test
    public void Test1() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.topSitesBtnClick();
        System.out.println(topSitesPage.getTopSitesList());

        System.out.println(topSitesPage.getTopSitesList().size());

    }

}
