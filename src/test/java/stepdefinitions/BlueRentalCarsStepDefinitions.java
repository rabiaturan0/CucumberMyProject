package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalCarsPage;
import utilities.Driver;

public class BlueRentalCarsStepDefinitions {
    BlueRentalCarsPage blueRentalCarsPage = new BlueRentalCarsPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentalCarsPage.login1.click();
    }
    @When("kullanici  email {string} girer")
    public void kullanici_email_girer(String string) {
        blueRentalCarsPage.email.sendKeys(string);
    }
    @When("kullanici  password {string} girer")
    public void kullanici_password_girer(String string) {
        blueRentalCarsPage.password.sendKeys(string);
    }
    @When("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        blueRentalCarsPage.login2.click();
    }
//    @Then("kullanici \"sam.walker@bluerentalcars.com\"oldugunu dogrular")
//    public void kullanici_sam_walker_bluerentalcars_com_oldugunu_dogrular() {
//
//    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

}