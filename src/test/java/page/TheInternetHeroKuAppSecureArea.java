package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TheInternetHeroKuAppSecureArea extends BaseTest {

    public TheInternetHeroKuAppSecureArea(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="flash")
    WebElement youAreLoggedIntoASecureAreaMessage;

    @FindBy (xpath = "//h2[normalize-space()='Secure Area']")
    WebElement secureAreaHeader2;

    @FindBy (css = "[class=\"subheader\"]")
    WebElement welcomeToTheSecureAreaMessageHeader4;

    @FindBy (css = "[class=\"button secondary radius\"]")
    WebElement logoutButton;

    @FindBy (linkText = "Elemental Selenium")
    WebElement elementalSeleniumLinkTextFooter;

    @FindBy (xpath = "//img[@alt='Fork me on GitHub']")
    WebElement forkMeOnGitHubLink;

    public boolean youAreLoggedIntoASecureAreaMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(youAreLoggedIntoASecureAreaMessage));
        return youAreLoggedIntoASecureAreaMessage.isDisplayed();
    }

    public String youAreLoggedIntoASecureAreaMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(youAreLoggedIntoASecureAreaMessage));
        return youAreLoggedIntoASecureAreaMessage.getText();
    }

    public boolean secureAreaTextHeader2IsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(secureAreaHeader2));
        return secureAreaHeader2.isDisplayed();
    }

    public String secureAreaTextHeader2GetText(){
        wdWait.until(ExpectedConditions.visibilityOf(secureAreaHeader2));
        return secureAreaHeader2.getText();
    }

    public boolean welcomeToTheSecureAreaMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(welcomeToTheSecureAreaMessageHeader4));
        return welcomeToTheSecureAreaMessageHeader4.isDisplayed();
    }

    public String welcomeToTheSecureAreaMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(welcomeToTheSecureAreaMessageHeader4));
        return welcomeToTheSecureAreaMessageHeader4.getText();
    }

    public void logoutButtonClick() {
        wdWait.until(ExpectedConditions.visibilityOf(logoutButton)).click();
    }

    public void elementalSeleniumLinkTextFooterClick (){
        wdWait.until(ExpectedConditions.visibilityOf(elementalSeleniumLinkTextFooter)).click();
    }

    public void forkMeOnGitHubLinkClick (){
        wdWait.until(ExpectedConditions.visibilityOf(forkMeOnGitHubLink)).click();
    }
}
