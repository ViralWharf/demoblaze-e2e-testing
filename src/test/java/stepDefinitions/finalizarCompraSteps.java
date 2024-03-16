package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.Checkout.StepTwo.finalizarCompraPO;

public class finalizarCompraSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final finalizarCompraPO finalizarCompraPO = new finalizarCompraPO(webdriver);

    @Then("Se confirma la compra correctamente")
    public void se_confirma_la_compra_correctamente(){
        finalizarCompraPO.oprimirFinalizarCompra();
    }
}
