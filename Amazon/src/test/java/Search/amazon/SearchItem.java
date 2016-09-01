package Search.amazon;

import Common.Base;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by AFMErshadul on 8/29/2016.
 */
public class SearchItem extends Base{
    @Test
    public void searchItems() throws InterruptedException {

        //Test-7: searching for laptop from search button
        typeByCss("#twotabsearchtextbox", "Laptop");
        sleepFor(5);
        clickByCss(".nav-input");
        clickByXpath(".//*[@id='result_1']/div/div[2]/div/div/div/div/a/div/div/span");
        sleepFor(5);
        navigateBack();
        navigateBack();
        //scrollToElementByxpath(".//*[@id='nav-link-shopall']/span[2]");
        sleepFor(20);



    }
}
