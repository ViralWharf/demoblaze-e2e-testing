package pageObjects.Cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class confirmarCompraPO {
    private final WebDriver webdriver;

    public confirmarCompraPO(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    private final By btn_Checkout_Locator = By.xpath("//button[contains(.,'Checkout')]");
    private final By label_Price_Backpack_Locator = By.xpath("//div[@class='inventory_item_price'][contains(.,'$29.99')]");
    private final By label_Price_Bike_Light_Locator = By.xpath("//div[@class='inventory_item_price'][contains(.,'$9.99')]");

    public void oprimirCheckout() {
        WebElement btn_Checkout = webdriver.findElement(btn_Checkout_Locator);
        WebElement label_Price_Backpack = webdriver.findElement(label_Price_Backpack_Locator);
        WebElement label_Price_Bike_Light = webdriver.findElement(label_Price_Bike_Light_Locator);

        Assert.assertEquals(label_Price_Backpack.getText(), "$29.99");
        Assert.assertEquals(label_Price_Bike_Light.getText(), "$9.99");
        btn_Checkout.click();
    }
}
