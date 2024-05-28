package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest
{
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //Annotation
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Computers')]")).click();

        //Verify the computer text
        String expectedText = "Computers";
        WebElement computersElement = driver.findElement(By.xpath("//h1"));
        String actualText = computersElement.getText();
        Assert.assertEquals("Verifying text for computers", expectedText, actualText);


    }

    //Annotation
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]")).click();

        //Verify the computer text
        String expectedText = "Electronics";
        WebElement electronicsElement = driver.findElement(By.xpath("//h1"));
        String actualText = electronicsElement.getText();
        Assert.assertEquals("Verifying text for Electrinics", expectedText, actualText);
    }

    //Annotation
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Apparel')]")).click();

        //Verify the computer text
        String expectedText = "Apparel";
        WebElement apparelElement = driver.findElement(By.xpath("//h1"));
        String actualText = apparelElement.getText();
        Assert.assertEquals("Verifying text", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Digital downloads')]")).click();

        //Verify the computer text
        String expectedText = "Digital downloads";
        WebElement digitaldownloadsElement = driver.findElement(By.xpath("//h1"));
        String actualText = digitaldownloadsElement.getText();
        Assert.assertEquals("Verifyinf digital text", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Books')]")).click();

        //Verify the computer text
        String expectedText = "Books";
        WebElement booksElement = driver.findElement(By.xpath("//h1"));
        String actualText = booksElement.getText();
        Assert.assertEquals("Verifying the book text", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Jewelry')]")).click();

        //Verify the computer text
        String expectedText = "Jewelry";
        WebElement jewelryElement = driver.findElement(By.xpath("//h1"));
        String actualText = jewelryElement.getText();
        Assert.assertEquals("Verifying the jewelry text", expectedText, actualText);

    }

    //Annotation
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//a[contains(text(), 'Gift Cards')]")).click();

        //Verify the computer text
        String expectedText = "Gift Cards";
        WebElement giftCardsElement = driver.findElement(By.xpath("//h1"));
        String actualText = giftCardsElement.getText();
        Assert.assertEquals("Verifying the computer text", expectedText, actualText);
    }

    //Annotation
    @After
    public void tearDown() {
        driver.close();

    }
}
