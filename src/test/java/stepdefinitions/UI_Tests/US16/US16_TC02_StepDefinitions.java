package stepdefinitions.UI_Tests.US16;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanLessonPage;

public class US16_TC02_StepDefinitions {

    HomePage homePage=new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();



    @Then("MDogan delete butonuna tiklar")

    public void MDoganDeleteButonunaTiklar() {

    }
}
