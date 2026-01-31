package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GooglePage;
import utils.Hooks;

public class GoogleSteps {

    GooglePage googlePage = new GooglePage(Hooks.driver);

    @Given("user opens google homepage")
    public void openGoogle() {
        googlePage.openGoogle();
    }

    @Then("page title should contain Google")
    public void verifyTitle() {
        Assert.assertTrue(googlePage.getTitle().contains("Google"));
    }
}
