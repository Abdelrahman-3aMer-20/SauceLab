package PageFactory.Tests;

import PageFactory.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CheckOutTest {

    WebDriver driver;
    LoginPage login;
    ProductPage productPage;
    CheckOutPage checkout;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amer\\IdeaProjects\\SauceLab\\src\\main\\java\\PageFactory\\Resourses\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        login = new LoginPage(driver);
        productPage = new ProductPage(driver);
        checkout  = new CheckOutPage(driver);
    }

    @Test
    public void addCartPositivescenario() throws InterruptedException {


        login.typeUsername("standard_user");
        Thread.sleep(1000);
        login.typePassword("secret_sauce");
        Thread.sleep(1000);
        login.clickLoginBtn();
        Thread.sleep(1000);
        productPage.clickAddToCart();
        Thread.sleep(1000);
        productPage.clickShoppingCart();
        Thread.sleep(1000);
        productPage.verifyProductAdded();
        Thread.sleep(1000);
        productPage.checkOut();
        Thread.sleep(1000);
        checkout.typeFirstName("Abdelrahman");
        Thread.sleep(1000);
        checkout.typeLastName("Amer");
        Thread.sleep(1000);
        checkout.typeZipCode("29154");
        checkout.clickContinueBtn();
        Thread.sleep(1000);
        checkout.clickFinishBtn();
    }

    @AfterClass
    public void tearDown() {
        // driver.quit();
    }
}
