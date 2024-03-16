package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Inventory.agregarProductosPO;

public class agregarProductosSteps {
    WebDriver webdriver = DriverFactory.getDriver();
    private final agregarProductosPO agregarProductosPO = new agregarProductosPO(webdriver);

    @Given("El usuario ingresa {string} y selecciona un {string} con {string} al carrito")
    public void el_usuario_ingresa_productos_al_carrito(String category, String product, String price){
        agregarProductosPO.seleccionarProductos(category, product, price);
        agregarProductosPO.agregarProductoAlCarrito();
        agregarProductosPO.validarPopUp();
    }

    @When("Ingreso al carrito")
    public void Ingreso_al_carrito() {
        agregarProductosPO.seleccionarCarrito();
    }
}
