package PageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FlightSearchPage {
	WebDriver driver;
	WebDriverWait wait;

	private By click1 = By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span");
	private By fromInput = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/label");
	private By fromTextBox = By
			.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input");
	private By fromSuggestion = By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/p[1]/span[1]");
	private By toInput = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/label");
	private By toTextBox = By.xpath(
			"//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input");
	private By toSuggestion = By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/p[1]/span[1]/span");
	private By departureDate = By.xpath(
			"//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[2]/div");
	private By searchBar = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[2]/p/a");

	public FlightSearchPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
	}

	public void cancelButton() {
		WebElement clickElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(click1));
		clickElement1.click();
	}

	public void clickDate() {
		WebElement fromInputElement = wait.until(ExpectedConditions.elementToBeClickable(fromInput));
		fromInputElement.click();
		WebElement fromTextBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(fromTextBox));
		fromTextBoxElement.sendKeys("chennai");
		WebElement fromSuggestionElement = wait.until(ExpectedConditions.elementToBeClickable(fromSuggestion));
		fromSuggestionElement.click();
	}

	public void clickToDate() {
		WebElement toInputElement = wait.until(ExpectedConditions.elementToBeClickable(toInput));
		toInputElement.click();
		WebElement toTextBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(toTextBox));
		toTextBoxElement.sendKeys("hyd");
		WebElement toSuggestionElement = wait.until(ExpectedConditions.elementToBeClickable(toSuggestion));
		toSuggestionElement.click();
	}

	public void departureDate() {
		WebElement departureDateElement = wait.until(ExpectedConditions.elementToBeClickable(departureDate));
		departureDateElement.click();
	}

	public void clickSearchBar() {
		WebElement searchBarElement = wait.until(ExpectedConditions.elementToBeClickable(searchBar));
		searchBarElement.click();
	}

	public boolean validateTitle() {
		String actResult = "MakeMyTrip";
		String expResult = driver.getTitle();
		Assert.assertEquals(expResult, actResult);
		return expResult.equals(actResult);
	}

}