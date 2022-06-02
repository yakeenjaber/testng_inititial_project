package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends Base{

    @Test
    public void testConnectSocialHeader(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.connectSocial.getText(), "Connect with social");
    }

    @Test
    public void testSignInFacebook(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.signInFacebook.getText(), "Sign in with Facebook");
        Assert.assertTrue(carsSignInPage.signInFacebook.isDisplayed() && carsSignInPage.signInFacebook.isEnabled());
    }

    @Test
    public void testSignInGoogle(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.signInGoogle.getText(), "Sign in with Google");
        Assert.assertTrue(carsSignInPage.signInGoogle.isDisplayed() && carsSignInPage.signInGoogle.isEnabled());
    }

    @Test
    public void testSignInApple(){
        driver.get("https://www.cars.com");
        carsHomePage.signInButton.click();
        Assert.assertEquals(carsSignInPage.signInApple.getText(), "Sign in with Apple");
        Assert.assertTrue(carsSignInPage.signInApple.isDisplayed() && carsSignInPage.signInApple.isEnabled());
    }


}
