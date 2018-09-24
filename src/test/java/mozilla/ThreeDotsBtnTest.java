package mozilla;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ThreeDotsBtnTest extends BaseTest {

    @Test
    public void checkSharePageBtnTest() {
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        allOtherPages.sharePageWithBtnClick();
        assertTrue(shareWithPage.getPage().isDisplayed());
        assertTrue(shareWithPage.getRemindersBtn().isDisplayed());
        assertTrue(shareWithPage.getMoreBtn().isDisplayed());
        assertTrue(shareWithPage.getCopyBtn().isDisplayed());
        assertTrue(shareWithPage.getPrintBtn().isDisplayed());
        assertTrue(shareWithPage.getCreateBtn().isDisplayed());
        assertTrue(shareWithPage.getMoreBtn2().isDisplayed());
        assertTrue(shareWithPage.getCloseBtn().isDisplayed());
        shareWithPage.getCloseBtn().click();
    }

    @Test
    public void addBookmarkTest() {
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        navigationButtons.toolbarMenuBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        //List<WebElement> list = bookmarksPage.getBookmarksList();
    }
}
