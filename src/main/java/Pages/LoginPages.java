package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static ObjectsPath.GitHubPaths.*;

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

    public void clickOnSignUpBtn(){
        WebElement signUpBtn = driver.findElement(signUp);
        signUpBtn.click();

    }

    public void clickOnTermsOfServices(){
        WebElement ToS = driver.findElement(termsOfService);
        ToS.click();


    }

    public void clickOnProducts(){
        WebElement product = driver.findElement(products);
        product.click();
    }

    public void clickOnCopilot(){
        WebElement Copilot = driver.findElement(copilot);
        Copilot.click();
    }
}
