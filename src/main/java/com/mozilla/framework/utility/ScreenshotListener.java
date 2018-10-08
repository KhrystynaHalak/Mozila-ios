package com.mozilla.framework.utility;

import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class ScreenshotListener extends TestListenerAdapter {

    public String composeTestName(ITestResult result) {
        //File file = Driver.getInstance().getDriver().getScreenshotAs(OutputType.FILE);
        StringBuffer completeFileName = new StringBuffer();

        completeFileName.append(result.getTestClass().getRealClass().getSimpleName());
        completeFileName.append("_");
        completeFileName.append(result.getName());

        Object[] parameters = result.getParameters();

        for (Object par : parameters) {
            completeFileName.append("_");

            completeFileName.append(par);
        }

        return completeFileName.toString().replace(":", "-");

        /*try {
            FileUtils.copyFile(file, new File("myScreenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Class cl = result.getTestClass().getRealClass();
        try{
            File file = Driver.getInstance().getDriver().getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File(composeTestName(result) + ".png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
