package Page_Factory;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchThisItems extends Base {

        By searchBooks = By.xpath(".//*[@id='gh-search-input']");
    By submit = By.xpath(".//*[@id='header']/div/header/div[2]/div[2]/form/button");

        @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")
        public static WebElement searchInput;

        @FindBy(how = How.XPATH, using = ".//*[@id='header']/div/header/div[2]/div[2]/form/button")
        public static WebElement searchSubmit ;

        public void searchFor(String item){
            searchInput.sendKeys(item, Keys.ENTER);
        }
        public void clearSearchInput(){
            searchInput.clear();
        }
        public void books() {
        driver.findElement(searchBooks);
        }
        public void submit() {
        driver.findElement(submit);
        }
}
