package logIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AFMErshadul on 8/31/2016.
 */
public class LogInInfo {
    WebDriver driver;

    public LogInInfo(WebDriver driver){
        this.driver=driver;
    }
    By userName = By.xpath(".//*[@id='ap_email']");
    By Password= By.xpath(".//*[@id='ap_password']");
    By submit =By.id("signInSubmit");
    By help = By.linkText("Help");


    public WebElement EmailID(){
        return driver.findElement(userName);
    }
    public WebElement password(){
        return driver.findElement(Password);
    }
    public WebElement Submit(){
        return driver.findElement(submit);
    }
    public WebElement Help(){
        return driver.findElement(help);
    }

}
