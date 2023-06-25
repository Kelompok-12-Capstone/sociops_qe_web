package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class LandingPage extends PageObject{
    private By emailField(){
        return By.name("email");
    }
    private By passwordField(){
        return By.name("password");
    }
    private By loginButton(){
        return By.cssSelector(".bg-primary-800");
    }
    @Step
    public void openPage() {
        open();
    }
    @Step
    public boolean validateOnLandingPage() {
        return $(loginButton()).isDisplayed();
    }
    @Step
    public void inputUserName(String username) {
        $(emailField()).type(username);
    }
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickSigninButton() {
        $(loginButton()).click();
    }
}
