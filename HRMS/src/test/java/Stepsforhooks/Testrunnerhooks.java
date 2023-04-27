package Stepsforhooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\QSPYDER\\HRMS\\src\\test\\resources\\HooksDemo\\Hooks.feature",
glue= {"Stepsforhooks"},
monochrome= true,
stepNotifications = true,
plugin={"pretty", "html:target/HtmlReports.html",
		"json:target/jsonReports/report.json",
		"junit:target/junitReports/report.xml"}

		)

public class Testrunnerhooks {

}
