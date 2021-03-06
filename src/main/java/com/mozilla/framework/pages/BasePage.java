package com.mozilla.framework.pages;

import com.mozilla.framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;


public class BasePage {

    protected Wait<IOSDriver> wait;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getInstance().getDriver()), this);
    }

    public void waitElementToClick(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitForPageLoad() {
        new WebDriverWait(Driver.getInstance().getDriver(), 60).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        //log.info("Wait for page load");
    }

    private FluentWait getWait(int timeout) {
        return new FluentWait<>(Driver.getInstance().getDriver())
                .withTimeout(timeout, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
    }

    public String getPageTitle() {
        String title = Driver.getInstance().getDriver().getTitle();
        //log.info("Title of current page: " + title);
        return title;
    }




}
