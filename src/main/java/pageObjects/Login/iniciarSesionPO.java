package pageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class iniciarSesionPO {

    private final WebDriver webdriver;
    private final WebDriverWait wait;
    public iniciarSesionPO(WebDriver webdriver) {
        this.webdriver = webdriver;
        this.wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
    }

    private final By input_User_Locator = By.xpath("//input[@id='loginusername']");
    private final By input_Password_Locator = By.xpath("//input[@id='loginpassword']");
    private final By btn_Login_Locator = By.xpath("//a[contains(.,'Log in')]");
    private final By btn_Iniciar_Sesion_Locator = By.xpath("//button[contains(.,'Log in')]");

    public void ingresarCredenciales(String user, String password){
        WebElement input_User = wait.until(ExpectedConditions.visibilityOfElementLocated(input_User_Locator));
        WebElement input_Password = wait.until(ExpectedConditions.visibilityOfElementLocated(input_Password_Locator));
        WebElement btn_Login = webdriver.findElement(btn_Iniciar_Sesion_Locator);

        input_User.sendKeys(user);
        input_Password.sendKeys(password);
        btn_Login.click();
    }

    public void seleccionarLogin() {
        WebElement btn_Login = wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Login_Locator));
        btn_Login.click();
    }
}

