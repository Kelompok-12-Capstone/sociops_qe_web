package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LoginPage;

public class DashboardSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    @When("I am on the dashboard")
    public void onTheDashboard() {
        loginPage.inputEmail("roleuser@example.com");
        loginPage.inputPassword("12345678");
        loginPage.clickLoginButton();
        dashboardPage.validateOnDashboard();
    }

    @When("I click customer button")
    public void clickCustomerButton() {
        dashboardPage.clickCustomer();
    }

    @Then("I should redirected to customer page")
    public void checkGoToCustomerPage() {
        dashboardPage.validateOnCustomerPage();
    }

}
