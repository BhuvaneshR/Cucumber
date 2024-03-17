package com.test.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome=true,
        features="src/test/resources/features",
        glue="com.test.stepdef.API",
        plugin= {"pretty","html:target/cucumber-reports"}
//tags="@getList"
)
public class TestRunner1 {

}