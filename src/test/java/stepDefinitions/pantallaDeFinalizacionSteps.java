package src.test.java.stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.Checkout.Complete.pantallaDeFinalizacionPO;

public class pantallaDeFinalizacionSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final pantallaDeFinalizacionPO pantallaDeFinalizacionPO = new pantallaDeFinalizacionPO(webdriver);

    @Then("Se realizo la compra correctamente y se vuelve al inicio")
    public void Se_realizo_la_compra_correctamente_y_se_vuelve_al_inicio(){
        pantallaDeFinalizacionPO.validarMensaje();
        pantallaDeFinalizacionPO.volverPaginaInicio();
        webdriver.quit();
    }
}
