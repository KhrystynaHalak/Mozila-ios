package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReadingListTests extends BaseTest {

    private List<String> Urls;

    @Test(groups = "a")
    public void addToReadingListTest() {

        homePage.enterURL("https://www.goodnet.org/articles/how-to-make-healthy-eating-choices-while-traveling");
        allOtherPages.clickKeyBoardGoBtn();
        String url1 = homePage.getMainSiteAddress();

        allOtherPages.markAsBookingListItem();
        allOtherPages.clickAddToBookingList();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickReadingListBtn();

        Assert.assertTrue(readingListPage.getreadingListItem(url1));

    }

    @Test(dependsOnGroups = "a")
    public void markAsRead() {

        homePage.enterURL("https://www.goodnet.org/articles/5-super-easy-fun-games-that-be-played-anytime-anywhere-list");
        allOtherPages.clickKeyBoardGoBtn();
        allOtherPages.markAsBookingListItem();
        allOtherPages.clickAddToBookingList();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickReadingListBtn();
        int previousReadBtnsCount = readingListPage.countReadBtns();

        readingListPage.clickReadBtn();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickReadingListBtn();
        int currentReadBtnsCount = readingListPage.countReadBtns();

        Assert.assertEquals(currentReadBtnsCount, previousReadBtnsCount - 1);
    }

    @Test(groups = "b")
    public void deleteAllReadingListItems() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickReadingListBtn();

        readingListPage.deleteReadingListItemBySwipe();
        int y = readingListPage.countReadingItems();
        Assert.assertEquals(y, 0);
    }

    @Test(dependsOnGroups = "b")
    public void addSeveralReadingListItems() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickReadingListBtn();

        String url2 = homePage.getMainSiteAddress();
        int readingListItemsCount = readingListPage.countReadingItems();

        Urls = new ArrayList<>();
        Urls.add("https://en.wikipedia.org/wiki/Main_Page");
        Urls.add("https://it.wikipedia.org/wiki/Pagina_principale");

        int counter = 0;
        for (String url : Urls) {
            homePage.enterURL(url);
            allOtherPages.clickKeyBoardGoBtn();
            allOtherPages.markAsBookingListItem();

            counter += allOtherPages.addToBookingListCount();

            allOtherPages.clickAddToBookingList();
        }

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickReadingListBtn();
        Assert.assertEquals(readingListItemsCount + counter, 2);

    }


}
