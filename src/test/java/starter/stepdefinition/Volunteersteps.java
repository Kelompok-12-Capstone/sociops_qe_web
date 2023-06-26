package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.VolunteerPage;

public class Volunteersteps {

    @Steps
    VolunteerPage volunteerPage;
    @Given("I on the login page")
    public void iOnTheLoginPage() {
        volunteerPage.validateOnLoginPage();
    }

    @When("I click volunteer field")
    public void iClickVolunteerField() {
        volunteerPage.clickVolunteerField();
    }

    @Then("I on the volunteer page")
    public void iOnTheVlounteerPage() {
        volunteerPage.validateOntheVoLunteerPage();
    }
    ///
    @And("I click permintaan pengajuan program field")
    public void iClickPermintaanPengjuianProgramField() {
        volunteerPage.clickPermintaanPengjuanProgramField();
    }

    @And("I on the permintaan pengajuan page")
    public void iOnThePermintaanPengajuanPage() {
        volunteerPage.validateOnTheProgramPage();
    }

    ///

    @And("I click detail field")
    public void clickDetailField() {
        volunteerPage.clickDetailField();
    }

    @Then("I on the detail permintaan pengajuan page")
    public void onTheDetailPermintaanPengajuanPage() {
        volunteerPage.validateOnTheDetailPermintaanPengajuanPage();
    }

    ///

    @And("I click video promosi field to see video")
    public void clickVideoPromosiFieldToSeeVideo() {
        volunteerPage.clickVideoPromosiFieldToSeeVideo();
    }

    ///

    @And("I click diterima field to accept program")
    public void clickDiTerimaFieldToAcceptProgram() {
        volunteerPage.clickDiTerimaFieldToAcceptProgram();
    }

    ///

    @And("I click ditolak field to reject program")
    public void clickDiTolakFielToRejectProgram() {
        volunteerPage.clickDiTolakFieldToRejectProgram();
    }

    ///

    @And("I click list program field")
    public void iClickListProgramField() {
        volunteerPage.clickListProgramField();
    }

    @And("I on the list program page")
    public void iOnTheListProgramPage() {
        volunteerPage.validateOnTheListProgramPaage();
    }

    ///

    @And("I click riwayat program field")
    public void iClickRiwayatProgramField() {
        volunteerPage.clickRiwayatProgramField();
    }

    @And("I on the riwayat program page")
    public void iOnTheRiwayatProgramPage() {
        volunteerPage.validateOnTheProgramPage();
    }
}
