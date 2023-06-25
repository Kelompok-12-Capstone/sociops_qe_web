package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class VolunteerPage extends PageObject {

    private By dasborad() {
        return By.xpath("//body/div[2]/div[1]/div[1]/aside[1]/div[1]/div[1]/img[1]");
    }

    private By volunteerField() {
        return By.xpath("//body/div[2]/div[1]/div[1]/aside[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]");
    }

    private By volunteerPage() {
        return By.xpath("//div[contains(text(),'Volunteer statistics')]");
    }

    ///

    private By clickPermintaanPengajuanFiedld() {
        return By.xpath("//body/div[2]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/a[1]/div[1]");
    }

    private By permintaanPengjuanPage() {
        return By.xpath("//div[contains(text(),'Permintaan Pengajuan Program')]");
    }

    ///

    private By clickListProgramField0() {
        return By.xpath("//body/div[2]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/a[2]");
    }

    private By listProgramPage() {
        return By.xpath("//div[contains(text(),'List Program')]");
    }

    ///

    private By riwayatProgramField() {
        return By.xpath("//body/div[2]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/a[3]");
    }

    private By riwayatProgramPage() {
        return By.xpath("//div[contains(text(),'Riwayat Program')]");
    }

    @Step("I on the login page")
    public boolean validateOnLoginPage() {
        return $(dasborad()).isDisplayed();
    }

    @Step("I click volunteer field")
    public void clickVolunteerField() {
        $(volunteerField()).click();
    }

    @Step("I on the volunteer page")
    public boolean validateOntheVoLunteerPage() {
        return $(volunteerPage()).isDisplayed();
    }

    ///

    @Step("I click permintaan pengajuan program field")
    public void clickPermintaanPengjuanProgramField() {
        $(clickPermintaanPengajuanFiedld()).click();
    }

    @Step("I on the permintaan pengajuan page")
    private boolean validateOnThePermintaanPengjuanPage() {
        return $(permintaanPengjuanPage()).isDisplayed();
    }

    ///

    @Step("I click list program field")
    public void clickListProgramField() {
        $(clickListProgramField0()).click();
    }

    @Step("I on the list program page")
    public boolean validateOnTheListProgramPaage() {
        return $(listProgramPage()).isDisplayed();
    }

    ///

    @Step("I click riwayat program field")
    public void clickRiwayatProgramField() {
        $(riwayatProgramField()).click();
    }

    @Step("I on the riwayat program page")
    public boolean validateOnTheProgramPage() {
        return $(riwayatProgramPage()).isDisplayed();
    }
}
