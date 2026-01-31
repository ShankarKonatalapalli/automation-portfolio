package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePage {

    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.name("q");
    By resultsStats = By.id("result-stats");

    public GooglePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openGoogle(){
        driver.get("https://www.google.com");
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void search(String keyword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox))
                .sendKeys(keyword + Keys.ENTER);
    }

    public boolean isResultDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultsStats))
                .isDisplayed();
    }
}
