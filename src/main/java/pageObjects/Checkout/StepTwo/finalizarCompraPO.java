package pageObjects.Checkout.StepTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class finalizarCompraPO {
    private final WebDriver webdriver;
    private final WebDriverWait wait;

    public finalizarCompraPO(WebDriver webdriver) {
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
    }

    private final By btn_Finish_Locator = By.xpath("//button[contains(.,'OK')]");
    public void oprimirFinalizarCompra() {
        WebElement btn_Finish = webdriver.findElement(btn_Finish_Locator);
        btn_Finish.click();
    }
}
