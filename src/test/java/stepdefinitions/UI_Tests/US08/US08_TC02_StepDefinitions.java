package stepdefinitions.UI_Tests.US08;

import io.cucumber.java.en.Then;
import pages.ViceDeanLessonPage;

public class US08_TC02_StepDefinitions {
  ;
    ViceDeanLessonPage viceDeanLessonPage = new ViceDeanLessonPage();



    @Then("MDogan Compulsory kutucugunu tiklar")
    public void MDoganCompulsoryKutucugunuTiklar() {
        viceDeanLessonPage.compulsory.click();
    }
}
