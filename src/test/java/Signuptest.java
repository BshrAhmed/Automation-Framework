import Erad.Pages.LoginPage;
import Erad.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Signuptest extends BaseClass {

        @Test
        public void LoginPageMethods(){
            LoginPage loginPageMethods = new LoginPage(driver);
            loginPageMethods.verifybtn();

        }

        }




