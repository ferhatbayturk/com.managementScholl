package stepdefinitions.UI_Tests.US15;

import io.cucumber.java.en.And;
import pages.Vice_DeanPage;

public class TC13_gender_female {
    Vice_DeanPage vice_deanPage = new Vice_DeanPage();
    @And("Kullanici female butonuna tiklar")
    public void kullaniciFemaleButonunaTiklar() {
        vice_deanPage.student_female.click();

    }
}
