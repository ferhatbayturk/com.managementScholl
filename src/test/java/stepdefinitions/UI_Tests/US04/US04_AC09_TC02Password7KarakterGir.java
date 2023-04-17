package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class US04_AC09_TC02Password7KarakterGir {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int phoneNo1= Faker.instance().number().numberBetween(100,999);
    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);
    Faker faker = new Faker();
    @And("Kullanici password {string} alanina yedi karakter sifre girer")
    public void kullaniciPasswordAlaninaYediKarakterSifreGirer(String arg0) {
        deanManagementPage.password_Add_Dean.sendKeys(arg0);
    }

    @Then("Kullanici altta uyari mesaji gorur.")
    public void kullaniciAlttaUyariMesajiGorur() {
        Assert.assertTrue(deanManagementPage.password_Minimum8Character_Message_Add_Dean.isDisplayed());

    }
}
