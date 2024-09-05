package Stepdefinition;

import com.aventstack.extentreports.Status;
import PageObject.HolidayFilterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Base;

public class HolidayFilterStep extends Base {
	private HolidayFilterPage page;

	@Given("I click on cancel bar")
	public void i_click_on_cancel_bar() {
		try {
			Hooks.extentTest.info("i click on cancel button");
			openBrowser();
			page = new HolidayFilterPage(driver);
			page.clickOnCancel();
			Hooks.extentTest.pass("Sucessfullyopened");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to click ");
		}
	}

	@When("I click on holiday package")
	public void i_click_on_holiday_package() {
		try {
			Hooks.extentTest.info("Opening the holiday package");
			page = new HolidayFilterPage(driver);
			page.clickOnHolidayPackage();
			Hooks.extentTest.pass("Sucessfullyopened holiday package");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open browser");
		}
	}

	@When("I click on search bar")
	public void i_click_on_search_bar() {
		try {
			Hooks.extentTest.info("clicked on search button");
			page = new HolidayFilterPage(driver);
			page.clickOnSearch();
			Hooks.extentTest.pass("Sucessfullyopened search button");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open search button");
		}
	}

	@When("I click on other cancel bar")
	public void i_click_on_other_cancel_bar() {
		try {
			Hooks.extentTest.info("clicked on close button");
			page = new HolidayFilterPage(driver);
			page.clickOnCancelT();
			Hooks.extentTest.pass("Sucessfullyopened");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to click close button");
		}
	}

	@When("I click on duration filter")
	public void i_click_on_duration_filter() {
		try {
			Hooks.extentTest.info("clicked on duration filter");
			page = new HolidayFilterPage(driver);
			page.nights();
			Hooks.extentTest.pass("Sucessfullyopened");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to click duration filter");
		}
	}

	@Then("I should see a list of packages available in locations")
	public void i_should_see_a_list_of_packages_available_in_locations() {
		try {
			Hooks.extentTest.info("should see the list of packages");
			page = new HolidayFilterPage(driver);
			page.validateTitle();
			Hooks.extentTest.pass("Sucessfullyopened");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to see the packages");
		}

	}

}
