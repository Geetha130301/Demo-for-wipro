package Stepdefinition;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


import PageObject.HolidayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Base;
import Utils.ScreenShot;

public class Holidaydef extends Base{
	private HolidayPage page;
	@Given("I am on the MakeMyTrip holiday package search page")
	public void i_am_on_the_make_my_trip_holiday_package_search_page() {
		try {
			Hooks.extentTest.info("Opening the Browser");
			openBrowser();
			page=new HolidayPage(driver);
			Hooks.extentTest.pass("Browser opened successfully");
		}catch(Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to open Browser");
		}
		
	}

	@When("I click on popup cancel button")
	public void i_click_on_popup_cancel_button() {
		try {
			Hooks.extentTest.info("Click on cancel Button");
			page=new HolidayPage(driver);
			page.validateTitle();
			page.popCancel();
			Hooks.extentTest.pass("Clicked successfully");
		}catch(Exception e) {
			
			 //String path=ScreenShot.getScreenShot("Pop", driver);
			 //Hooks.extentTest.pass("Screenshot taken",MediaEntityBuilder.createScreenCaptureFromBase64String(path).build());
			Hooks.extentTest.log(Status.FAIL, "Failed to click");
		}
	    
	    
	}

	@When("I enter locations at the location")
	public void i_enter_locations_at_the_location() {
		try {
			Hooks.extentTest.info("Enter the Location");
			page=new HolidayPage(driver);
			page.enterLocation();
			Hooks.extentTest.pass("Entered  successfully");
		}catch(Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to Enter the location");
		}
		
		
	}

	@When("I select the departure date")
	public void i_select_the_departure_date() {
		try {
			Hooks.extentTest.info("Select Departure date");
			page=new HolidayPage(driver);
			page.selectDate();
			Hooks.extentTest.pass("Selected  successfully");
		}catch(Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select Date");
		}
		
	}

	@When("I select the rooms and guests")
	public void i_select_the_rooms_and_guests() {
		try {
			Hooks.extentTest.info("Select Num of Rooms");
			page=new HolidayPage(driver);
			page.selectRooms();
			Hooks.extentTest.pass("Selected  successfully");
		}catch(Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Failed to select Num of Rooms");
		}
		
		
	}

	@When("I click on the searh package button")
	public void i_click_on_the_searh_package_button() {
		try {
			Hooks.extentTest.info("click on search bar");
			page=new HolidayPage(driver);
			page.clickOnSearch();
			Hooks.extentTest.pass("clicked  successfully");
		}catch(Exception e) {
			ScreenShot.getScreenShot("Package issue", driver);
			Hooks.extentTest.log(Status.FAIL, "Failed to click search bar");
		}
		
		
	}

	@Then("I should see a list of packages available in location")
	public void i_should_see_a_list_of_packages_available_in_location() {
		try {
			Hooks.extentTest.info("List Of Packages");
			page=new HolidayPage(driver);
			page.selectedPackages();
			page.validatePackageTitle();
			Hooks.extentTest.pass("Displayed");
		}catch(Exception e) {
			Hooks.extentTest.log(Status.FAIL, "Not Displayed");
		}
		
		
	}

}