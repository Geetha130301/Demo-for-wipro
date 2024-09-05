package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.ScreenShot;

public class HolidayPage {
	private WebDriver driver;
	private WebDriverWait wait;

	private By selectedPackages = By.cssSelector("#modalpopup > div > span");
	private By clickedOn = By.cssSelector("#intervention-popup > div.intervention-close > svg");
	private By sectionSpan = By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span");
	private By bookingButton = By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[4]/span/a/span[1]/span");
	private By cancelButton = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div[2]/div/div[2]/p[2]");
	private By locationLabel = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[2]/label/span");
	private By locationInput = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]/input");
	private By locationOption = By.xpath(
			"//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]");
	private By dateSelection = By.xpath(
			"//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[4]/div/p");
	private By roomsButton = By
			.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[4]/div[3]/div[2]/button[2]");
	private By searchContainer = By.xpath("//*[@id=\"top-banner\"]/div[2]/div");
	private By searchButton = By.xpath("//*[@id=\"search_button\"]");

	public HolidayPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
	}

	public void validateTitle() {
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(sectionSpan));
		firstElement.click();

		WebElement secondElement = wait.until(ExpectedConditions.elementToBeClickable(bookingButton));
		secondElement.click();

		String expectedTitle = "Holiday Packages, Indian Holidays, Honeymoon Packages, India Tourism, Holidays India, Vacation Package : MakeMyTrip";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void selectBooking() {
		WebElement bookingElement = wait.until(ExpectedConditions.elementToBeClickable(bookingButton));
		bookingElement.click();
	}

	public void popCancel() {
		WebElement cancelElement = wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
		cancelElement.click();
	}

	public void enterLocation() {
		WebElement locationLabelElement = wait.until(ExpectedConditions.elementToBeClickable(locationLabel));
		locationLabelElement.click();

		WebElement locationInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locationInput));
		locationInputElement.sendKeys("Goa");

		WebElement locationOptionElement = wait.until(ExpectedConditions.elementToBeClickable(locationOption));
		locationOptionElement.click();
	}

	public void selectDate() {
		WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(dateSelection));
		dateElement.click();
	}

	public void selectRooms() {
		WebElement roomsElement = wait.until(ExpectedConditions.elementToBeClickable(roomsButton));
		roomsElement.click();
	}

	public void clickOnSearch() {
		WebElement searchContainerElement = wait.until(ExpectedConditions.elementToBeClickable(searchContainer));
		searchContainerElement.click();

		WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButtonElement.click();
	}

	public boolean selectedPackages() {
		boolean result = true;
		try {
			WebElement packageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedPackages));
			packageElement.click();

			WebElement closeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickedOn));
			closeElement.click();
		} catch (TimeoutException toe) {
			toe.printStackTrace();
			ScreenShot.getScreenShot("Package issue", driver);
			result = false;
		}
		return result;
	}

	public void validatePackageTitle() {
		String expectedTitle = "Holiday Packages";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
