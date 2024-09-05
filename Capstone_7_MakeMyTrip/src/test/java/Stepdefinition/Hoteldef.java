package Stepdefinition;

import com.aventstack.extentreports.Status;
import PageObject.HotelPage;
import Utils.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hoteldef extends Base {

	private HotelPage page;

	@Given("Iam on the MakeMyTrip hotels search pages")
	public void iam_on_the_make_my_trip_hotels_search_pages() {
		try {
			Hooks.extentTest.info("Opening the Browser");
			openBrowser();
			page = new HotelPage(driver);
			page.enterHotel();
			Hooks.extentTest.log(Status.PASS, "Browser opened successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open Browser");
		}

	}

	@When("I click on Adv cancel button")
	public void i_click_on_adv_cancel_button() {

	}

	@When("I enter place at the location")
	public void i_enter_place_at_the_location() {
		try {
			Hooks.extentTest.info("Enter the location");
			page = new HotelPage(driver);
			page.location();
			Hooks.extentTest.log(Status.PASS, "Entered location successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to enter location");
		}

	}

	@When("I select the check-in date  and chechout date")
	public void i_select_the_check_in_date_and_chechout_date() {
		try {
			Hooks.extentTest.info("Enter the checkin and checkout date");
			page = new HotelPage(driver);
			page.checkInAndCheckOut();
			Hooks.extentTest.log(Status.PASS, "Entered date successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to enter date");
		}

	}

	@When("I select the num of guests")
	public void i_select_the_num_of_guests() {
		try {
			Hooks.extentTest.info("Select the No of guests");
			page = new HotelPage(driver);
			page.rooms();
			Hooks.extentTest.log(Status.PASS, "selected successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select");
		}

	}

	@Then("I clicked on the search Hotels element button")
	public void i_clicked_on_the_search_hotels_element_button() {
		try {
			Hooks.extentTest.info("Click on search hotels ");
			page = new HotelPage(driver);
			page.search();
			Hooks.extentTest.log(Status.PASS, "clicked on search bar successfully");
		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to click");
		}

	}

}
