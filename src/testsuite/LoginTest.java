package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest
{
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }

    // 3.1 test into ‘LoginTest’ class
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        // 3.1 click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();


        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();

        // 3.1 Verify the text ‘Welcome, Please Sign in!
        Assert.assertEquals("Actual and expected", expectedText,actualText);

        // going to home page
        driver.navigate().back();
    }

    @Test
    // 3.2 test into ‘LoginTest’ class
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        // 3.2 click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //  3.2 Enter valid username
        driver.findElement(By.id("Email")).sendKeys("Admin@admin.com");

        // 3.2 Enter valid password
        driver.findElement(By.id("Password")).sendKeys("123456");

        // 3.2 Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        // 3.2 Verify the ‘Log out’ text is display
        //driver.findElement(By.xpath("//a[text()='Log out']")).click();

        // 3.2 Verify the ‘Log out’ text is display
        String expectedDisplay = "Log out";
        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log out']"));
        String logOutText = logOut.getText();
        Assert.assertEquals("Log out", expectedDisplay, logOutText);

        // Log out
        //driver.findElement(By.xpath("//a[text()='Log out']")).click();
    }

    @Test
    public void verifyTheErrorMessage()
    {
        // 3.3 Click on login button
        driver.findElement(By.linkText("Log in")).click();

        // 3.3 Enter Invalid username
        driver.findElement(By.id("Email")).sendKeys("abcd@abc.com");

        // 3.3 Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("pass123");

        // 3.3 Click on Login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        // 3.3 Verify the error message
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown()
    {
        driver.close();
    }
}
