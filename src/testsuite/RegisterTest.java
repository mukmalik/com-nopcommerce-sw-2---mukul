package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest
    {

        String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void setUp()
        {
            openBrowser(baseUrl);
        }

        // 5 Write down the following test into ‘RegisterTest’
        //class




        @Test
        public void userShouldNavigateToRegisterPageSuccessfully()
        {
            // 5.1 click on the ‘Register’ link
            driver.findElement(By.className("ico-register")).click();

            // 5.1 Verify the text ‘Register’
            String verifyText = "Register";
            WebElement registerLink = driver.findElement(By.xpath("//h1"));
            String expectedText = registerLink.getText();
            Assert.assertEquals("Verifying 'Register", verifyText, expectedText);

        }

        @Test
        public void userShouldRegisterAccountSuccessfully()
        {

            //click on the ‘Register’ link
            driver.findElement(By.className("ico-register")).click();

            //Select gender radio button
            driver.findElement(By.id("gender-male")).click();

            //Enter First Name
            driver.findElement(By.id("FirstName")).sendKeys("Ram");

            //Enter Last Name
            driver.findElement(By.id("LastName")).sendKeys("Dass");

            //Enter Date of Birth
            driver.findElement(By.name("DateOfBirthDay")).sendKeys("07");

            //Enter Month Of Birth
            driver.findElement(By.name("DateOfBirthMonth")).sendKeys("7");

            //Enter Year of Birth
            driver.findElement(By.name("DateOfBirthYear")).sendKeys("1977");

            //Enter Email-id
            driver.findElement(By.id("Email")).sendKeys("dass@dass.com");

            //Enter Password
            driver.findElement(By.id("Password")).sendKeys("Pa55word");

            //Confirm Password
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Pa55word");

            //Click on register
            driver.findElement(By.name("register-button")).click();


            //Verify the text ‘Register’
            String expectedText = "Your registration completed";
            WebElement registration = driver.findElement(By.xpath("//div[@class='result']"));
            String actualText = registration.getText();
            Assert.assertEquals(" ", expectedText, actualText);
        }

        //Annotation
        @After
        public void tearDown()
        {
            driver.close();
        }
    }
