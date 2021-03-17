package cigna;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageCignaTest extends HomePageCigna{

    @Test
    public void testCheckSearchBox() throws InterruptedException {
        checkSearchBox();
        String expectedText = "primary doctor";
        String actualText = driver.findElement(By.xpath("//strong[.='primary doctor']")).getText();
        Assert.assertEquals(expectedText, actualText, "Product does not match");
    }

    @Test
    public void testCheckLogo(){
        checkLogo();
    }

    @Test
    public void testLogin() throws InterruptedException {
        login();
        String expectedTitle = "myCigna - Get Access to Your Personal Health Information";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title does not match");
    }

    @Test
    public void testBuyCoverage() throws InterruptedException {
        buyCoverage();
        String expectedTitle = "Johnson Kansas Health Insurance Plans and Coverage | Cigna";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title does not match");
    }
}
