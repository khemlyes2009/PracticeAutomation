package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomePageOld {

    String url1 = "https://www.amazon.com";

    String searchBox = "twotabsearchtextbox";
    String element = "iphone pro 12 pro max";
    String searchButton = "nav-search-submit-button";
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        String driverPath = "BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(url1);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    // Action method
    public void testSearchBox() {
        // enter product name
        driver.findElement(By.id(searchBox)).sendKeys(element);
        // click on search button
        driver.findElement(By.id(searchButton)).click();


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close(); // close only one window
        driver.quit(); // Close all windows
    }


}

