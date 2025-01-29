package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static ObjectsPath.GitHubPaths.*;
import static ObjectsPath.LoginPaths.*;

public class LoginPages {
    WebDriver driver = null;
    public LoginPages (WebDriver driver){

        this.driver =  driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();

    }
    public void fillEmail(){

        WebElement Email = driver.findElement(username);
        Email.sendKeys("sondusalenazi@gmail.com");

    }
    public void fillPassword(){

        WebElement Password = driver.findElement(password);
        Password.sendKeys("Sondus27@");

    }

    public void clickOn(){

        WebElement SignInBtn = driver.findElement(signInBtn);
        SignInBtn.click();
    }

}
