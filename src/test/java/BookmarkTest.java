import framework.utility.Driver;
import mozilla.pages.AllOtherPages;
import mozilla.pages.BookmarksPage;
import mozilla.pages.HomePage;
import mozilla.pages.TabToolbarMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.print.Book;

public class BookmarkTest extends BaseTest{

        HomePage homePage = new HomePage();
        TabToolbarMenuPage tabToolbarMenuPage = new TabToolbarMenuPage();
        BookmarksPage bookmarksPage = new BookmarksPage();
        AllOtherPages allOtherPages = new AllOtherPages();

    @Test
    public void Test1() {

        homePage.enterURL("rp5.ua");
        String expected = "Choose a city";
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        String actual = bookmarksPage.getBookmarkName();
        Assert.assertTrue(actual.contains(expected));

    }



}
