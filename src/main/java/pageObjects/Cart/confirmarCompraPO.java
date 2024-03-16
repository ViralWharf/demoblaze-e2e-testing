package pageObjects.Cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class confirmarCompraPO {
    private final WebDriver webdriver;
    private final WebDriverWait wait;

    public confirmarCompraPO(WebDriver webdriver) {
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
    }

    private final By btn_Order_Locator = By.xpath("//button[contains(.,'Place Order')]");

    public void oprimirPlaceOrder() {
        WebElement btn_Order = wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Order_Locator));
        btn_Order.click();
    }
}
