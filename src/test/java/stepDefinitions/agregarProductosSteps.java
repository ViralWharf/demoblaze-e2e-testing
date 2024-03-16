package src.test.java.stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Inventory.agregarProductosPO;

public class agregarProductosSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final agregarProductosPO agregarProductosPO = new agregarProductosPO(webdriver);

    @Given("El usuario ingresa productos al carrito")
    public void el_usuario_ingresa_productos_al_carrito(){
        agregarProductosPO.seleccionarProductos();
    }

    @When("Ingresa al carrito")
    public void Ingresa_al_carrito() {
        agregarProductosPO.seleccionarCarrito();
    }
}
