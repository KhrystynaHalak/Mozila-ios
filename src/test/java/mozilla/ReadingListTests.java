package mozilla;

import org.springframework.core.annotation.Order;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReadingListTests extends BaseTest {

    private List<String> Urls;

    @Test(groups = "a")
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

    @Test(dependsOnGroups = "a")
    public void markAsRead() {

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

        Assert.assertEquals(currentReadBtnsCount, previousReadBtnsCount - 1);
    }

    @Test(groups = "b")
    public void deleteAllReadingListItems() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();

        readingListPage.deleteReadingListItemBySwipe();
        int y = readingListPage.readingItemsCount();
        Assert.assertEquals(y, 0);
    }

    @Test(dependsOnGroups = "b")
    public void addSeveralReadingListItems() {
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();

        String url2 = homePage.getMainSiteAdress();
        int readingListItemsCount = readingListPage.readingItemsCount();

        Urls = new ArrayList<>();
        Urls.add("https://en.wikipedia.org/wiki/Main_Page");
        Urls.add("https://it.wikipedia.org/wiki/Pagina_principale");

        int counter = 0;
        for (String url : Urls) {
            homePage.enterURL(url);
            allOtherPages.keyBoardGoBtnClick();
            allOtherPages.markAsBookingListItem();

            counter += allOtherPages.addToBookingListCount();

            //System.out.println(allOtherPages.addToBookingListCount());
            //System.out.println(counter);
            allOtherPages.addToBookingListClick();
        }

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();
        Assert.assertEquals(readingListItemsCount + counter, 2);

    }


}
