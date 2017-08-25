package io.mart.util;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(CucumberCustomRunner.class)
@CucumberOptions(
        glue = "io.mart.steps",
        features = "classpath:cucumber",
        tags = {"~@exclude", "~@failed", "~@not_impl", "~@mobile", "~@slow"},
        plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json"},
        snippets = SnippetType.UNDERSCORE,
        junit = "--allow-started-ignored"
)
public class CucumberRunnerTest {
}
//mvn clean test -Dcucumber.options="--tags @deleteAll --plugin html:target/cucumber-html-report-myReport"
