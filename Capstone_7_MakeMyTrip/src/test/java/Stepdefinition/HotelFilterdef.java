package Stepdefinition;

import com.aventstack.extentreports.Status;

import PageObject.HotelFilterpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Base;

public class HotelFilterdef extends Base {
	private HotelFilterpage page;
	

@Given("I am on the Hotel search page")
public void i_am_on_the_hotel_search_page() {
   



	
		try {
			Hooks.extentTest.info("openinig the hotel search page");
			openBrowser();
			page = new HotelFilterpage(driver);
			page.click();
			Hooks.extentTest.pass("Sucessfully open the hotel search page");

		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open the hotel search page");
		}

	}

	@When("I select the filters")
	public void i_select_the_filters() {
		try {
			Hooks.extentTest.info("Selecting the hotels filters");

			page = new HotelFilterpage(driver);
			page.filter();
			Hooks.extentTest.pass("Sucessfully selected the filters");

		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select the filters ");
		}

	}

	@Then("I click on the searchbar")
	public void i_click_on_the_searchbar() {
		try {
			Hooks.extentTest.info("open the search bar");

			page = new HotelFilterpage(driver);
			page.searchbar();
			Hooks.extentTest.pass("Sucessfully open the hotel search bar");

		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open the hotel search bar");
		}

	}


@Then("I enter the hotel name")
public void i_enter_the_hotel_name() {

		try {
			Hooks.extentTest.info("Searching the hotel name");

			page = new HotelFilterpage(driver);
			page.searchhotel();
			Hooks.extentTest.pass("Sucessfully select the hotel");

		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select the hotel");
		}

	}


@Then("I select the hotel")
public void i_select_the_hotel() {

		try {
			Hooks.extentTest.info("selecting the hotel");

			page = new HotelFilterpage(driver);
			page.hotelSearch();
			Hooks.extentTest.pass("Sucessfully select the hotel");

		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select the hotel");
		}

	}

@Then("Iam on hotel pages")
public void iam_on_hotel_pages() {
		try {
			Hooks.extentTest.info("openinig the hotel page");

			page = new HotelFilterpage(driver);
			Hooks.extentTest.pass("Sucessfully open the hotel page");

		} catch (Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open the hotel page");
		}

	}

}
