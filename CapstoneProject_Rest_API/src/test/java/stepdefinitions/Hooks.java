package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utils.Reporter;

public class Hooks {

    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
   
   
   
    @BeforeAll
    public static void setUp() {
        extentReport = Reporter.generateExtentReport("jsonplaceholder.pypicode.com");
    }
   
    @AfterAll
    public static void tearDown() {
        extentReport.flush();
    }
   
}
