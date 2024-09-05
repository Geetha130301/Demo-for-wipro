package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HotelPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    By cancelButton = By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span");
    By locationInput = By.cssSelector("#top-banner > div.minContainer > div > div.widgetSection.appendBottom40 > div.makeFlex.primaryTraveler > div > div.hsw_inner > div.hsw_inputBox.selectHtlCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > div.hw__searchInputWrapper > input");
    By locationSuggestion = By.cssSelector("#react-autowhatever-1-section-0-item-0 > div > div > div > p");
    By checkInDate = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[2]");
    By checkOutDate = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[4]");
    By roomsButton = By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[2]/button");
    By searchButton = By.id("hsw_search_button");

    public void enterHotel() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(cancelButton)).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/span/a/span[1]/span"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void location() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/label"))).click();
            WebElement locationInputField = wait.until(ExpectedConditions.elementToBeClickable(locationInput));
            locationInputField.sendKeys("delhi");
            wait.until(ExpectedConditions.elementToBeClickable(locationSuggestion)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkInAndCheckOut() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(checkInDate)).click();
            wait.until(ExpectedConditions.elementToBeClickable(checkOutDate)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rooms() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(roomsButton)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void search() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

