package PageFactory.Tests;

import PageFactory.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ProductPageTest {

    WebDriver driver;
    LoginPage login;
    ProductPage productPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amer\\IdeaProjects\\SauceLab\\src\\main\\java\\PageFactory\\Resourses\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        login = new LoginPage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void addCartPositivescenario() {


        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLoginBtn();
        productPage.clickAddToCart();
        productPage.clickShoppingCart();
        productPage.verifyProductAdded();
        productPage.checkOut();
    }

    @AfterClass
    public void tearDown() {
      // driver.quit();
    }
}
