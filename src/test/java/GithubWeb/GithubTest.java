package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {


    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        Thread.sleep(3000);
        login.clickOnSignUpBtn();
        Thread.sleep(3000);
        login.clickOnTermsOfServices();
        Thread.sleep(3000);
    }
    @Test
    public void loginPage() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        Thread.sleep(3000);
        login.clickOnSignUpBtn();
        Thread.sleep(3000);
        login.clickOnTermsOfServices();
        Thread.sleep(3000);
    }
    @Test
    public void prodcts() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        Thread.sleep(3000);
        login.clickOnProducts();
        Thread.sleep(3000);
        login.clickOnCopilot();
        Thread.sleep(3000);


    }
}
