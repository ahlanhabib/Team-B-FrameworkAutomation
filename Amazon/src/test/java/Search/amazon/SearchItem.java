package Search.amazon;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import page_factory.SearchObjects;

/**
 * Created by AFMErshadul on 8/29/2016.
 */
public class SearchItem extends Base{
    @Test
    public void searchItems() throws InterruptedException {

        //Test-7: searching for laptop from search button
//        typeByCss("#twotabsearchtextbox", "Laptop");
//        sleepFor(5);
//        clickByCss(".nav-input");
//        clickByXpath(".//*[@id='result_1']/div/div[2]/div/div/div/div/a/div/div/span");
//        sleepFor(5);
//        navigateBack();
//        //scrollToElementByxpath(".//*[@id='nav-link-shopall']/span[2]");
//        sleepFor(2);


        //Test-8: searching for books from home page through page factory
//        SearchObjects Bk = new SearchObjects(driver);
//        sleepFor(5);
//        Bk.searchBook.sendKeys("Selenium Book");
//        sleepFor(5);
//        Bk.submit.click();
//        sleepFor(5);

        //Test-9: searching from wishlist
        clickByXpath(".//*[@id='nav-link-wishlist']/span[2]");
        sleepFor(2);
        clickByXpath(".//*[@id='nav-subnav']/a[2]/span");
        clickByXpath(".//*[@id='gift-query-builder']/div[1]/div[1]/div/div[2]/div/div[3]/span/a/div[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='landing-asins']/div/div[1]/div[4]/div/a/span");
        sleepFor(2);
        clickByXpath(".//*[@id='add-to-wishlist-button-submit']");
        sleepFor(5);

    }
}
