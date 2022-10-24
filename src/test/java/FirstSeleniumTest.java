import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
    @Test
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver browser= new ChromeDriver();
        browser.get("http://discovercars.com/");
    }
}

