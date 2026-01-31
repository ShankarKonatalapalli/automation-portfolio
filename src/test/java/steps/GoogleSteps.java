package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSteps {

    WebDriver driver;

    @Given("user opens google homepage")
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Then("page title should contain Google")
    public void verifyTitle() {
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }
}
