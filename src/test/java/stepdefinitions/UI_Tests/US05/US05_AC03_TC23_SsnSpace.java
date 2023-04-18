package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages.*;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.Admin_ManagementPage;
import pages.DeanManagementPage;
import pages.EditDeanPage;

import utilities.Driver;

public class US05_AC03_TC23_SsnSpace {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Admin_ManagementPage admin_managementPage = new Admin_ManagementPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Kullanici Ssn alanina space girer.")
    public void kullaniciSsnAlaninaSpaceGirer() {
        editDeanPage.ssn_Edit_Dean.sendKeys(Keys.SPACE);
        Assert.assertTrue(deanManagementPage.ssn_PleaseEnterValidSsnNumber_Message_Add_Dean.isDisplayed());
    }
}
