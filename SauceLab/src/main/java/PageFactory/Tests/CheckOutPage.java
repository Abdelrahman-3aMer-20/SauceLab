package PageFactory.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    WebDriver driver;

    By firstname_txtfield = By.id("first-name");
    By lastname_txtfield = By.id("last-name");
    By zipcode_txtfield = By.id("postal-code");
    By clickcontinuebtn = By.id("continue");
    By clickfinishbtn = By.id("finish");

    public CheckOutPage (WebDriver driver){
        this.driver = driver;
    }

    public void typeFirstName(String firstname){
        driver.findElement(firstname_txtfield).sendKeys(firstname);
    }

    public void typeLastName (String lastname){
        driver.findElement(lastname_txtfield).sendKeys(lastname);
    }

    public void typeZipCode (String zipcode){
        driver.findElement(zipcode_txtfield).sendKeys(zipcode);
    }

    public void clickContinueBtn(){
        driver.findElement(clickcontinuebtn).click();
    }

    public void clickFinishBtn(){
        driver.findElement(clickfinishbtn).click();
    }

}
