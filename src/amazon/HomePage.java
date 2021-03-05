package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    String amazonUrl="https://www.amazon.com/";
    String productName="iphone pro 12 pro max";
    String searchBoxLocator="twotabsearchtextbox";
    String searchButtonLocator="nav-search-submit-button";

    @BeforeMethod
    public void setUp(){
        String chromeDriverPath = "BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    // Action Method
    public void checkSearchBox(){
        // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // click on searchButton
        driver.findElement(By.id(searchButtonLocator)).click();
    }

    @AfterMethod
    public void tearDown(){
        // driver.close();
        driver.quit();
    }












}
