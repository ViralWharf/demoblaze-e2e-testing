package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Signup.crearUsuarioPO;

public class crearUsuarioSteps {
    WebDriver webdriver = DriverFactory.getDriver();

    private final crearUsuarioPO crearUsuarioPO = new crearUsuarioPO(webdriver);

    @Given("El usuario selecciona Sign up")
    public void el_usuario_selecciona_Sign_up() {
        crearUsuarioPO.seleccionarSignUp();
    }

    @When("Ingresa {string} y {string}")
    public void ingresa_las_credenciales(String username, String password) {
        crearUsuarioPO.ingresarCredenciales(username, password);
    }

    @Then("Se crea el usuario correctamente")
    public void se_crea_el_usuario_correctamente() {
        crearUsuarioPO.validarPopUp();
    }
}
