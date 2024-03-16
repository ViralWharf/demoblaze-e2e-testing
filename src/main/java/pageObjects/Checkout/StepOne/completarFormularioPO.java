package pageObjects.Checkout.StepOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class completarFormularioPO {
    private final WebDriver webdriver;

    public completarFormularioPO(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    private final By input_First_Name_Locator = By.xpath("//input[@name='firstName']");
    private final By input_Last_Name_Locator = By.xpath("//input[@name='lastName']");
    private final By input_Zip_Locator = By.xpath("//input[@name='postalCode']");

    private final By btn_Continue_Locator = By.xpath("//input[contains(@type,'submit')]");

    public void ingresarDatosFormulario(String FirstName, String LastName, String Zip) {
        WebElement input_First_Name = webdriver.findElement(input_First_Name_Locator);
        WebElement input_Last_Name = webdriver.findElement(input_Last_Name_Locator);
        WebElement input_Zip = webdriver.findElement(input_Zip_Locator);

        input_First_Name.sendKeys(FirstName);
        input_Last_Name.sendKeys(LastName);
        input_Zip.sendKeys(Zip);
    }

    public void seleccionarContinuar() {
        WebElement btn_Continue = webdriver.findElement(btn_Continue_Locator);
        btn_Continue.click();
    }
}
