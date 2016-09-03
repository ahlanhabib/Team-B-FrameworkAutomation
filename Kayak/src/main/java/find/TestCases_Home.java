package find;

import Common.Base;
import org.testng.annotations.Test;

public class TestCases_Home extends Base {

//    //users are able to click the location field
//    @Test(priority =1)
//    public void SearchItem() throws InterruptedException {
//        clickByCss(".locationField.col");
//        sleepFor(3);
//    }
//
//    //users are able to input a value in the location field
//    @Test(priority = 2)
//    public void InputSearchItem() throws InterruptedException {
//        clickByCss(".locationField.col");
//        sleepFor(3);
//        typeByCssNEnter(".locationField.col","Veg");
//        sleepFor(3);
//    }
//
//    //users are able to click the a city from the drop down menu
//    @Test(priority = 3)
//    public void clickCityFromMenu()throws InterruptedException {
//    clickByCss("#city-35107-350");
//        sleepFor(3);
//    }
//
//    //users are able to click on the Start date field
//    @Test(priority = 4)
//    public void clickDateField()throws InterruptedException {
//        clickByCss(".r9-datepicker-display");
//        sleepFor(3);
//    }
//
//    //users are able to click and enter a value in the Start-date-field
//    @Test(priority = 5)
//    public void dateStart()throws InterruptedException {
//        typeByCss(".r9-datepicker-display", "09/05/2016");
//        sleepFor(5);
//    }
//
//    //users are able to click the End Date Field
//    @Test(priority = 6)
//    public void clickEndDateField()throws InterruptedException {
//        clickByXpath(".//*[@id='datepicker']/div[4]/span[2]/span[2]/span[1]/span[5]/span");
//        sleepFor(7);
//    }
//
//    //users are able to click on the End-Date-Field and enter a value
//    @Test(priority = 7)
//    public void enterAValue()throws InterruptedException {
//        typeByXpath(".//*[@id='datepicker']/div[4]/span[2]/span[2]/span[1]/span[5]/span","10/09/2016");
//        sleepFor(7);
//    }
//
//    //users are able to click the search button
//    @Test(priority = 8)
//    public void clickSearch()throws InterruptedException {
//        clickByCss(".Common-Widgets-Button.searchButton");
//        sleepFor(5);
//    }
//
//    //users are able to search for a flights
//    @Test(priority = 9)
//    public void dateEnd()throws InterruptedException {
//        //location
//        typeByCssNEnter(".locationField.col","Veg");
//        sleepFor(3);
//        //start
//        typeByCssNEnter(".r9-datepicker-display", "09/05/2016");
//        sleepFor(5);
//        //end
//        typeByXpath(".//*[@id='datepicker']/div[4]/span[2]/span[2]/span[1]/span[5]/span","10/09/2016");
//        sleepFor(5);
//        clickByCss(".Common-Widgets-Button.searchButton");
//        sleepFor(5);
//    }

    //users are able to click the sign-Up button
    @Test(priority = 1)
    public void signUpbutton()throws InterruptedException {
        clickByCss(".Common-Widgets-Button.account-button.loginLink");
        sleepFor(5);
        getLinks("Sign up");

    }

}
