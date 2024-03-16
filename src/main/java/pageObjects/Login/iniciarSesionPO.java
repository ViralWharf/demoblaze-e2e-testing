package pageObjects.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iniciarSesionPO {

    private final WebDriver webdriver;
    public iniciarSesionPO(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    private final By input_User_Locator = By.xpath("//input[@placeholder='Username']");
    private final By input_Password_Locator = By.xpath("//input[contains(@placeholder,'Password')]");
    private final By btn_Login_Locator = By.xpath("//input[contains(@type,'submit')]");

    public void ingresarCredenciales(String user, String password){
        WebElement input_User = webdriver.findElement(input_User_Locator);
        WebElement input_Password = webdriver.findElement(input_Password_Locator);
        WebElement btn_Login = webdriver.findElement(btn_Login_Locator);

        input_User.sendKeys(user);
        input_Password.sendKeys(password);
        btn_Login.click();
    }
}

