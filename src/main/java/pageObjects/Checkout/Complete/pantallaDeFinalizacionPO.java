package pageObjects.Checkout.Complete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class pantallaDeFinalizacionPO {
    private final WebDriver webdriver;

    public pantallaDeFinalizacionPO(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    private final By label_Thanks_Locator = By.xpath("//h2[@class='complete-header']");
    private final By label_Text_Locator = By.xpath("//div[contains(@class,'complete-text')]");
    private final By btn_Home_Locator = By.xpath("//button[contains(.,'Back Home')]");

    public void validarMensaje() {
        WebElement label_Thanks = webdriver.findElement(label_Thanks_Locator);
        WebElement label_Text = webdriver.findElement(label_Text_Locator);

        Assert.assertEquals(label_Thanks.getText(), "Thank you for your order!");
        Assert.assertEquals(label_Text.getText(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }

    public void volverPaginaInicio() {
        WebElement btn_Home = webdriver.findElement(btn_Home_Locator);
        btn_Home.click();
    }
}
