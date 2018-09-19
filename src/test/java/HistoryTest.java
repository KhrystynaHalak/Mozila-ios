import mozilla.pages.AllOtherPages;
import mozilla.pages.HistoryPage;
import mozilla.pages.HomePage;
import mozilla.pages.TabToolbarMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HistoryTest extends BaseTest {

    private HomePage homePage;
    private HistoryPage historyPage;
    private AllOtherPages allOtherPages;
    private TabToolbarMenuPage tabToolbarMenuPage;

    public void setUp() {
        homePage = new HomePage();
        historyPage = new HistoryPage();
        allOtherPages = new AllOtherPages();
        tabToolbarMenuPage = new TabToolbarMenuPage();

    }

    @Test
    public void deleteHistoryItem() {

        setUp();
        homePage.enterURL("https://github.com/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.historyBtnClick();
        int previousItemsCount = historyPage.ItemInHistoryList.size();

        historyPage.removeHistoryItem();

        int currentItemsCount = historyPage.ItemInHistoryList.size();

        Assert.assertEquals(currentItemsCount + 1, previousItemsCount);
    }

    @Test
    public void addHistoryItem() {
        setUp();

        homePage.enterURL("https://github.com/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        homePage.historyBtnClick();

        int previousItemsCount = historyPage.ItemInHistoryList.size();
        homePage.enterURL("https://stackoverflow.com/");

        int currentItemsCount = historyPage.ItemInHistoryList.size();
        Assert.assertEquals(currentItemsCount - 1, previousItemsCount);
    }
}
