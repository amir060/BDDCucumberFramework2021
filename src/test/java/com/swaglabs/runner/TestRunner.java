package com.swaglabs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Plugin for reports
        plugin = {"pretty", "html:target/site/cucumber-pretty.html","json:target/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue={"com/swaglabs/stepdefinitions"},
        features = {"src/test/resources/features"},
        tags="@checkout",

        dryRun = true,
        monochrome = false
)
public class TestRunner {
}
