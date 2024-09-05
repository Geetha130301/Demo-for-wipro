package Stepdefinition;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Base;
//import junit.framework.Assert;
import PageObject.FlightSearchPage;

public class FlightSearchStep extends Base {

	// private WebDriver driver;
	private FlightSearchPage page;

	@Given("I am on the MakeMyTrip flight search page")
	public void i_am_on_the_make_my_trip_flight_search_page() {
		try {
			Hooks.extentTest.info("Opening the Browser");
			openBrowser();
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("Browser opened successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open Browser");
		}

	}

	@When("I click on cancel button")
	public void i_click_on_cancel_button() {
		try {
			page.cancelButton();
			Hooks.extentTest.info("Click on cancel Button");
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("Clicked successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to click");
		}

	}

	@When("I enter location at From")
	public void i_enter_location_at_from() {
		try {
			page.clickDate();
			Hooks.extentTest.info("Enter From Location");
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("Entered  successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to Enter From location");
		}

	}

	@When("I enter location at To")
	public void i_enter_location_at_to() {
		try {
			page.clickToDate();
			Hooks.extentTest.info("Enter To Location");
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("Entered  successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to Enter To location");
		}

	}

	@When("I select Departure date")
	public void i_select_departure_date() {
		try {
			page.departureDate();
			Hooks.extentTest.info("Select Departure date");
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("Selected  successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select Date");
		}

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		try {
			page.clickSearchBar();
			Hooks.extentTest.info("Click on searchbar");
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("clicked on searchbar successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to click on searchbar");
		}

	}

	@Then("I validate with title")
	public void i_validate_with_title() {
		try {
			page.validateTitle();
			Hooks.extentTest.info("Validate the Page title");
			page = new FlightSearchPage(driver);
			Hooks.extentTest.pass("Title of the Page is Correct");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Title of the Page is InCorrect");
		}

	}
}