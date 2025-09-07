package PageFactory.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {

    WebDriver driver;

    By addToCartBtn = By.cssSelector("button[name=\"add-to-cart-sauce-labs-backpack\"]");
    By shoppingCartLnk = By.xpath("//a[@class=\"shopping_cart_link\"]");
    By verifyPackBackBtn = By.id("remove-sauce-labs-backpack");
    By checkout = By.id("checkout");


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void clickShoppingCart() {
        driver.findElement(shoppingCartLnk).click();
    }

    public void checkOut() {
        driver.findElement(checkout).click();
    }

    public void verifyProductAdded() {
        Assert.assertTrue(driver.findElement(verifyPackBackBtn).isDisplayed(), "Product not added.");
    }
}
