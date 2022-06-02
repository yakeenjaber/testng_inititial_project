package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends Base{

    @Test
    public void testInvalidCredentials(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        carsSignInPage.emailInputBox.sendKeys("johndoe@gmail.com");
        carsSignInPage.passwordInputBox.sendKeys("abcd1234");
        carsSignInPage.signInButton.click();
        Assert.assertEquals(carsSignInPage.unrecognizedEmailTitle.getText(), "We were unable to sign you in.");
        Assert.assertEquals(carsSignInPage.unrecognizedEmailDescription.getText(), "Your email or password was not recognized. Try again soon.");

    }
}
