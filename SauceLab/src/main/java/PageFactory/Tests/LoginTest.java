package PageFactory.Tests;

import PageFactory.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class LoginTest {

    WebDriver driver;
    LoginPage login;

    @BeforeClass
    public void setUp(){

       System.setProperty("webdriver.chrome.driver","C:\\Users\\amer\\IdeaProjects\\SauceLab\\src\\main\\java\\PageFactory\\Resourses\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        driver.manage().window().maximize();

    }


    @Test
    public void loginpositivescenario() throws InterruptedException {

        login.typeUsername("standard_user");
        Thread.sleep(1000);
        login.typePassword("secret_sauce");
        Thread.sleep(1000);
        login.clickLoginBtn();
        login.VerifyClick_Btn("https://www.saucedemo.com/inventory.html");

    }



}
