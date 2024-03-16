package pageObjects.Checkout.StepOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class completarFormularioPO {
    private final WebDriver webdriver;
    private final WebDriverWait wait;

    public completarFormularioPO(WebDriver webdriver) {
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
    }

    private final By input_Name_Locator = By.xpath("//input[@id='name']");
    private final By input_Country_Locator = By.xpath("//input[contains(@id,'country')]");
    private final By input_City_Locator = By.xpath("//input[contains(@id,'city')]");
    private final By input_CreditCard_Locator = By.xpath("//input[contains(@id,'card')]");
    private final By input_Month_Locator = By.xpath("//input[contains(@id,'month')]");
    private final By input_Year_Locator = By.xpath("//input[contains(@id,'year')]");

    private final By btn_Purchase_Locator = By.xpath("//button[contains(.,'Purchase')]");

    public void ingresarDatosFormulario(String name, String country, String city, String creditCard, String month, String year) {
        WebElement input_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(input_Name_Locator));
        WebElement input_Country = wait.until(ExpectedConditions.visibilityOfElementLocated(input_Country_Locator));
        WebElement input_City = wait.until(ExpectedConditions.visibilityOfElementLocated(input_City_Locator));
        WebElement input_CreditCard = wait.until(ExpectedConditions.visibilityOfElementLocated(input_CreditCard_Locator));
        WebElement input_Month = wait.until(ExpectedConditions.visibilityOfElementLocated(input_Month_Locator));
        WebElement input_Year = wait.until(ExpectedConditions.visibilityOfElementLocated(input_Year_Locator));

        input_Name.sendKeys(name);
        input_Country.sendKeys(country);
        input_City.sendKeys(city);
        input_CreditCard.sendKeys(creditCard);
        input_Month.sendKeys(month);
        input_Year.sendKeys(year);
    }

    public void seleccionarComprar() {
        WebElement btn_Purchase = wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Purchase_Locator));
        btn_Purchase.click();
    }
}
