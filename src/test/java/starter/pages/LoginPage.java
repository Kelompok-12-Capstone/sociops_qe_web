package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject{

    private By emailField() {
        return By.name("email");
    }

    private By passwordField() {
        return By.name("password");
    }

    private By loginButton() {
        return By.className("bg-primary-800");
    }

    private By incorrectAlert(){
        return By.xpath("//div[@class='Toastify__toast-body']/div[.='email atau password salah']");
    }

    private By warningInvalidEmail(){
        return By.className("ml-4");
    }

    private By warningEmptyPassword(){
        return By.className("ml-4");
    }

    private By warningEmptyEmail(){
        return By.className("ml-4");
    }

    private By warningCharPassword(){
        return By.className("ml-4");
    }

    private By warningCharEmail(){
        return By.className("ml-4");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean checkIncorrectAlert(){
        return $(incorrectAlert()).isDisplayed();
    }

    @Step
    public boolean checkWarningInvalidEmail(){
        return $(warningInvalidEmail()).isDisplayed();
    }

    @Step
    public boolean checkWarningEmptyPassword(){
        return $(warningEmptyPassword()).isDisplayed();
    }

    @Step
    public boolean checkWarningEmptyEmail(){
        return $(warningEmptyEmail()).isDisplayed();
    }

    @Step
    public boolean checkWarningCharPassword(){
        return $(warningCharPassword()).isDisplayed();
    }

    @Step
    public boolean checkWarningCharEmail(){
        return $(warningCharEmail()).isDisplayed();
    }

}
