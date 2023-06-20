package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.UsePersistantStepLibraries;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class FundPage extends  PageObject{
    private By fundButton(){
        return By.xpath("//div[@class='grid grid-cols-4 gap-[25px] text-Gray-800']/a[.='Fundraising']");
    }
    private By diagramFund(){
        return By.xpath("//div[@class='drop-shadow-custom rounded-[15px] bg-Gray-50 p-5']");
    }
    private By PengajuanButton(){
        return By.xpath("//a[.='Permintaan Pengajuan Program']");
    }
    private By listProgButton(){
        return By.xpath("//a[.='List Program']");
    }
    private By RiwayatButton(){
        return By.xpath("//a[.='Riwayat Program']");
    }
    private By transaksiButton(){return By.xpath("//a[.='Transaksi']");}
    private By detailAjuBton(){
        return By.xpath("//tbody[1]/tr[1]//button[@class='bg-warning-400 hover:bg-warning-700 duration-300 ease-in-out py-3 px-7 w-52 text-sm capitalize rounded-[72px] text-white']");
    }
    private By tabelListProgram(){
        return By.xpath("//th[.='Nama program']");
    }
    private By tabelSTATUSProgram(){
        return By.xpath("//th[.='Status']");
    }
    private By statusTrans(){
        return By.xpath("//tbody[1]/tr[1]/td[.='Ditolak']");
    }

    @Step
    public void toFundFitur(){
        $(fundButton()).click();
    }
    @Step
    public void dashboardFunda(){
        $(diagramFund()).shouldBeVisible();
    }
    @Step
    public void clickPengajuan(){
        $(PengajuanButton()).click();
    }
    @Step
    public void listPengajuanfund(){
        $(detailAjuBton()).shouldBeVisible();
    }
    @Step
    public void listProgramfUND(){
        $(listProgButton()).click();
    }
    @Step
    public void validateListProgFund(){
        $(tabelListProgram()).shouldBeVisible();
    }
    @Step
    public void RiwayatProg(){
        $(RiwayatButton()).click();
    }
    @Step
    public void listRiwayat(){
        $(tabelSTATUSProgram()).shouldBeVisible();
    }
    @Step
    public void TransaksiPage(){
        $(transaksiButton()).click();
    }
    @Step
    public void listTransaksiPage(){
        $(statusTrans()).shouldBeVisible();
    }
}
