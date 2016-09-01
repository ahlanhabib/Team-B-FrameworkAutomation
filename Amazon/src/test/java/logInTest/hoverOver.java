package logInTest;

import Common.Base;
import org.testng.annotations.Test;

/**
 * Created by AFMErshadul on 8/31/2016.
 */
public class hoverOver extends Base{
    @Test
    //Test-1: hover over one Department
    public void hoverOver() throws InterruptedException{
        mouseHoverByXpath(".//*[@id='nav-link-shopall']/span[2]");
        sleepFor(4);

    }
}
