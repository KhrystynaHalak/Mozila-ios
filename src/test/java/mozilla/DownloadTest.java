package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadTest extends BaseTest {

    @Test
    public void downloadTest(){

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.downloadsBtnClick();
        int prevousSize = downloadsPage.downloadedItemsCount();

        homePage.enterURL("https://www2.le.ac.uk/Members/davidwickins/old/test.docx/view");
        allOtherPages.keyBoardGoBtnClick();

        downloadsPage.docToDownloadClick();
        downloadsPage.downloadLinkBtnClick();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.downloadsBtnClick();

        downloadsPage.downloadNowBtnClick();
        downloadsPage.downloadAppearingBtnClick();

        int currentSize = downloadsPage.downloadedItemsCount();

        Assert.assertEquals(currentSize, prevousSize + 1);
    }
}
