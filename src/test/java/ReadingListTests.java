import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadingListTests extends BaseTest{

    @Test

    public void addToReadingListTest (){

        homePage.enterURL("https://www.goodnet.org/articles/how-to-make-healthy-eating-choices-while-traveling");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.markAsBookingListItem();
        allOtherPages.addToBookingListClick();


        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.readingListBtnClick();
        int actualReadingListItemCount = 1;
        int expectedReadingListItemCount = readingListPage.readingListItemsCount();
        Assert.assertEquals(expectedReadingListItemCount, actualReadingListItemCount);

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
        int currentReadBtnsCount = readingListPage.readBtnsCount();

        try {
            Assert.assertEquals(currentReadBtnsCount, previousReadBtnsCount - 1);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}