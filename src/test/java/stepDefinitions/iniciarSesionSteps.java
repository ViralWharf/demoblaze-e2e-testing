package src.test.java.stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Constants_Vars;
import pageObjects.Login.iniciarSesionPO;

public class iniciarSesionSteps {

    WebDriver webdriver = DriverFactory.getDriver();
    private final iniciarSesionPO iniciarSesionPO = new iniciarSesionPO(webdriver);

    @Given("El usuario ingresa a la pagina")
    public void el_usuario_ingresa_a_la_pagina() {
        webdriver = DriverFactory.getDriver();
        webdriver.get(Constants_Vars.URL);
    }

    @When("Ingresa las credenciales")
    public void ingresa_las_credenciales() {
        iniciarSesionPO.ingresarCredenciales(Constants_Vars.USER, Constants_Vars.PASSWORD);
    }

    @Then("Se inicio sesion correctamente")
    public void se_inicio_sesion_correctamente() {
        String actualTitle = webdriver.getTitle();
        Assert.assertEquals(actualTitle, "Swag Labs", "El título de la página no coincide con el esperado");
    }
}