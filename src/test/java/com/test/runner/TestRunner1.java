package com.test.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome=true,
        features="src/test/resources/features",
        glue="com.test.stepdef",
        plugin= {"pretty","html:target/cucumber-reports.html"} //This generates HTMl report of the Test Execution
        //plugin= {"pretty","json:target/cucumber-reports.json"} //This generates json report of the Test Execution
        ,tags="@Challenge1"
)
public class TestRunner1 {

}