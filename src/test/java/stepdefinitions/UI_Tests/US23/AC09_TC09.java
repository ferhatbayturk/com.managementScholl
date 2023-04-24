package stepdefinitions.UI_Tests.US23;

import io.cucumber.java.en.And;
import pages.AdminViceDeanPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AC09_TC09 {
    AdminViceDeanPage adminViceDeanPage = new AdminViceDeanPage();
    @And("Nilufer User Name alanina {string} girmeyerek bos birak")
    public void user_name_alanina_girmeyerek_bos_birak(String string) {
        adminViceDeanPage.Admin_Vice_Dean_Username.sendKeys(string);
    }
    @And("Nilufer Password alanina tikla")
    public void password_alanina_tikla() {
        adminViceDeanPage.Admin_Vice_Dean_Password.click();
    }
    @And("Nilufer User Name alani altinda Required mesajini gor")
    public void user_name_alani_altinda_required_mesajini_gor() {
        assertTrue(adminViceDeanPage.Admin_Vice_Dean_Username_Error_Message.isDisplayed());
    }

    @And("Nilufer User Name alanina valid bir {string} gir")
    public void niluferUserNameAlaninaValidBirGir(String arg0) {
        adminViceDeanPage.Admin_Vice_Dean_Username.sendKeys(arg0);
    }
    @And("Nilufer User Name alani altinda hata mesaji goruntulenmemeli")
    public void user_name_alani_altinda_hata_mesaji_goruntulenmemeli() {
        assertFalse(adminViceDeanPage.Admin_Vice_Dean_Username_Error_Message.isDisplayed());
    }

}
