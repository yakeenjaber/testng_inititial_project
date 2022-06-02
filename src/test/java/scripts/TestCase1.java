package scripts;

import Pages.CarsHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Waiters;

public class TestCase1 extends Base {


    @Test
    public void testCarsHeading(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.signInPageHeader1.getText(), "Sign in");
    }

    @Test
    public void testCarsParagraph(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.signInPageHeader2.getText(), "New to Cars.com? Sign up. Are you a dealer?");
    }

    @Test
    public void testEmailInputAndLabel(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.emailLabel.getText(), "Email");
        Assert.assertTrue(carsSignInPage.emailInputBox.isEnabled());
    }

    @Test
    public void testPasswordInputAndLabel(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.passwordLabel.getText(),"Password");
        Assert.assertTrue(carsSignInPage.passwordInputBox.isEnabled());
    }

    @Test
    public void testPasswordMinChars(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.passwordWarning.getText(), "Minimum of eight characters");
    }
    @Test
    public void testForgotPassword(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertTrue(carsSignInPage.forgotPassword.isDisplayed());
    }

    @Test
    public void testPrivacyStatementText(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.privacyStatement.getText(), "By signing in to your profile, you agree to our  Privacy Statement  and  Terms of Service.");
    }

    @Test
    public void testSignInButton(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.signInButton.getText(), "Sign in");
        Assert.assertTrue(carsSignInPage.signInButton.isDisplayed() && carsSignInPage.signInButton.isEnabled());
    }
}
