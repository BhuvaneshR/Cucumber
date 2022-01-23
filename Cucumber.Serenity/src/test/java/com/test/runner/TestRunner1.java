package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome=true,
features="src/test/resources/features",
glue="com.test.stepdef",
//plugin= {"pretty"},
tags="@getList"
)
public class TestRunner1 {

}
