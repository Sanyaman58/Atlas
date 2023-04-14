package com.lighthouse.bdd;

import Constants.Constants;
import Testrail.TestListener;
import Testrail.TestRailTool;
import Utils.AllureLogger;
import Utils.SelenideConfig;
import Utils.SelenideTools;
import Utils.SendEmail;
import Utils.Waits;
import Utils.ZipUtils;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Hooks extends AllureLogger {

    private static Long runId = 1L;
    private static String caseId = "";
    private Map<String, Long> cycleNames = new HashMap<>();
    TestRailTool testRailTool;

    @Before
    public void setUpBrowser(){
        logInfo("Creating web driver configuration...");
        SelenideConfig.createBrowserConfig(System.getProperty("selenide.browser", "opera"));
        logInfo("Open browser...");
    }


//    @After(order = 1)
//    public void tearDown() {
//        Allure.addAttachment("The test is finished successfully!", new ByteArrayInputStream(((TakesScreenshot) SelenideTools.getDriver()).getScreenshotAs(OutputType.BYTES)));
//        Selenide.closeWebDriver();
//        logInfo("Web driver closed!");
//    }

    @After(order = 2)
    public void afterScenario(Scenario scenario) throws IOException {
        String scenarioName = scenario.getName();
        String testCaseIdFromScenario = scenario.getName().split(",")[0];
        Selenide.closeWebDriver();
        logInfo("Web driver closed!");
        if (Constants.SEND_RESULT_TO_TESTRAIL_CUCUMBER) {
            String caseIdSplit = "";

            for (String s : scenario.getSourceTagNames()) {
                if (s.contains("TestRail")) {
                    caseIdSplit = s.substring(10, 13);
                }
            }
            System.out.println(caseIdSplit);

            caseId = caseIdSplit;
            Map data = new HashMap();
            testRailTool = new TestRailTool();

            if (!scenario.isFailed()) {
                data.put("status_id", TestListener.TestResult.PASS.getValue());
            } else if (scenario.isFailed()) {
                data.put("status_id", TestListener.TestResult.FAIL.getValue());
            }
            setUpTestCycle();
            addTestCaseToTestRun();
            testRailTool.setTestExecutionStatus(runId, Integer.parseInt(caseId),
                    Integer.parseInt(data.get("status_id").toString()), "");
        }
    }

    private void setUpTestCycle() {
        String cycleName = Constants.TEST_RAIL_RUN_NAME;
        if (cycleNames.get(cycleName) == null && Constants.TEST_RAIL_RUN_ID == 0) {
            runId = testRailTool.createRun(Constants.PROJECT_ID);
            cycleNames.put(cycleName, testRailTool.getRunId());
        } else {
            runId = testRailTool.getRunId();
        }
    }


    private void addTestCaseToTestRun() {
        testRailTool.updateTestRun(Long.parseLong(caseId));
    }
    
    @AfterAll
	public static void after_all() {
		ZipUtils.generateZipFile();
		Waits.wait3s();
		String message = "The report is attached as zip file, download ans extract the zip file. Run the command 'Allure Serve' to view report in browser.";
		SendEmail.SendEmailNow(message);

    	System.out.println("this after all method --------------------------------------------------------------");
	}
}