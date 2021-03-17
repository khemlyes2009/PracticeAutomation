package cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePageCigna {

    WebDriver driver;
    String cignaUrl = "https://www.cigna.com/";
    String searchBox = "#search-desktop";
    String element = "primary doctor";
    String searchButton = "//div[@class='input-group input-group-search rounded-0']//button[@class='btn btn-sm']";
    String logo = "individuals-families-level-one-link";
    String login = "//ul[@class='navbar-nav']//a[contains(.,'Log in to myCigna')]";
    String username = "#username";
    String password = "#password";
    String loginButton = "//input[@id='loginbutton']";
    String healthInsurance = "Health Insurance for Individuals and Families";
    String healthPlans = ".subhead-2";
    String selectState = "//select[@id='landing-state-chooser']";
    String selectCounty = "//select[@id='landing-county-chooser']";
    String seePlans = "//button[.='See Plans']";


    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(cignaUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


// Action methods

    public void checkSearchBox() throws InterruptedException {
        driver.findElement(By.cssSelector(searchBox)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(searchBox)).sendKeys(element);
        Thread.sleep(3000);
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(3000);
    }

    public void checkLogo() {
        boolean isDisplayed = driver.findElement(By.id(logo)).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    public void login() throws InterruptedException {
        driver.findElement(By.xpath(login)).click();
        Thread.sleep(3000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow= it.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(username)).sendKeys("khemlyes2009");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(password)).sendKeys("cigna12344");
        Thread.sleep(3000);
        driver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(3000);
    }

    public void buyCoverage() throws InterruptedException {
        WebElement desiredElement = driver.findElement(By.linkText(healthInsurance));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",desiredElement);
        Thread.sleep(5000);
        desiredElement.click();
        Thread.sleep(3000);

        WebElement desiredElement2 = driver.findElement(By.cssSelector(healthPlans));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();",desiredElement2);
        Thread.sleep(5000);

        Select select = new Select(driver.findElement(By.xpath(selectState)));
        select.selectByVisibleText("Kansas");
        Thread.sleep(3000);

        Select select1 = new Select(driver.findElement(By.xpath(selectCounty)));
        select1.selectByVisibleText("Johnson");
        Thread.sleep(3000);

        driver.findElement(By.xpath(seePlans)).click();
        Thread.sleep(3000);

    }



}
