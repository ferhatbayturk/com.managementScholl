package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ChooseLessonManagement;
import pages.MainMenuPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AC01_TC01_TeacherDayVeStartTimeGorebilme {

    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();


    @Given("Emin ana sayfaya {string} gider")
    public void Emin_ana_sayfaya_gider(String string) {
        Driver.getDriver().get(string);
        ReusableMethods.waitFor(1);
    }




    @When("Emin loginn butonuna tiklar")
    public void Emin_loginn_butonuna_tiklar() {
        homePage.login_Button_Home.click();
        ReusableMethods.waitFor(1);
    }
    @When("Emin User Namee alanina teacher bilgileri {string} ile girer")
    public void Emin_user_namee_alanina_teacher_bilgileri_ile_girer(String string) {
        loginpage.username_Box_Login.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("Emin Passwordd alanina sifresini {string} girer")
    public void Emin_passwordd_alanina_sifresini_girer(String string) {
        loginpage.password_Box_Login.sendKeys(string);
        ReusableMethods.waitFor(1);
    }

    @When("Emin loginn_login butonuna tiklar")
    public void Emin_loginn_login_butonuna_tiklar() {
       loginpage.login_Button_Login.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Emin Choose Lesson sayfasindan Lesson,Teacheri dogrular")
    public void Emin_choose_lesson_sayfasindan_lesson_teacheri_dogrular() {
        Assert.assertTrue(chooseLessonManagement.teacher_dogrulama.isDisplayed());
        ReusableMethods.waitFor(1);
    }

}
