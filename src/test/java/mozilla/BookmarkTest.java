package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class BookmarkTest extends BaseTest {

    @Test
    public void Test1() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        int initialValue = bookmarksPage.getBookmarksNamesList().size();
        List<String> initialListOfBookmarks = bookmarksPage.getBookmarksNamesList();
        System.out.println(initialListOfBookmarks);
        homePage.enterURL("ex.ua");
        //homePage.pressGobutton();
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.bookmarkThisPageBtnClick();
        String currentBookmarkName = "This Connection is Untrusted";
        if (initialListOfBookmarks.contains(currentBookmarkName)) {
            initialValue -= 1;
        }
        homePage.enterURL("github.com");
        //homePage.pressGobutton();
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.bookmarkThisPageBtnClick();
        currentBookmarkName = "The world’s leading software development platform · GitHub";
        if (initialListOfBookmarks.contains(currentBookmarkName)) {
            initialValue -= 1;
        }
        homePage.enterURL("youtube.com");
        //homePage.pressGobutton();
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.bookmarkThisPageBtnClick();
        currentBookmarkName = "Home - YouTube";
        if (initialListOfBookmarks.contains(currentBookmarkName)) {
            initialValue -= 1;
        }
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        int actual = bookmarksPage.getBookmarksNamesList().size();
        System.out.println(bookmarksPage.getBookmarksNamesList());
        Assert.assertEquals(actual, initialValue + 3);
    }

    @Test
    public void Test2() {
        String expectedBookmarkName = "Apple";
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        int initialSize = bookmarksPage.getBookmarksNamesList().size();
        int bookmarkPosition = 0;
        if (bookmarksPage.getBookmarksNamesList().contains(expectedBookmarkName)) {
            bookmarkPosition = bookmarksPage.getBookmarksNamesList().indexOf(expectedBookmarkName);
        }
        else {
            homePage.enterURL("apple.com");
            allOtherPages.keyBoardGoBtnClick();
            allOtherPages.threeDotsBtnClick();
            threeDotsPage.bookmarkThisPageBtnClick();
            bookmarkPosition = initialSize;
        }
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        String actualBookmarkName = bookmarksPage.getBookmarksNamesList().get(bookmarkPosition);

        Assert.assertEquals(actualBookmarkName, expectedBookmarkName);
    }

    @Test
    public void Test3() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        int bookmarksQty = bookmarksPage.getBookmarksNamesList().size();
        if (bookmarksQty > 0) {
            for (int i = 0; i < bookmarksQty; i++) {
                bookmarksPage.removeBookmarkItem(1);
            }
        }
        int actual = bookmarksPage.getBookmarksNamesList().size();
        Assert.assertEquals(actual, 0);

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




