package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BookmarkTest extends BaseTest {

    @Test
    public void Test1() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickBookmarksBtn();
        int initialValue = bookmarksPage.getBookmarksNamesList().size();
        List<String> initialListOfBookmarks = bookmarksPage.getBookmarksNamesList();
        System.out.println(initialListOfBookmarks);
        homePage.enterURL("ex.ua");
        //homePage.pressGobutton();
        allOtherPages.clickKeyBoardGoBtn();
        allOtherPages.clickThreeDotsBtn();
        threeDotsPage.clickBookmarkThisPageBtn();
        String currentBookmarkName = "This Connection is Untrusted";
        if (initialListOfBookmarks.contains(currentBookmarkName)) {
            initialValue -= 1;
        }
        homePage.enterURL("github.com");
        //homePage.pressGobutton();
        allOtherPages.clickKeyBoardGoBtn();
        allOtherPages.clickThreeDotsBtn();
        threeDotsPage.clickBookmarkThisPageBtn();
        currentBookmarkName = "The world’s leading software development platform · GitHub";
        if (initialListOfBookmarks.contains(currentBookmarkName)) {
            initialValue -= 1;
        }
        homePage.enterURL("youtube.com");
        //homePage.pressGobutton();
        allOtherPages.clickKeyBoardGoBtn();
        allOtherPages.clickThreeDotsBtn();
        threeDotsPage.clickBookmarkThisPageBtn();
        currentBookmarkName = "Home - YouTube";
        if (initialListOfBookmarks.contains(currentBookmarkName)) {
            initialValue -= 1;
        }
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.clickBookmarksBtn();
        int actual = bookmarksPage.getBookmarksNamesList().size();
        System.out.println(bookmarksPage.getBookmarksNamesList());
        Assert.assertEquals(actual, initialValue + 3);
    }

    @Test
    public void Test2() {
        String expectedBookmarkName = "Apple";
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.clickBookmarksBtn();
        int initialSize = bookmarksPage.getBookmarksNamesList().size();
        int bookmarkPosition = 0;
        if (bookmarksPage.getBookmarksNamesList().contains(expectedBookmarkName)) {
            bookmarkPosition = bookmarksPage.getBookmarksNamesList().indexOf(expectedBookmarkName);
        }
        else {
            homePage.enterURL("apple.com");
            allOtherPages.clickKeyBoardGoBtn();
            allOtherPages.clickThreeDotsBtn();
            threeDotsPage.clickBookmarkThisPageBtn();
            bookmarkPosition = initialSize;
        }
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.clickBookmarksBtn();
        String actualBookmarkName = bookmarksPage.getBookmarksNamesList().get(bookmarkPosition);

        Assert.assertEquals(actualBookmarkName, expectedBookmarkName);
    }

    @Test
    public void Test3() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickBookmarksBtn();
        int bookmarksQty = bookmarksPage.getBookmarksNamesList().size();
        if (bookmarksQty > 0) {
            for (int i = 0; i < bookmarksQty; i++) {
                bookmarksPage.removeBookmarkItem(1);
            }
        }
        int actual = bookmarksPage.getBookmarksNamesList().size();
        Assert.assertEquals(actual, 0);

    }
}




