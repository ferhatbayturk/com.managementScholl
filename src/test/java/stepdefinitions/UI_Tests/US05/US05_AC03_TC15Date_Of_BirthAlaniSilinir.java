package stepdefinitions.UI_Tests.US05;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import utilities.Driver;

public class US05_AC03_TC15Date_Of_BirthAlaniSilinir {
    EditDeanPage editDeanPage = new EditDeanPage();
    @And("Ali Date Of Bırth alanini siler")
    public void AlıDateOfBirthAlaniniSiler() {
        editDeanPage.female_Checkbox_Edit_Dean.click();
        editDeanPage.dateOfBirth_Edit_Dean.click();
        editDeanPage.dateOfBirth_Edit_Dean.sendKeys(Keys.DELETE,Keys.TAB,Keys.DELETE,Keys.TAB,Keys.DELETE);
    }
    @Then("Ali Required mesajini gorur.")
    public void AlıRequiredMesajiniGorur() {
        Assert.assertTrue(editDeanPage.Required_edit_Dean_DateOfBirth.isDisplayed());
    }
}
