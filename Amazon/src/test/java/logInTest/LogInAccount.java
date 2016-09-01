package logInTest;

import Common.Base;
import logIn.LogInInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by AFMErshadul on 8/31/2016.
 */
public class LogInAccount extends Base{

    @Test
    public void logInAccount() throws InterruptedException{
        //Test-2: invalid users cannot enter
        clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
        //waitUntilClickAble(By.cssSelector(".nav-line-1"));
        sleepFor(3);
        //clickByXpath(".//*[@id='nav-signin-tooltip']/a/span");
        //sleepFor(3);
        LogInInfo info = new LogInInfo(driver);
        info.EmailID().sendKeys("teamB");
        sleepFor(2);
        info.password().sendKeys("123");
        sleepFor(2);
        info.Submit().click();
        sleepFor(3);
        info.Help().click();
        sleepFor(2);
        navigateBack();
        sleepFor(3);

        //Test-3: create a new account
//        scrollDown();
//        sleepFor(3);
//        clickByCss(".a-button-text");
//        sleepFor(2);
//        clickByCss("#createAccountSubmit");
//        typeByCss("#ap_customer_name","TeamB");
//        typeByCss("#ap_email", "teamb.group@yahoo.com");
//        typeByCss("#ap_password", "TeamBGroup");
        sleepFor(2);
//        typeByCssNEnter("#ap_password_check", "TeamBGroup");
        sleepFor(5);


    }



}
