package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.LandingPage;

public class LoginSteps {

    @Steps
    LandingPage landingPage = new LandingPage();
    @Steps
    Dashboard dashboard =new Dashboard();
    @Given("I am on the landing page")
    public void onTheLandingPage() {
        landingPage.openPage();
        landingPage.validateOnLandingPage();
    }
    @When("I input valid email")
    public void inputValidUsername() {
        landingPage.inputUserName("nailulizah@example.com");
    }
    @And("I input valid password")
    public void inputValidPassword() {
        landingPage.inputPassword("12345678");
    }
    @When("I input invalid email")
    public void inputInvalidUsername() {
        landingPage.inputUserName("customer1");
    }
    @And("I input invalid password")
    public void inputInvalidPassword() {
        landingPage.inputPassword("XsFXekWKs7XA");
    }
    @And("I click signin button")
    public void clickSigninButton() {
        landingPage.clickSigninButton();
    }
    @Then("I still on landing page")
    public void onTheLoginPage() {
        landingPage.validateOnLandingPage();
    }
    @Then("I am success log in")
    public void onTheDashboard() {
        dashboard.validateOnDashboard();
    }
}
