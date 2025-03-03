package com.vtiger.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.vtiger.steps",
        dryRun = false,
        plugin = {"pretty","html:target/cucumber_report.html"},
        tags = "@cl"
)
public class TestRunner {
}
