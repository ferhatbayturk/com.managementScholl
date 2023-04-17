package stepdefinitions.UI_Tests.US21;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.US19_US20_US21_Pages.ChooseLessonManagement;
import pages.US19_US20_US21_Pages.MainMenuPage;
import utilities.ReusableMethods;

public class AC01_TC03_AyniGunVeSaateDenkGelenDerslerSecilmemeli {
    HomePage homePage =new HomePage();
    LoginPage loginpage = new LoginPage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    ChooseLessonManagement chooseLessonManagement = new ChooseLessonManagement();


    @When("kullanici choose Lesson listesindeki ayni gun ve saatlerin kutucuklarini tiklar")
    public void kullanici_choose_lesson_listesindeki_ayni_gun_ve_saatlerin_kutucuklarini_tiklar() {
        ReusableMethods.clickByJS(chooseLessonManagement.kutucuk11);
        ReusableMethods.clickByJS(chooseLessonManagement.kutucuk13);

    }
    @When("kullanici submittt butonuna tiklar")
    public void kullanici_submittt_butonuna_tiklar() {
       ReusableMethods.clickByJS(chooseLessonManagement.submit_button);
    }
    @Then("kullanici giris yapamadigini dogrular")
    public void kullanici_giris_yapamadigini_dogrular() {
        Assert.assertFalse(chooseLessonManagement.eror_yazisi.isDisplayed());
    }
}
