package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.ManageNewsPage;

public class manageNewsStep {
    @Steps
    LoginPage loginPage;
    @Steps
    ManageNewsPage manageNewsPage;


    //Verify admin writes news//
    @Given("I am on the web browser page")
    public void openWebSocio(){
        loginPage.openPage();
    }
    @When ("I log in as an admin")
    public void loginAdmin(){
        loginPage.tryLogin1("john@doe.com","JohnDoe123");
        loginPage.clickToLogin();
    }
    @And ("I click on \"Manage News\"")
    public void goToNews(){
        manageNewsPage.openNews();
    }
    @And ("I click on the \"Write News\" or \"Create New News\" button")
    public void createNews(){
        manageNewsPage.clickTulis();
    }
    @And ("I enter the title, news content, and news author")
    public void fillNews(){
        manageNewsPage.validateNews();
    }
    @And ("I click on the \"Save\" or \"Publish\" button")
    public void actionButton(){
        manageNewsPage.validateNews();
    }
    @Then ("the news article should be successfully created and published")
    public void succesCreateNews(){
        manageNewsPage.validateNews();
    }

    //Check the news list view that has been created//
    @And ("I click on the \"News List\" button")
    public void clickListNews(){
        manageNewsPage.openListBerita();
    }
    @Then ("the list of news articles should be displayed")
    public void listShowup(){
        manageNewsPage.validateListBerita();
    }
}
