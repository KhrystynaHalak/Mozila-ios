import org.testng.annotations.Test;


public class BookmarkTest extends BaseTest {

    @Test
    public void Test1() throws InterruptedException {

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

/*
        homePage.enterURL("rp5.ua");
        allOtherPages.keyBoardGoBtnClick();
        String expected = "Choose a city";
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        String actual = bookmarksPage.getBookmarkName();
        Assert.assertTrue(actual.contains(expected));
*/
    }
}
