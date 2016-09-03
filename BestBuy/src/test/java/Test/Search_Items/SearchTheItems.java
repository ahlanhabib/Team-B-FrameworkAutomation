package Test.Search_Items;
import Common.Base;
import Home_Search.GetItemsFromExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTheItems extends Base {

    //Users are able to click on the search button and type in it
     @Test (priority = 1)
        public void click()throws InterruptedException {
         typeByXpath(".//*[@id='gh-search-input']", "laptop");
        sleepFor(5);
     }

    //Users are able tooooo search different items in the search buttons said keya
     @Test (priority = 2)
     public void searchUsingExcelFile() throws IOException, InterruptedException {

     //initialize Search page factory
     Page_Factory.SearchThisItems search = PageFactory.initElements(driver, Page_Factory.SearchThisItems.class);

     // Read search.data from excel file
     GetItemsFromExcel itemsToBeSearched = new GetItemsFromExcel();
     String[] value = itemsToBeSearched.getData();

     for (String read : value) {
            search.searchFor(read);
            sleepFor(3);
            search.clearSearchInput();
     }
     }
}