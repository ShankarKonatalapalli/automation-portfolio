package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.GooglePage;
import utils.Hooks;

public class GoogleSteps {

    GooglePage googlePage = new GooglePage(Hooks.driver);

    @Given("user opens google homepage")
    public void openGoogle() {
        googlePage.openGoogle();
    }

    @When("user searches for {string}")
    public void searchKeyword(String keyword){
        googlePage.search(keyword);
    }

    @Then("search results should be displayed")
    public void verifyResults(){
        Assert.assertTrue(googlePage.isResultDisplayed());
    }

    @Then("page title should contain {string}")
    public void verifyTitle(String expected) {
        Assert.assertTrue(googlePage.getTitle().contains(expected));
    }
}
