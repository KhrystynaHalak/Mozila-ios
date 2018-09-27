package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TopSitesTest extends BaseTest {

    @Test
    public void RemovingFromTopSitesTest() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.topSitesBtnClick();
        List<String> initialNamesList = topSitesPage.getTopSitesNamesList();
        int initialSize = initialNamesList.size();
        System.out.println(initialNamesList);
        topSitesPage.longPressOnTopSiteIco(1);
        topSitesPage.removeTopSite();
        topSitesPage.longPressOnTopSiteIco(1);
        topSitesPage.removeTopSite();
        List<String> finalNamesList = topSitesPage.getTopSitesNamesList();
        int finalSize = finalNamesList.size();
        System.out.println(finalNamesList);
        Assert.assertTrue(initialSize > finalSize);

    }

    @Test
    public void AddToTopSitesTest() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.topSitesBtnClick();
        List<String> initialNamesList = topSitesPage.getTopSitesNamesList();
        int initialSize = initialNamesList.size();
        System.out.println(initialNamesList);
        homePage.enterURL("rp5.ua");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.pinToTopSitesBtnClick();
        allOtherPages.enterURL("apple.com");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.pinToTopSitesBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.topSitesBtnClick();
        List<String> finalNamesList = topSitesPage.getTopSitesNamesList();
        int finalSize = finalNamesList.size();
        System.out.println(finalNamesList);
        Assert.assertTrue(initialSize < finalSize);

    }
}
