package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReadingListTests extends BaseTest {

    private List<String> Urls;

    @Test
    public void addToReadingListTest() {

        homePage.enterURL("https://www.goodnet.org/articles/how-to-make-healthy-eating-choices-while-traveling");
        allOtherPages.keyBoardGoBtnClick();
        String url1 = homePage.getMainSiteAdress();

        allOtherPages.markAsBookingListItem();
        allOtherPages.addToBookingListClick();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();

        Assert.assertTrue(readingListPage.getreadingListItem(url1));

    }

    @Test
    public void markasRead() {

        homePage.enterURL("https://www.goodnet.org/articles/5-super-easy-fun-games-that-be-played-anytime-anywhere-list");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.markAsBookingListItem();
        allOtherPages.addToBookingListClick();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();
        int previousReadBtnsCount = readingListPage.readBtnsCount();

        readingListPage.readBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();
        int currentReadBtnsCount = readingListPage.readBtnsCount();

        try {
            Assert.assertEquals(currentReadBtnsCount, previousReadBtnsCount - 1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void deleteAllReadingListItems() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();

        readingListPage.deleteReadingListItemBySwipe();
        int y = readingListPage.readingItemsCount();
        Assert.assertEquals(y, 0);
    }

    @Test
    public void addSeveralReadingListItems() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();

        String url2 = homePage.getMainSiteAdress();
        int readingListItemsCount = readingListPage.readingItemsCount();

        Urls = new ArrayList<>();
        Urls.add("https://en.wikipedia.org/wiki/Main_Page");
        Urls.add("https://pl.wikipedia.org/wiki/Wikipedia:Strona_główna");

        int counter = 0;
        for (String url : Urls) {
            homePage.enterURL(url);
            allOtherPages.keyBoardGoBtnClick();
            allOtherPages.markAsBookingListItem();

            counter = allOtherPages.addToBookingListCount();
            allOtherPages.addToBookingListClick();
            ++counter;
        }

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();
        Assert.assertEquals(readingListItemsCount + counter, 2);

    }


}
