package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HistoryTest extends BaseTest {

    @Test
    public void deleteHistoryItem() {
        homePage.enterURL("https://github.com/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.cleanURL();
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();
        int previousItemsCount = historyPage.ItemInHistoryList().size();

        historyPage.removeHistoryItem();

        int currentItemsCount = historyPage.ItemInHistoryList().size();

        Assert.assertEquals(currentItemsCount, previousItemsCount - 1);
    }

    @Test
    public void addHistoryItem() {
        homePage.enterURL("https://github.com/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.cleanURL();
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();

        int previousItemsCount = historyPage.ItemInHistoryList().size();
        homePage.enterURL("https://9gag.com");
        allOtherPages.keyBoardGoBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();

        int currentItemsCount = historyPage.ItemInHistoryList().size();
        Assert.assertEquals(currentItemsCount - 1, previousItemsCount);
    }
}
