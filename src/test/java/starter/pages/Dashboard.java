package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Dashboard extends PageObject{
    private By customerIcon(){
        return By.xpath("//div[.='Customers']");
    }
    private By communityRequestIcon(){
        return By.xpath("//a[.='Permintaan Komunitas']");
    }
    private By userAccountList(){
        return By.xpath("//a[.='Daftar Akun Pengguna']");
    }
    private By userFundraising(){
        return By.xpath("//a[.='Pengguna Fundraising']");
    }
    private By userVolunteer(){
        return By.xpath("//a[.='Pengguna Volunteer']");
    }
    private By backButton(){
        return By.cssSelector(".bg-primary-50");
    }

    @Step
    public boolean validateOnDashboard() {
        $(customerIcon()).waitUntilVisible();
        return $(customerIcon()).isDisplayed();
    }
    @Step
    public void clickCustomerIcon() {
        $(customerIcon()).click();
    }
    @Step
    public void clickUserAccountList() {
        $(userAccountList()).click();
    }
    @Step
    public void clickCommunityRequestIcon() {
        $(communityRequestIcon()).click();
    }
    @Step
    public void clickUserFundraising() {
        $(userFundraising()).click();
    }
    @Step
    public void clickUserVolunteer() {
        $(userVolunteer()).click();
    }
    @Step
    public void clickBackButton() {
        $(backButton()).click();
    }
    @Step
    public boolean validatePage(){
        return $(backButton()).isDisplayed();
    }
    public boolean validateOnCustomerPage(){
        return $(communityRequestIcon()).isDisplayed();
    }
}
