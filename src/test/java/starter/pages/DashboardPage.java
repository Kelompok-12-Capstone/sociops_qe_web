package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.ui.Link;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    private By navbar() {
        return By.className("navbar");
    }

    private By toCustomerPage(){
        return By.xpath("//a[.='Customers']");
    }

    // private By customerPage(){
    //     return By.linkText("/customer");
    // }

    @Step
    public boolean validateOnDashboard(){
        $(navbar()).waitUntilVisible();
        return $(navbar()).isDisplayed();
    }

    @Step
    public void clickCustomer(){
        $(toCustomerPage()).click();
    }

    @Step
    public void validateOnCustomerPage(){
        Link.containing("/customer");
    }

}
