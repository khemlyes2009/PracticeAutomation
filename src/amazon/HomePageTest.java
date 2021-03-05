package amazon;

import org.openqa.selenium.By;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class HomePageTest extends HomePageOld {

    @Test(priority = 1)
    public void testCheckSearchBox() {
        testSearchBox();
        String expectedText = "\"iphone pro 12 pro max\"";
        String actualResult = driver.findElement(By.cssSelector("#search > span > div > span > h1 > div > div.sg-col-14-of-20.sg-col.s-breadcrumb.sg-col-10-of-16.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold")).getText();
        Assert.assertEquals(expectedText, actualResult, "Product does not match");
    }

    @Test(priority = 2)
    public void testTitle() {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(expectedText, actualText, "Title does not match");
    }

    @Test(priority = 3)
    public void testFashion() {
        driver.findElement(By.xpath("//a[contains(text(),'Fashion')]")).click();
        String expectedResult = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 4)
    public void testTodaysDeals() {
        driver.findElement(By.linkText("Today's Deals")).click();
        String expectedResult = "Gold Box Deals | Today's Deals - Amazon.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 5)
    public void testCustomerService() {
        driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
        String expectedResult = "Amazon.com Help: Help & Customer Service";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 6)
    public void testPharmacy() {
        driver.findElement(By.xpath("//a[contains(text(),'Pharmacy')]")).click();
        String expectedResult = "Amazon.com: Pharmacy";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 7)
    public void testLanguage() {
        driver.findElement(By.cssSelector("#icp-nav-flyout > span > span.nav-line-2 > span.icp-nav-flag.icp-nav-flag-us")).click();
        String expectedResult = "Change Language & Currency Settings";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 8)
    public void testPrime() {
        driver.findElement(By.id("nav-link-prime")).click();
        String expectedResult = "Amazon.com: Amazon Prime";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 9)
    public void testToysAndGames() {
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        String expectedResult = "Amazon.com: Toys & Games";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 10)
    public void testVerifyLogo() {
        boolean flag = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
        Assert.assertTrue(flag);
    }

    @Test(priority = 11)
    public void testSell() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[14]")).click();
        String expectedResult = "Amazon.com: Sell Products Online with Selling on Amazon.";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 12)
    public void testSignIn() {
        driver.findElement(new By.ByCssSelector("#nav-link-accountList")).click();
        String expectedResult = "Amazon Sign-In";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 13)
    public void testFindAGift() {
        driver.findElement(By.xpath("//a[contains(text(),'Find a Gift')]")).click();
        String expectedResult = "Gifts for Everyone | Amazon.com Gift Finder";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 14)
    public void testKindleBooks() {
        driver.findElement(By.xpath("//a[contains(text(),'Kindle Books')]")).click();
        String expectedResult = "Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 15)
    public void testNewReleases() {
        driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();
        String expectedResult = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 16)
    public void testGiftCards() {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        String expectedResult = "Amazon.com Gift Cards";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 17)
    public void testAmazonAndCovid19() {
        driver.findElement(By.xpath("//a[contains(text(),'Amazon and COVID-19')]")).click();
        String expectedResult = "Amazon.com Help: FAQs about Orders and Deliveries and the COVID-19 virus";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 18)
    public void testChangeLanguageToSpanish() {
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/span")).click();
        driver.findElement(By.className("a-button-input")).click();
        String expectedResult = "Amazon.com: Compras en Línea de Electrónicos, Ropa, Computadoras, Libros, DVDs y más";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 19)
    public void testEchoFlex() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Echo & Alexa')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Echo Flex')]")).click();
        String expectedResult = "Amazon.com: Echo Flex - Plug-in mini smart speaker with Alexa: Amazon Devices";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 20)
    public void testBackToTop() {
        driver.findElement(By.cssSelector("#navBackToTop > div > span")).click();
        String expectedResult = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 21)
    public void testBestSeller() {
        driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
        String expectedResult = "Amazon.com Best Sellers: The most popular items on Amazon";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 22)
    public void testAmazonHome() {
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Home')]")).click();
        String expectedResult = "Shop Amazon Home Products";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 23)
    public void testSignInEmail() {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("khemlyes2009@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        String expectedResult = "Amazon Sign-In";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 24)
    public void testAmazonMusicHD() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Amazon Music')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Music HD')]")).click();
        String expectedResult = "Amazon Music HD | Highest Quality Streaming Audio";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 25)
    public void testFireTVStick4K() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Fire TV')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Fire TV Stick 4K')]")).click();
        String expectedResult = "Amazon.com: Fire TV Stick 4K streaming device with Alexa Voice Remote | Dolby Vision | 2018 release: Amazon Devices";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 26)
    public void testExploreWholeFoodsMarket() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Whole Foods Market')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Explore Whole Foods Market')]")).click();
        String expectedResult = "Amazon.com: Whole Foods Market";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 27)
    public void testCareers() {
        driver.findElement(By.linkText("Careers")).click();
        String expectedResult = "Amazon.jobs: Help us build Earth’s most customer-centric company.";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 28)
    public void testAboutAmazon() {
        driver.findElement(By.linkText("About Amazon")).click();
        String expectedResult = "About Amazon";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 29)
    public void testPrivacyNotice() {
        driver.findElement(By.linkText("Privacy Notice")).click();
        String expectedResult = "Amazon.com Help: Amazon.com Privacy Notice";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }

    @Test(priority = 30)
    public void testCreditCardMarketPlace() {
        driver.findElement(By.linkText("Credit Card Marketplace")).click();
        String expectedResult = "Credit Cards and Payment Cards: Compare and Review at Amazon.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Element does not match");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit(); // Close all windows
    }
}






