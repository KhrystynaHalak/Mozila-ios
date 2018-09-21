import org.testng.annotations.Test;

public class BookmarkTest extends BaseTest {

    @Test
    public void Test1() {

    /*
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.topSitesBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.downloadsBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.settingsBtnClick();
        settingsPage.doneLeftUpCornerBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.syncBtnClick();
        syncPage.doneLeftUpCornerBtnClick();

        homePage.downloadsBtnClick();
        homePage.fauvoritesBtnClick();
        homePage.historyBtnClick();
        homePage.readingListBtnClick();
        homePage.topSitesBtnClick();
        homePage.enterURL("rp5.ua");
        allOtherPages.keyBoardGoBtnClick();
        navigationButtons.moveBackBtnClick();
        navigationButtons.moveForwardBtnClick();
        navigationButtons.refreshBtnClick();
        navigationButtons.tabsBtnClick();
        tabsPage.privateBrowsingBtn();
        tabsPage.addNewTabBtnClick();
        homePage.enterURL("github.com");
        allOtherPages.keyBoardGoBtnClick();
        navigationButtons.tabsBtnClick();
        tabsPage.privateBrowsingBtn();
        tabsPage.deleteTabBtnClick();
        tabsPage.closeAllTabsBtn();
        navigationButtons.tabsBtnClick();
        tabsPage.privateBrowsingBtn();
        tabsPage.deleteTabBtnClick();
        tabsPage.closeAllTabsBtn();
*/
        homePage.enterURL("rp5.ua");
        allOtherPages.keyBoardGoBtnClick();
        String expected = "Choose a city";
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        String actual =  bookmarksPage.getBookmarksNamesList().get(0);

        Assert.assertEquals(actual, expected);

    }
}
