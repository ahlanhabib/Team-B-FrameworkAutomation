package Search.amazon;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by AFMErshadul on 9/1/2016.
 */
public class AddToCart extends Base{
    //Test-10: add things to the cart from today's deal
    @Test
    public void addToCart() throws InterruptedException{
        clickByXpath(".//*[@id='nav-xshop']/a[2]");
        sleepFor(2);
        clickByXpath(".//*[@id='a-autoid-2-announce']");
        sleepFor(2);
        scrollDown();
        sleepFor(2);
        clickByCss(".productCheckbox");
        sleepFor(2);
        clickByCss(".a-button-input");
        sleepFor(2);
        clickByCss(".nav-cart-icon.nav-sprite");
        sleepFor(2);
    }
}
