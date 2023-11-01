package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);   // <-- ovo je samo jer smo morali uvesti nova podesavanja zbog bug-a u chrome driver v111
        wdWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @After
    public void tearDown() {
        //TODO kad zavrsis svo pisanje svih testova, otkomentarisi ispod ovu quit komandu
        // driver.quit();  // ovo zatvara ceo browser
        //driver.close(); // ovo zatvara tab koji je trenutno u fokusu
    }
}
