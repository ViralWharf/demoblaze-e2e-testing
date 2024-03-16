package pageObjects.Signup;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class crearUsuarioPO {

    private final WebDriver webdriver;
    private final WebDriverWait wait;

    public crearUsuarioPO(WebDriver webdriver) {
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
    }

    private final By input_User_Locator = By.id("sign-username");
    private final By input_Password_Locator = By.xpath("//input[contains(@id,'sign-password')]");
    private final By btn_Signup_Locator = By.xpath("//a[contains(.,'Sign up')]");
    private final By btn_Accept_Signup_Locator = By.xpath("//button[contains(.,'Sign up')]");

    public void ingresarCredenciales(String user, String password) {
        WebElement input_User = wait.until(ExpectedConditions.visibilityOfElementLocated(input_User_Locator));
        WebElement input_Password = wait.until(ExpectedConditions.visibilityOfElementLocated(input_Password_Locator));
        WebElement btn_Accept_Signup = webdriver.findElement(btn_Accept_Signup_Locator);

        input_User.sendKeys(user + nombreAleatorio());
        input_Password.sendKeys(password + nombreAleatorio());
        btn_Accept_Signup.click();
    }

    public void seleccionarSignUp() {
        WebElement btn_Signup = webdriver.findElement(btn_Signup_Locator);
        btn_Signup.click();
    }

    public void validarPopUp(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert popUp = webdriver.switchTo().alert();
        String mensajePopUp = popUp.getText();
        Assert.assertEquals(mensajePopUp, "Sign up successful.", "El mensaje del PopUp no coincide con el esperado");
        popUp.accept();
    }

    public String nombreAleatorio(){
        return RandomStringUtils.randomAlphabetic(8);
    }
}

