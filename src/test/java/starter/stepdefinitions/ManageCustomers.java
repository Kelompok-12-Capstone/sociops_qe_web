package starter.stepdefinitions;

import com.sun.org.apache.bcel.internal.generic.LAND;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.LandingPage;

public class ManageCustomers {

    @Steps
    Dashboard dashboard = new Dashboard();
    @Steps
    LandingPage landingPage = new LandingPage();

    @Given("I am on the dashboard")
    public void onTheDashboard(){
        dashboard.validateOnDashboard();
    }
    @When("I click customer Icon")
    public void clickCustomerIcon(){
        dashboard.clickCustomerIcon();
    }
    @And("I click community request")
    public void clickCommunityRequest(){
        dashboard.clickCommunityRequestIcon();
    }
    @Then("I can see community request list")
    public void seeCommunityRequest(){
        dashboard.validatePage();
    }
    @And("I click back button")
    public void clickBackButton(){
        dashboard.clickBackButton();
    }
    @Given("I am on the dashboard customer")
    public void onTheDashboardCustomer(){
        dashboard.validateOnCustomerPage();
    }
    @When("I click User account list")
    public void clickUserAccountList(){
        dashboard.clickUserAccountList();
    }
    @Then("I can see user account list")
    public void seeUserAccountList(){
        dashboard.validatePage();
    }
    @When("I click user fundraising list")
    public void clickFundraisingList(){
        dashboard.clickUserFundraising();
    }
    @Then("I can see user fundraising list")
    public void seeUserFundraisingList(){
        dashboard.validatePage();
    }
    @When("I click user volunteer list")
    public void clickVolunteerList(){
        dashboard.clickUserVolunteer();
    }
    @Then("I can see volunteer list")
    public void seeVolunteerList(){
        dashboard.validatePage();
    }

}
