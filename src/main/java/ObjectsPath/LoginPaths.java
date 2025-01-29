package ObjectsPath;

import org.openqa.selenium.By;

public class LoginPaths {
    public static final By username = By.xpath("//input[@id='login_field']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By signInBtn = By.xpath("//input[@name='commit']");

    public static final By signUp = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/a");

    public static final By termsLink = By.xpath("//*[text()='Terms of Service']");

    public static final By githubPrivacy = By.xpath("//*[text()='GitHub Privacy Statement']");
}
