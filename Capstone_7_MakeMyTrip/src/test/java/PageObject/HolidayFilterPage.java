package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolidayFilterPage {
	WebDriver driver;
	WebDriverWait wait;

	private By selectedPackaging = By.cssSelector("#modalpopup > div > span");
	private By clickedOnTwo = By.cssSelector("#intervention-popup > div.intervention-close > svg");
	private By cancelButton = By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span");
	private By holidayPackageButton = By
			.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[4]/span/a/span[1]/span");
	private By searchButton = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div[2]/div/div[2]/p[2]");
	private By departureDateButton = By.xpath("//*[@id=\"departureDate\"]/p");
	private By dateSelector = By.xpath(
			"//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[5]/div/p");
	private By confirmDateButton = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[4]/div/p");
	private By nextButton = By
			.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div[1]/div[4]/div[3]/div[2]/button[2]");
	private By searchButtonFinal = By.xpath("//*[@id=\"search_button\"]");
	private By nightsFilter = By.xpath("//*[@id=\"filter\"]/div[3]/div[1]/div[2]/div/div[1]/div/div[5]");
	private By nightOption = By.xpath("//*[@id=\"collectionList\"]/ul/li[2]/span[1]");

	public HolidayFilterPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30)); // Adjusted wait time
	}

	public void clickOnCancel() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButton)).click();
	}

	public void clickOnHolidayPackage() {
		wait.until(ExpectedConditions.elementToBeClickable(holidayPackageButton)).click();
	}

	public void clickOnSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(departureDateButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(dateSelector)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDateButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchButtonFinal)).click();
	}

	public void clickOnCancelT() {

		WebElement clickElement = wait.until(ExpectedConditions.visibilityOfElementLocated(selectedPackaging));
		clickElement.click();
		WebElement clicked = wait.until(ExpectedConditions.visibilityOfElementLocated(clickedOnTwo));
		clicked.click();

	}

	public void nights() {
		wait.until(ExpectedConditions.elementToBeClickable(nightsFilter)).click();
		wait.until(ExpectedConditions.elementToBeClickable(nightOption)).click();
	}

	public void validateTitle() {
		String actResult = "Holiday Packages";
		String expResult = driver.getTitle();
		Assert.assertEquals(expResult, actResult);
	}
}
