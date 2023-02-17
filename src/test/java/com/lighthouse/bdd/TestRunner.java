package com.lighthouse.bdd;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
//        tags="@C100",
        features = "src/test/resources/features",
        plugin = {"html:cucumber-reports/html/report.html",
                "json:cucumber-html-reports/cucumber.json",
                "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
                return super.scenarios();}
}