package PageObject;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelFilterpage {

	private WebDriver driver;
	private WebDriverWait wait;

	private By link1 = By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span");
	private By searchhotel = By.cssSelector("#react-autowhatever-1--item-0 > a > p > span:nth-child(2)");
	private By filterCheckbox = By.xpath("//*[@id=\"POPULAR\"]/ul/li[2]/span[1]/label/div/span");
	private By searchInput = By.xpath("//*[@id=\"_Hlisting_area\"]/div[2]/div/div[2]/div/div/input");
	private By hotelLink = By.xpath("//*[@id=\"htl_id_seo_200702151823314734\"]");
	private By hotelTitle = By.xpath("//*[@id=\"WBTH\"]/h1");

	public HotelFilterpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust wait duration as needed
	}

	public void click() {
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(link1));
		link.click();

// Wait for the next element to be visible and clickable
		WebElement filterButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/span/a/span[1]/span")));
		filterButton.click();

		WebElement searchButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hsw_search_button\"]")));
		searchButton.click();
	}

	public void filter() {
		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(filterCheckbox));
		checkbox.click();
	}

	public void searchbar() {
		WebElement input = wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		input.click();
	}

	public void searchhotel() {
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
		input.sendKeys("Lalit");

		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(searchhotel));
		search.click();
	}

	public void hotelSearch() {
		WebElement hotel = wait.until(ExpectedConditions.elementToBeClickable(hotelLink));
		hotel.click();
	}

	public void switchToNewWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String eachWindow : allWindows) {
			if (!eachWindow.equals(parentWindow)) {
				driver.switchTo().window(eachWindow);
// No need for Thread.sleep here; waits should be handled by WebDriverWait
				break;
			}
		}
	}

	public void validate() {
		String expectedTitle = "The Lalit Golf & Spa Resort";
		WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(hotelTitle));
		String actualTitle = titleElement.getText();

// Assertion for validation
		if (!actualTitle.equals(expectedTitle)) {
			throw new AssertionError("Expected title: " + expectedTitle + ", but got: " + actualTitle);
		}
	}
}