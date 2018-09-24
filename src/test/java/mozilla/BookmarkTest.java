package mozilla;
import org.testng.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookmarkTest extends BaseTest {

    @Test
    public void Test1() {

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        int startingValue = bookmarksPage.getBookmarksNamesList().size();
        homePage.enterURL("rp5.ua");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        homePage.enterURL("google.com.ua");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        homePage.enterURL("youtube.com");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        int actual = bookmarksPage.getBookmarksNamesList().size();
        Assert.assertEquals(actual, 3 + startingValue);
        bookmarksPage.removeBookmarkItem(3);
        bookmarksPage.removeBookmarkItem(2);
        bookmarksPage.removeBookmarkItem(1);
        actual = bookmarksPage.getBookmarksNamesList().size();
        Assert.assertEquals(actual, 0 + startingValue);

    }

    @Test
    public void Test2() {
        homePage.enterURL("apple.com");
        allOtherPages.keyBoardGoBtnClick();
        String expected = "Apple";
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        String actual = bookmarksPage.getBookmarksNamesList().get(0);

        Assert.assertEquals(actual, expected);
    }

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
}




