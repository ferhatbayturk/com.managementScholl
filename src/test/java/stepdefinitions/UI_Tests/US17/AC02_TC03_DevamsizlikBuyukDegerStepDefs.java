package stepdefinitions.UI_Tests.US17;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.StudentInfoPage;

public class AC02_TC03_DevamsizlikBuyukDegerStepDefs {
    StudentInfoPage studentInfoPage =new StudentInfoPage();
    @Then("kullanici55 absentee ye devamsizliga buyuk deger girer {string} ve gorur")
    public void kullanici55AbsenteeYeDevamsizligaBuyukDegerGirerVeGorur(String arg0) {
        studentInfoPage.absentee_box_studentInfo.sendKeys(arg0);
        Assert.assertEquals(3,studentInfoPage.requiredAbsente_text_studentInfo.size());
    }
}
