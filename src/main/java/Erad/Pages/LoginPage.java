package Erad.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Erad.Objects.LoginObjects.signin;
import static Erad.Objects.LoginObjects.signup;

public class LoginPage {
    WebDriver driver = null;
    public LoginPage(WebDriver driver){
        this .driver = driver;
    }
public void verifybtn (){
    WebElement signupbtn = driver.findElement(signup);
    signupbtn.click();
    //driver.findElement(signin);
}
}
