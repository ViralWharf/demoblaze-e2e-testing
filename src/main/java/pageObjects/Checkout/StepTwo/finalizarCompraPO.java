package pageObjects.Checkout.StepTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class finalizarCompraPO {
    private final WebDriver webdriver;

    public finalizarCompraPO(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    private final By btn_Finish_Locator = By.xpath("//button[@data-test='finish']");
    private final By label_Total_Locator = By.xpath("//div[@class='summary_info_label summary_total_label']");
    public void oprimirFinalizarCompra() {
        WebElement btn_Finish = webdriver.findElement(btn_Finish_Locator);
        WebElement label_Total = webdriver.findElement(label_Total_Locator);
        Assert.assertEquals(label_Total.getText(), "Total: $43.18");
        btn_Finish.click();
    }
}
