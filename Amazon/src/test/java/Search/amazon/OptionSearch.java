package Search.amazon;

import Common.Base;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.openqa.selenium.Keys.ENTER;

/**
 * Created by AFMErshadul on 9/1/2016.
 */
public class OptionSearch extends Base{
    //Test-11: off to college with screenshot
    @Test
    public void options() throws InterruptedException, IOException {
//        clickByCss(".nav-imageHref");
//        sleepFor(2);
//        getCurrentPageUrl();
//        sleepFor(2);
//        takeScreenShot();
//        sleepFor(3);


        //Test-12: career search
        scrollDown();
        clickByXpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[1]/a");
        sleepFor(2);
        getCurrentPageUrl();
        typeByCssNEnter("#search_typeahead","Finance");
        sleepFor(3);
        navigateBack();
//
//        //Test-13: Give a feedback on career page (with feedback u can upload)
//        scrollDown();
//        clickByCss("#feedback-modal-link");
//        sleepFor(2);
//        typeByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[1]/div[2]/div/textarea", "Appreciate it");
//        sleepFor(2);
//        clickByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[2]/div/div/div/button[2]");
//        sleepFor(3);


        //Test-13: Give a feedback on career page (without feedback u can't upload)
        scrollDown();
        clickByCss("#feedback-modal-link");
        sleepFor(2);
        clickByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[1]/div[2]/div/textarea");
        sleepFor(2);
        clickByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[2]/div/div/div/button[2]");
        sleepFor(5);

    }

}
