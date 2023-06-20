package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.FundPage;
import starter.pages.LoginPage;
public class fundaraisingStep {
    LoginPage loginPage;
    FundPage fundPage;

    //Request for program submission//
    @And ("I navigated to the \"Manage Fundraising\" or \"Request Program Submission\" page")
    public void openManageFund(){
        fundPage.toFundFitur();
    }
    @And ("I check the display list of submitted programs")
    public void  displayListFund(){
        fundPage.dashboardFunda();
    }
    @And ("I click on \"Submit Program\"")
    public void sumbittedProg(){
        fundPage.clickPengajuan();
    }
    @And ("I check the list of approved program submissions")
    public void listSubmitted(){
        fundPage.listPengajuanfund();
    }
    @Then ("the program submission should be successfully submitted")
    public void validateListSubmit(){
        fundPage.listPengajuanfund();
    }

    //List of Programs//
    @And ("I navigate to the \"Manage Fundraising\" or \"Program List\" page")
    public void openManageFunda(){
        fundPage.toFundFitur();
        fundPage.dashboardFunda();
    }
    @And ("I click on the \"Program List\"")
    public void programListFunda(){
        fundPage.listProgramfUND();
    }
    @Then ("the program list should be displayed")
    public void validateListFunda(){
        fundPage.validateListProgFund();
    }

    //Transactions of users participating in this program//
    @And ("I navigate to the \"Manage Fundraising\" or \"Transaction History\" page")
    public void fundaFeatur(){
        fundPage.toFundFitur();
        fundPage.dashboardFunda();
    }
    @And ("I select the program for which I want to see the transaction history")
    public void toRiwayat(){
        fundPage.RiwayatProg();
    }
    @And ("I view the transaction history of the program")
    public void viewRiwayat(){
        fundPage.listRiwayat();
    }
    @Then ("the transaction history for the selected program should be displayed")
    public void transHist(){}

    //Program History after admin approves or rejects the program//
    @And ("I go to the \"Manage Fundraising\" or \"Program History\" page")
    public void gotoFunda(){
        fundPage.toFundFitur();
        fundPage.dashboardFunda();
    }
    @And ("I select the option to view approved or rejected programs")
    public void seingListFunda(){
        fundPage.TransaksiPage();
    }
    @Then ("the list of approved or rejected programs should be displayed")
    public void valdateListTrans(){
        fundPage.listTransaksiPage();
    }
}
