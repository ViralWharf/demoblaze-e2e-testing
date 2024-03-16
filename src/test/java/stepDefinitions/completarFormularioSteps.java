package src.test.java.stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Checkout.StepOne.completarFormularioPO;

public class completarFormularioSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final completarFormularioPO completarFormularioPO = new completarFormularioPO(webdriver);

    @Given("El usuario ingresa {string} {string} y {string} en el formulario")
    public void el_usuario_ingresa_los_datos_en_el_formulario(String nombre, String apellido, String zip){
        completarFormularioPO.ingresarDatosFormulario(nombre, apellido, zip);
    }

    @When("Guarda los datos")
    public void Guarda_los_datos() {
        completarFormularioPO.seleccionarContinuar();
    }
}
