package stepdefinitions.UI_Tests.US04;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.LocalDateTime;

public class US04_AC02_TC02SurnameSembolGir {
    
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    int ssnNo1 = Faker.instance().number().numberBetween(100,999);
    int ssnNo2= Faker.instance().number().numberBetween(10,99);
    int ssnNo3 = Faker.instance().number().numberBetween(1000,9999);

    int phoneNo1= Faker.instance().number().numberBetween(100,999);

    int phoneNo2= Faker.instance().number().numberBetween(100,999);
    int phoneNo3 = Faker.instance().number().numberBetween(1000,9999);

    Faker faker = new Faker();

    @And("Ali Surname {string} alanina sembol girer")
    public void AliSurnameAlaninaSembolGirer(String arg0) {
       deanManagementPage.surname_Add_Dean.sendKeys(arg0);

    }

    @Then("Ali  DeanSave kaydi gorulur")
    public void AliDeanSaveKaydiGorulur() throws IOException {
        Assert.assertFalse(deanManagementPage.dean_Saved_message.isDisplayed());
        LocalDateTime currentTime =  LocalDateTime.now();
        ReusableMethods.getScreenshot("FAIL");
    }
}

