package pageObjects.Inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class agregarProductosPO {
    private final WebDriver webdriver;

    public agregarProductosPO(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    private final By btn_Add_Backpack_Locator = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
    private final By label_Title_Backpack_Locator = By.xpath("//div[@class='inventory_item_name '][contains(.,'Sauce Labs Backpack')]");
    private final By label_Description_Backpack_Locator = By.xpath("//div[@class='inventory_item_desc'][contains(.,'carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.')]");

    private final By btn_Add_Bike_Light_Locator = By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");
    private final By label_Title_Bike_Light_Locator = By.xpath("//div[@class='inventory_item_name '][contains(.,'Sauce Labs Bike Light')]");
    private final By label_Description_Bike_Light_Locator = By.xpath("(//div[@class='inventory_item_desc'])[2]");
    private final By btn_Cart_Locator = By.xpath("//a[@class='shopping_cart_link']");

    public void seleccionarProductos() {
        WebElement btn_Add_Backpack = webdriver.findElement(btn_Add_Backpack_Locator);
        WebElement label_Title_Backpack = webdriver.findElement(label_Title_Backpack_Locator);
        WebElement label_Description_Backpack = webdriver.findElement(label_Description_Backpack_Locator);

        WebElement btn_Add_Bike_Light = webdriver.findElement(btn_Add_Bike_Light_Locator);
        WebElement label_Title_Bike_Light = webdriver.findElement(label_Title_Bike_Light_Locator);
        WebElement label_Description_Bike_Light = webdriver.findElement(label_Description_Bike_Light_Locator);

        Assert.assertEquals(label_Title_Backpack.getText(), "Sauce Labs Backpack");
        Assert.assertEquals(label_Title_Bike_Light.getText(), "Sauce Labs Bike Light");
        Assert.assertEquals(label_Description_Backpack.getText(), "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        Assert.assertEquals(label_Description_Bike_Light.getText(), "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

        btn_Add_Backpack.click();
        btn_Add_Bike_Light.click();
    }

    public void seleccionarCarrito() {
        WebElement btn_Cart = webdriver.findElement(btn_Cart_Locator);
        btn_Cart.click();
    }
}
