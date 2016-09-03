package TestCreateAnAccount;
import Common.Base;
import org.testng.annotations.Test;

public class TestCreateAnAccount extends Base{

    //users are able to click the link
    @Test(priority = 21)
    private void clickOnCreateAccount() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
    }

    //users are able to click the first name field
    @Test(priority = 23)
    private void ClickfirstName() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='fld-firstName']");
        sleepFor(2);
    }

    //users are able to click the last first
    @Test(priority = 21)
    private void ClicklastName() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='fld-lastName']");
        sleepFor(2);
    }

    //users are able to click the email field
    @Test(priority = 21)
    private void clickEmail() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='fld-e']");
        sleepFor(2);
    }

    //users are able to click the password field
    @Test(priority = 21)
    private void clickPassWord() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='fld-p1']");
        sleepFor(2);
    }

    //users are able to click the password confirmation field
    @Test(priority = 21)
    private void  clickPassWordConfirmation() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='fld-p2']");
        sleepFor(2);
    }

    //users are able to click the phone number field
    @Test(priority = 21)
    private void clickOnPhoneNumber() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='fld-phone']");
        sleepFor(2);
    }

    //users are able to click the submit button
    @Test(priority = 21)
    private void clickOnSubmit() throws InterruptedException {
        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        clickByCss(".cia-form__submit-button.js-submit-button");
                sleepFor(2);
    }

    //users are able to create an account with all their information
    @Test(priority = 22)
    public void CreateAnAccount() throws InterruptedException{

        clickByXpath(".//*[@id='header']/div/header/div[2]/div[3]/form/div/a[2]/span");
        sleepFor(2);
        typeByXpath(".//*[@id='fld-firstName']", "People");
        typeByXpath(".//*[@id='fld-lastName']", "Tech");
        typeByXpath(".//*[@id='fld-e']", "PeopleNTech@yahoo.com");
        typeByXpath(".//*[@id='fld-p1']", "KeyaSuperBeautySoap007");
        typeByXpath(".//*[@id='fld-p2']", "KeyaSuperBeautySoap007");
        typeByXpath(".//*[@id='fld-phone']", "2132564565");
        sleepFor(2);
        clickByCss(".cia-form__submit-button.js-submit-button");
        sleepFor(2);
    }
}
