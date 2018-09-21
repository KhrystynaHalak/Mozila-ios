import org.testng.Assert;
import org.testng.annotations.Test;

public class TabToolbarTests extends BaseTest {

    @Test
    public void RadioButtonsTest() {

        homePage.tabToolbarBtnClick();
        String HideImgStatus = tabToolbarMenuPage.getHideImgStatus();
        String NightModeStatus = tabToolbarMenuPage.getNightModeStatus();
        String TrackingProtectionStatus = tabToolbarMenuPage.getTrackingProtectionStatus();
        System.out.println("Status before test : ");
        System.out.println(TrackingProtectionStatus);
        System.out.println(HideImgStatus);
        System.out.println(NightModeStatus);

        tabToolbarMenuPage.enableTrackingProtection();
        tabToolbarMenuPage.enableHideImg();
        tabToolbarMenuPage.enableNightMode();

        Assert.assertEquals(tabToolbarMenuPage.getTrackingProtectionStatus(), "enabled");
        Assert.assertEquals(tabToolbarMenuPage.getHideImgStatus(), "enabled");
        Assert.assertEquals(tabToolbarMenuPage.getNightModeStatus(), "enabled");

        tabToolbarMenuPage.disableTrackingProtection();
        tabToolbarMenuPage.disableHideImg();
        tabToolbarMenuPage.disableNightMode();

        Assert.assertEquals(tabToolbarMenuPage.getTrackingProtectionStatus(), "disabled");
        Assert.assertEquals(tabToolbarMenuPage.getHideImgStatus(), "disabled");
        Assert.assertEquals(tabToolbarMenuPage.getNightModeStatus(), "disabled");

        HideImgStatus = tabToolbarMenuPage.getHideImgStatus();
        NightModeStatus = tabToolbarMenuPage.getNightModeStatus();
        TrackingProtectionStatus = tabToolbarMenuPage.getTrackingProtectionStatus();
        System.out.println("Status after test statuses: ");
        System.out.println(TrackingProtectionStatus);
        System.out.println(HideImgStatus);
        System.out.println(NightModeStatus);
    }
}