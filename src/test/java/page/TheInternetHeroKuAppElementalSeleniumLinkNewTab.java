package page;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class TheInternetHeroKuAppElementalSeleniumLinkNewTab extends BaseTest {
    public TheInternetHeroKuAppElementalSeleniumLinkNewTab(){
        PageFactory.initElements(driver,this);
    }
    public void switchFocusToNewTab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
