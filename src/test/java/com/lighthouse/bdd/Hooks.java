package com.lighthouse.bdd;

import Utils.AllureLogger;
import Utils.SelenideConfig;
import Utils.SelenideTools;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.ByteArrayInputStream;

public class Hooks extends AllureLogger {

    @Before
    public void setUpBrowser(){
        logInfo("Creating web driver configuration...");
        SelenideConfig.createBrowserConfig(System.getProperty("selenide.browser", "chrome"));
        logInfo("Open browser...");
    }


    @After(order = 1)
    public void tearDown() {
        Allure.addAttachment("The test is finished successfully!", new ByteArrayInputStream(((TakesScreenshot) SelenideTools.getDriver()).getScreenshotAs(OutputType.BYTES)));
        Selenide.closeWebDriver();
        logInfo("Web driver closed!");
    }
}