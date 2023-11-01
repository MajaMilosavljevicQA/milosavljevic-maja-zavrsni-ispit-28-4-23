package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import page.TheInternetHeroKuAppElementalSeleniumLinkNewTab;
import page.TheInternetHeroKuAppForkMeOnGitHubImageLink;
import page.TheInternetHeroKuAppLoginPage;
import page.TheInternetHeroKuAppSecureArea;

public class TheInternetHeroKuAppTests extends BaseTest {

    TheInternetHeroKuAppLoginPage theInternetHeroKuAppLoginPage;
    TheInternetHeroKuAppSecureArea theInternetHeroKuAppSecureArea;
    TheInternetHeroKuAppForkMeOnGitHubImageLink theInternetHeroKuAppForkMeOnGitHubImageLink;
    TheInternetHeroKuAppElementalSeleniumLinkNewTab theInternetHeroKuAppElementalSeleniumLinkNewTab;


   @Before
    public void setUpTheInternetHeroKuApp (){

       theInternetHeroKuAppLoginPage = new TheInternetHeroKuAppLoginPage();
       theInternetHeroKuAppSecureArea = new TheInternetHeroKuAppSecureArea();
       theInternetHeroKuAppElementalSeleniumLinkNewTab = new TheInternetHeroKuAppElementalSeleniumLinkNewTab();
       theInternetHeroKuAppForkMeOnGitHubImageLink = new TheInternetHeroKuAppForkMeOnGitHubImageLink();

   }

    @Test
    public void singInWithCorrectUsernameAndPasswordValuesWithLogoutClickAtTheEndAndElementalSeleniumLinkTextClick(){
       theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
       theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();
        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        String username = "tomsmith";
        String password = "SuperSecretPassword!";
        theInternetHeroKuAppLoginPage.usernameInputFieldSendKeys(username);
        theInternetHeroKuAppLoginPage.passwordInputFieldSendKeys(password);
        theInternetHeroKuAppLoginPage.loginButtonClick();

        theInternetHeroKuAppSecureArea.youAreLoggedIntoASecureAreaMessageIsDisplayed();
        theInternetHeroKuAppSecureArea.youAreLoggedIntoASecureAreaMessageGetText();
        Assert.assertTrue(theInternetHeroKuAppSecureArea.youAreLoggedIntoASecureAreaMessageIsDisplayed());
        Assert.assertEquals("You logged into a secure area!\n" + "×", theInternetHeroKuAppSecureArea.youAreLoggedIntoASecureAreaMessageGetText());

        theInternetHeroKuAppSecureArea.secureAreaTextHeader2IsDisplayed();
        theInternetHeroKuAppSecureArea.secureAreaTextHeader2GetText();
        Assert.assertTrue(theInternetHeroKuAppSecureArea.secureAreaTextHeader2IsDisplayed());
        Assert.assertEquals("Secure Area",theInternetHeroKuAppSecureArea.secureAreaTextHeader2GetText());
        theInternetHeroKuAppSecureArea.welcomeToTheSecureAreaMessageIsDisplayed();
        theInternetHeroKuAppSecureArea.welcomeToTheSecureAreaMessageGetText();
        Assert.assertTrue(theInternetHeroKuAppSecureArea.welcomeToTheSecureAreaMessageIsDisplayed());
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.",theInternetHeroKuAppSecureArea.welcomeToTheSecureAreaMessageGetText());

        theInternetHeroKuAppSecureArea.logoutButtonClick();
        theInternetHeroKuAppLoginPage.youLoggedOutOfTheSecureAreaMessageIsDisplayed();
        theInternetHeroKuAppLoginPage.youLoggedOutOfTheSecureAreaMessageGetText();
        Assert.assertTrue(theInternetHeroKuAppSecureArea.youAreLoggedIntoASecureAreaMessageIsDisplayed());
        Assert.assertEquals("You logged out of the secure area!\n" +
                "×",theInternetHeroKuAppSecureArea.youAreLoggedIntoASecureAreaMessageGetText());

        theInternetHeroKuAppLoginPage.elementalSeleniumLinkTextClick();

        theInternetHeroKuAppElementalSeleniumLinkNewTab.switchFocusToNewTab();


    }

    @Test
    public void forkMeOnGitHubImageLinkClick (){
        theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
        theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();
        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        theInternetHeroKuAppLoginPage.forkMeOnGitHubLinkClick();
    }

    @Test
    public void allLoginFieldsEmty () {
        theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
        theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        theInternetHeroKuAppLoginPage.loginButtonClick();

        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed();
        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText());

    }

    @Test
    public void emptyUsernameCorrectPasswordField (){
        theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
        theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        String password = "SuperSecretPassword!";

        theInternetHeroKuAppLoginPage.passwordInputFieldSendKeys(password);

        theInternetHeroKuAppLoginPage.loginButtonClick();

        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed();
        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText());


    }
    @Test
    public void emptyPasswordCorrectUsernameField (){
        theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
        theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        String username = "tomsmith";

        theInternetHeroKuAppLoginPage.usernameInputFieldSendKeys(username);

        theInternetHeroKuAppLoginPage.loginButtonClick();

        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed();
        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed());
        Assert.assertEquals("Your password is invalid!\n" + "×", theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText());


    }

    @Test
    public void usernameAllCapsLockPasswordCorrect () {
        theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
        theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        String password = "SuperSecretPassword!";
        String username = "TOMSMITH";

        theInternetHeroKuAppLoginPage.usernameInputFieldSendKeys(username);

        theInternetHeroKuAppLoginPage.passwordInputFieldSendKeys(password);

        theInternetHeroKuAppLoginPage.loginButtonClick();

        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed();
        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×", theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText());

    }

    @Test
    public void passwordllCapsLockUsernameCorrect () {
        theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed();
        theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.loginPageHeader2TextIsDisplayed());
        Assert.assertEquals("Login Page\n" + "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.\n" + "Username\n" + "Password\n" + "Login", theInternetHeroKuAppLoginPage.loginPageHeader2TextGetText());

        String password = "SUPERSECRETPASSWORD!";
        String username = "tomsmith";

        theInternetHeroKuAppLoginPage.usernameInputFieldSendKeys(username);

        theInternetHeroKuAppLoginPage.passwordInputFieldSendKeys(password);

        theInternetHeroKuAppLoginPage.loginButtonClick();

        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed();
        theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText();

        Assert.assertTrue(theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageIsDisplayed());
        Assert.assertEquals("Your password is invalid!\n" + "×", theInternetHeroKuAppLoginPage.yourUsernameIsInvalidMessageGetText());

    }
}
