package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class LoginPage  extends PageObject{
    private By emailField(){
        return By.xpath("//input[@name='email']");
    }
    private By passField(){
        return By.xpath("//input[@name='password']");
    }
    private By loginButton(){
        return By.xpath("//button[@class='bg-primary-800 hover:bg-primary-900 duration-300 ease-in-out py-6 px-7 w-full undefined capitalize rounded-[72px] text-white']");
    }
    private By redNotifWrongEmail(){
        return By.xpath("//small[.='Email tidak boleh kosong']");
    }
    private By redNotifWrongPass(){
        return By.xpath("//small[.='Password tidak boleh kosong']");
    }
    @Step
    public void openPage(){open();}
    @Step
    public void tryLogin1(String email,String password){
        $(emailField()).type(email);
        $(passField()).type(password);
    }
    @Step
    public void clickToLogin(){
        $(loginButton()).click();
    }
}
