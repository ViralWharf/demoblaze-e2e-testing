package pageObjects.Inventory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class agregarProductosPO {
    private final WebDriver webdriver;
    private final WebDriverWait wait;

    public agregarProductosPO(WebDriver webdriver) {
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
    }

    private final By btn_Cart_Locator = By.xpath("//a[contains(.,'Cart')]");
    private final By btn_Add_Cart_Locator = By.xpath("//a[contains(.,'Add to cart')]");

    public void seleccionarProductos(String category, String product, String price) {
        final String btn_Category_Locator = String.format("//a[contains(.,'%s')]", category);
        final By selector_Category_locator = By.xpath(btn_Category_Locator);

        final String btn_Product_Locator = String.format("//a[contains(.,'%s')]", product);
        final By selector_Product_locator = By.xpath(btn_Product_Locator);

        final String btn_Price_Locator = String.format("//h5[contains(.,'%s')]", price);

        String lblCategory = String.valueOf(webdriver.findElement(By.xpath(btn_Category_Locator)).getText());
        assert lblCategory.equals(category);

        String lblProduct = String.valueOf(webdriver.findElement(By.xpath(btn_Product_Locator)).getText());
        assert lblProduct.equals(product);

        String lblPrice = String.valueOf(webdriver.findElement(By.xpath(btn_Price_Locator)).getText());
        assert lblPrice.equals(price);

        try {
            WebElement btn_Category = wait.until(ExpectedConditions.elementToBeClickable(selector_Category_locator));
            btn_Category.click();

        } catch (StaleElementReferenceException e) {
            WebElement btn_Category = wait.until(ExpectedConditions.elementToBeClickable(selector_Category_locator));
            btn_Category.click();
        }

        WebElement btn_Product = wait.until(ExpectedConditions.elementToBeClickable(selector_Product_locator));
        btn_Product.click();
    }

    public void seleccionarCarrito() {
        WebElement btn_Cart = wait.until(ExpectedConditions.elementToBeClickable(btn_Cart_Locator));
        btn_Cart.click();
    }

    public void agregarProductoAlCarrito() {
        WebElement btn_Add_Cart = wait.until(ExpectedConditions.elementToBeClickable(btn_Add_Cart_Locator));
        btn_Add_Cart.click();
    }

    public void validarPopUp(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert popUp = webdriver.switchTo().alert();
        String mensajePopUp = popUp.getText();
        Assert.assertEquals(mensajePopUp, "Product added.", "El mensaje del PopUp no coincide con el esperado");
        popUp.accept();
    }
}
