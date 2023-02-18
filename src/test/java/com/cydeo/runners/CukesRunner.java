package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


plugin = "html:target/cucumber-reports.html",
features = "src/test/resources/features",
glue = "com/cydeo/step_definitions",
dryRun = false,
tags= "@scientists or @ceos",
publish = true
)



public class CukesRunner {}  // this class has power to control
// the Project through the annotation @RunWith(Cucumber.class) and @CucumberOptions()

