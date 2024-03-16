package src.test.java.stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Checkout.StepTwo.finalizarCompraPO;

public class finalizarCompraSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final finalizarCompraPO finalizarCompraPO = new finalizarCompraPO(webdriver);

    @When("El usuario finaliza la compra")
    public void El_usuario_finaliza_la_compra(){
        finalizarCompraPO.oprimirFinalizarCompra();
    }
}
