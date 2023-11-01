package page;

import base.BaseTest;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TheInternetHeroKuAppLoginPage extends BaseTest {

    public TheInternetHeroKuAppLoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "example")
    WebElement loginPageHeader2;

    @FindBy (className = "subheader")
    WebElement textExplenation;

    @FindBy (id="username")
    WebElement usernameField;

    @FindBy (id="password")
    WebElement passwordField;

    @FindBy (className = "radius")
    WebElement loginButon;

    @FindBy (xpath = "//a[@target='_blank']")
    WebElement elementalSeleniumLink;

    @FindBy (xpath = "//img[@alt='Fork me on GitHub']")
    WebElement forkMeOnGitHubLink;

    @FindBy (id="flash-messages")
    WebElement youLoggedOutOfTheSecureAreaMessage;

    @FindBy (id="flash")
    WebElement yourUsernameIsInvalidMessage;




    public boolean loginPageHeader2TextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(loginPageHeader2));
        return loginPageHeader2.isDisplayed();
    }

    public String loginPageHeader2TextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(loginPageHeader2));
        return loginPageHeader2.getText();
    }

    public boolean textExplenationHeader4IsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(textExplenation));
        return textExplenation.isDisplayed();
    }

    public String textExplenationHeader4GetText(){
        wdWait.until(ExpectedConditions.visibilityOf(textExplenation));
        return textExplenation.getText();
    }

    public void usernameInputFieldSendKeys(String username) {
        wdWait.until(ExpectedConditions.visibilityOf(usernameField)).clear();
        usernameField.sendKeys(username);
    }

    public void passwordInputFieldSendKeys(String password) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void loginButtonClick() {
        wdWait.until(ExpectedConditions.visibilityOf(loginButon)).click();
    }

    public void forkMeOnGitHubLinkClick(){
        wdWait.until(ExpectedConditions.visibilityOf(forkMeOnGitHubLink)).click();
    }

    public void elementalSeleniumLinkTextClick(){
        wdWait.until(ExpectedConditions.visibilityOf(elementalSeleniumLink)).click();
    }

    public boolean youLoggedOutOfTheSecureAreaMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(youLoggedOutOfTheSecureAreaMessage));
        return youLoggedOutOfTheSecureAreaMessage.isDisplayed();
    }

    public String youLoggedOutOfTheSecureAreaMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(youLoggedOutOfTheSecureAreaMessage));
        return youLoggedOutOfTheSecureAreaMessage.getText();
    }

    public boolean yourUsernameIsInvalidMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(yourUsernameIsInvalidMessage));
        return yourUsernameIsInvalidMessage.isDisplayed();
    }

    public String yourUsernameIsInvalidMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(yourUsernameIsInvalidMessage));
        return yourUsernameIsInvalidMessage.getText();
    }
}
