package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Cart.confirmarCompraPO;

public class confirmarCompraSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final confirmarCompraPO confirmarCompraPO = new confirmarCompraPO(webdriver);


    @When("Se confirma la compra")
    public void confirmarCompraPO() {
        confirmarCompraPO.oprimirPlaceOrder();
    }
}
