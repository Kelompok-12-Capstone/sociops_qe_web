package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    /// Positive

    @Given("I am on the sociops login page")
    public void onTheLoginPage() {
        loginPage.openPage();
    }

    @And("I type correct email")
    public void inputEmail() {
        loginPage.inputEmail("john@doe.com");
    }

    @And("I type correct password")
    public void inputPassword() {
        loginPage.inputPassword("JohnDoe123");
    }

    @When("I click on the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should redirected to sociops dashboard")
    public void validateOnHomePage() {
        dashboardPage.validateOnDashboard();
    }

    /// Negative

    @And("I type incorrect password")
    public void inputIncorrectPassword() {
        loginPage.inputPassword("99999999");
    }

    @And("I type nothing in password field")
    public void inputNothingPassword() {
        loginPage.inputPassword("");
    }

    @And("I type password less than 8 char")
    public void inputPassLessThan8Char() {
        loginPage.inputPassword("1234567");
    }

    @And("I type incorrect email")
    public void inputIncorrectEmail() {
        loginPage.inputEmail("rolando@example.com");
    }

    @And("I type invalid email")
    public void inputInvalidEmail() {
        loginPage.inputEmail("roleuser");
    }

    @And("I type nothing in email field")
    public void inputNothingEmail() {
        loginPage.inputEmail("");
    }

    @And("I type email less than 2 char")
    public void inputEmailLessThan2Char() {
        loginPage.inputEmail("a");
    }

    @Then("I should see incorrect alert notification")
    public void checkIncorrectAlert() {
        loginPage.checkIncorrectAlert();
    }

    @Then("I should see invalid warning email")
    public void checkWarningInvalidEmail() {
        loginPage.checkWarningInvalidEmail();
    }
    
    @Then("I should see empty warning password")
    public void checkWarningEmptyPassword() {
        loginPage.checkWarningEmptyPassword();
    }

    @Then("I should see empty warning email")
    public void checkWarningEmptyEmail() {
        loginPage.checkWarningEmptyEmail();
    }

    @Then("I should see warning char password")
    public void checkWarningCharPassword() {
        loginPage.checkWarningCharPassword();
    }

    @Then("I should see warning char email")
    public void checkWarningCharEmail() {
        loginPage.checkWarningCharEmail();
    }   

}
