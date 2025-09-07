package PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class LoginPage {
     WebDriver driver;

    By username_txtfield = By.id("user-name");
    By password_txtfield = By.id("password");
    By clickLoginBtn = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void typeUsername (String username){
        driver.findElement(username_txtfield).sendKeys(username);
    }

    public void typePassword (String password){
        driver.findElement(password_txtfield).sendKeys(password);
    }

    public void clickLoginBtn (){
        driver.findElement(clickLoginBtn).click();
    }

    public void VerifyUsername( String username){

        Assert.assertEquals(driver.findElement(username_txtfield).getText(),username);

    }

    public void VerifyPassword( String password){

        Assert.assertEquals(driver.findElement(password_txtfield).getText(),password);

    }

    public void VerifyClick_Btn(String redirectoryURL){

        Assert.assertEquals(driver.getCurrentUrl(),redirectoryURL);

    }

}
