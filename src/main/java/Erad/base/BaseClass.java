package Erad.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

        // Initialize ChromeDriver instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://zatca.gov.sa/en/Pages/default.aspx");

    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();

    }
}
