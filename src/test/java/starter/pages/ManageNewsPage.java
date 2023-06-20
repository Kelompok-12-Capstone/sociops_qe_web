package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageNewsPage extends PageObject {
    private By NewsButton(){
        return By.xpath("//a[4]");
    }
    private By TulisBeritaButton(){
        return By.xpath("//a[.='Tulis berita']");
    }
    private By listBeritaButton(){
        return By.xpath("//a[.='List berita']");
    }
    private By uploadBatalButton(){
        return By.xpath("//button[.='Batalkan']");
    }
    private By page5Berita(){return By.xpath("//div[.='5']");}

    @Step
    public void openNews(){
        $(NewsButton()).click();
    }
    @Step
    public void clickTulis(){
        $(TulisBeritaButton()).click();
    }
    @Step
    public void validateNews(){
        $(uploadBatalButton()).isVisible();
    }

    @Step
    public void openListBerita(){
        $(listBeritaButton()).click();
    }
    @Step
    public void validateListBerita(){
        $(page5Berita()).isVisible();
    }
}
