package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadTest extends BaseTest {

    @Test
    public void downloadTest(){

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickDownloadsBtn();
        int prevousSize = downloadsPage.countDownloadedItems();

        homePage.enterURL("https://www2.le.ac.uk/Members/davidwickins/old/test.docx/view");
        allOtherPages.clickKeyBoardGoBtn();

        downloadsPage.clickDocToDownload();
        downloadsPage.clickDownloadLinkBtn();

        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.clickDownloadsBtn();

        downloadsPage.clickDownloadNowBtn();
        downloadsPage.clickDownloadAppearingBtn();

        int currentSize = downloadsPage.countDownloadedItems();

        Assert.assertEquals(currentSize, prevousSize + 1);
    }
}
