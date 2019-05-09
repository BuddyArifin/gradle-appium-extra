package com.gembira.step_definitions;

import com.gembira.setup.SetupFramework;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.GoAutoPage;
import pages.HomePage;

public class GoAutoStepDef extends SetupFramework {
    private HomePage homePage;
    private GoAutoPage goAutoPage;
    private String estimatedHarga;


    @Before
    public void setUp() throws Exception {
        driver = prepareAndroidForAppium();
        homePage = new HomePage(driver);
        goAutoPage = new GoAutoPage(driver);
    }

    @Given("^I go to goauto subsection$")
    public void iGoToGoautoSubsection() {
        homePage.clickGoAutoLogo();
    }


    @And("^I choose Cuci Mobil$")
    public void iChooseCuciMobil() {
        goAutoPage.clickCuciMobil();
    }


    @And("^I choose Cuci Eksterior$")
    public void iChooseCuciEksterior() {
        goAutoPage.clickCuciEksterior();
        estimatedHarga = goAutoPage.getHargaTxt();
    }

    @Then("^The price cuci mobil should same as estimate price$")
    public void thePriceCuciMobilShouldSameAsEstimatePrice() {
        Assert.assertEquals(estimatedHarga, goAutoPage.getServicePrice());
    }

    @And("^I choose Cuci Motor$")
    public void iChooseCuciMotor() {
        goAutoPage.clickCuciMotor();
    }

    @Then("^The price cuci motor should same as estimate price$")
    public void thePriceCuciMotorShouldSameAsEstimatePrice() {
        Assert.assertEquals(estimatedHarga, goAutoPage.getServicePrice());
    }
}
