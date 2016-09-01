package Search.amazon;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by AFMErshadul on 8/30/2016.
 */
public class SearchIphone extends Base{
    //Test-6: Searing Iphone & come back
    @Test
    public void SearchIphone() throws InterruptedException{
        clickByCss("#searchDropdownBox");
        sleepFor(3);
        scrollDown();
        sleepFor(3);
        mouseHoverByCSS(".nav-search-scope.nav-sprite.nav-focus");
        //navigateRefresh();
        sleepFor(5);
        navigateBack();
        navigateForward();
        sleepFor(5);

    }
}
