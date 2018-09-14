import mozilla.pages.HistoryPage;
import mozilla.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HistoryTest extends BaseTest {

    HomePage homePage;
    HistoryPage historyPage;

    public void setUp() {
        homePage = new HomePage();
        historyPage = new HistoryPage();
    }

    @Test
    public void deleteHistoryItem() {

        homePage.EnterURL("https://github.com/");
        homePage.EnterURL("https://www.google.com.ua/");
        homePage.HistoryBtnClick();
        int previousItemsCount = historyPage.ItemInHistoryList.size();

        historyPage.removeHistoryItem();

        int currentItemsCount = historyPage.ItemInHistoryList.size();

        Assert.assertEquals(currentItemsCount + 1, previousItemsCount);
    }

    @Test
    public void addHistoryItem() {
        homePage.EnterURL("https://github.com/");
        homePage.EnterURL("https://www.google.com.ua/");
        homePage.HistoryBtnClick();

        int previousItemsCount = historyPage.ItemInHistoryList.size();
        homePage.EnterURL("https://stackoverflow.com/");

        int currentItemsCount = historyPage.ItemInHistoryList.size();
        Assert.assertEquals(currentItemsCount - 1, previousItemsCount);
    }
}
