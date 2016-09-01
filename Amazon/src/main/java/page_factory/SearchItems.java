package page_factory;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by rrt on 1/3/2016.
 */
public class SearchItems extends Base{
    By searchBooks = By.xpath(".//*[@id='twotabsearchtextbox']");
    By submit = By.xpath(".//*[@id='nav-search']/form/div[2]/div/input");

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }

    public void clearSearchInput(){
        searchInput.clear();
    }

    public void Books(){
        driver.findElement(searchBooks);
    }
    public void Submit(){
        driver.findElement(submit);
    }

}
