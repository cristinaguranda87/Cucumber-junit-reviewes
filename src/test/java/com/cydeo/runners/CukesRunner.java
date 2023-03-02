package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


plugin = {"html:target/cucumber-reports.html",        //  to create reports
           "rerun:target/rerun.txt",
           "me.jvt.cucumber.report.PrettyReports:target/cucumber"  }, // to run Maven Cucumber Reporting },

features = "src/test/resources/features",         // right click on feature and copy path from content root
glue = "com/cydeo/step_definitions",             // in order to define our step definitions:right click on step_definitiona copy path  from source root
dryRun = true,                                 // in order to get snippets
tags= "@wip",
publish = true                                 // to generate public link for reports
)

public class CukesRunner {}  // this class has power to control
// the Project through the annotation @RunWith(Cucumber.class) and @CucumberOptions()

