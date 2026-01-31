package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Hooks {

    public static WebDriver driver;
    Properties prop = new Properties();

    @Before
    public void setUp() throws Exception {

        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        prop.load(fis);

        String browser = prop.getProperty("browser");

        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
