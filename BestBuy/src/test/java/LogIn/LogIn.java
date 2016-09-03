package LogIn;

import Common.Base;
import org.testng.annotations.Test;

public class LogIn extends Base{

//    //users are able to click the SignIn Link
//    @Test(priority = 23)
//    private void clickOnSignIn() throws InterruptedException {
//        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[1]");
//    }
//
//    //users are able to click the SignIn Link
//    @Test(priority = 24)
//    private void email() throws InterruptedException {
//        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[1]");
//
//        sleepFor(2);
//    }
//
//    //users are able to click the SignIn Link
//    @Test(priority = 25)
//    private void password() throws InterruptedException {
//        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[1]");
//        clickByXpath(".//*[@id='fld-p1']");
//        sleepFor(2);
//    }

    //users are able to click the SignIn Link
    @Test(priority = 26)
    private void logIn() throws InterruptedException {
        sleepFor(2);
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[1]");
        typeByXpath(".//*[@id='fld-e']", "PeopleNTech@yahoo.com");
        typeByXpath(".//*[@id='fld-p1']", "KeyaSuperBeautySoap007");
        sleepFor(2);
    }
}
