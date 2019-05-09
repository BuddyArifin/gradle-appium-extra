package com.gembira.step_definitions;

import com.gembira.setup.SetupFramework;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.GoLifePage;
import pages.HomePage;

public class GoCleanStepDef extends SetupFramework {
    private HomePage homePage;
    private GoLifePage goLifePage;
    private String estimatedHarga;

    @Before
    public void setup() throws Exception {
        driver = prepareAndroidForAppium();
        homePage = new HomePage(driver);
        goLifePage = new GoLifePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    
    @Given("^I go to goclean subsection$")
    public void iGoToGocleanSubsection() {
        homePage.clickGoCleanLogo();
    }

    @And("^I choose Kategori Layanan Reguler$")
    public void iChooseKategoriLayananReguler() {
        goLifePage.clickRegulerButton();
    }

    @And("^I choose Peralatan GO-CLEAN$")
    public void iChoosePeralatanGOCLEAN() {
       goLifePage.clickPeralatanButton();
    }

    @And("^I choose duration (\\d+) hour and select gender$")
    public void iChooseDurationHourAndSelectGender(int arg0) {
        goLifePage.clickSatuJamServiceButton();
        estimatedHarga = goLifePage.getEstimatedPrice();
        goLifePage.clickPrefGenderButton();
    }

    @When("^I tap Lanjut Button$")
    public void iTapLanjutButton() {
        goLifePage.clickLanjutButton();
    }

    @Then("^The price should same as estimate price$")
    public void thePriceShouldSameAsEstimatePrice() {
        Assert.assertEquals(estimatedHarga, goLifePage.getEstimatePrice());
    }

    @And("^I choose Kategori Layanan Spesial$")
    public void iChooseKategoriLayananSpesial() {
        goLifePage.clickSpesialButton();
    }
}
