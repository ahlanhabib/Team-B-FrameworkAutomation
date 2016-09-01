//package Search.amazon;
//
//
//import Common.Base;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by AFMErshadul on 8/30/2016.
// */
//public class SearchContentTV extends Base {
//    List<String> urlLinks = new ArrayList<String>();

    //Test-5: searching TV & Turn up searching pages
//    @Test
//    public void searchNews() throws InterruptedException {
//        typeByCssNEnter("#twotabsearchtextbox", "TV");
//
//        clickByXpath("#result_0 .s-item-container .a-fixed-left-grid .a-fixed-left-grid-inner .a-fixed-left-grid-col.a-col-right .a-row.a-spacing-small a");
//        String currenturl = getCurrentPageUrl();
//        System.out.println(currenturl);
//
//
//       // sleepFor(2);
//      //  grabList("//*[@id='result_0']/div/div/div/div[2]/div[3]/div[1]/div[3]/div[3]/a/span[1]");
////        clickByCss("#pagnNextString");
////        grabList(".a-fixed-left-grid-inner .a-fixed-left-grid-col.a-col-right .a-row.a-spacing-small a");
//    }
//
//    public void grabList(String locator1) throws InterruptedException {
//        if (urlLinks.size() <= 25) {
//            int newLimit = 25 - urlLinks.size();
//            List<WebElement> links = getListOfWebElementsByCss(locator1);
//            for (int i = 2; i < links.size(); i++) {
//                if (urlLinks.size() < 25) {
//                    clickByXpath(".//*[@id='result_" + i + "']/div/div/div/div[2]/div[2]/a/h2");
//                    //.//*[@id='result_0']/div/div/div/div[2]/div[2]/a/h2
//                    String currenturl = getCurrentPageUrl();
//                    System.out.println(currenturl);
//                    urlLinks.add(currenturl);
//                    sleepFor(3);
//                    navigateBack();
//                    sleepFor(3);
//                } else {
//                    System.out.println("We got 25 urls");
//                }
//            }
//        }
//    }
//}
//
