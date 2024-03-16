package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Checkout.StepOne.completarFormularioPO;

public class completarFormularioSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final completarFormularioPO completarFormularioPO = new completarFormularioPO(webdriver);

    @When("El usuario ingresa {string} {string} {string} {string} {string} y {string} en el formulario")
    public void el_usuario_ingresa_los_datos_en_el_formulario(String name, String country, String city, String creditCard, String month, String year){
        completarFormularioPO.ingresarDatosFormulario(name, country, city, creditCard, month, year);
        completarFormularioPO.seleccionarComprar();
    }
}
