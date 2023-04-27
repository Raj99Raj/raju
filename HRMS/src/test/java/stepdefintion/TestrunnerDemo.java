package stepdefintion;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\QSPYDER\\HRMS\\src\\test\\resources\\Features\\logindemo.feature", glue= {"stepdefintion"},
monochrome= true,
stepNotifications = true,
tags= {"@Smoke"},
//tags= {"@Smoke or @Regression"},
//tags= {"@Regression and not @Smoke"},
plugin={"pretty", "html:target/HtmlReports.html","json:target/jsonReports/report.json","junit:target/junitReports/report.xml"}

		)
public class TestrunnerDemo {

}
