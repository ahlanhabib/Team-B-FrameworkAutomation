package CheckItemsOnHomePage;
import Common.Base;
import org.testng.annotations.Test;

public class ClickItemsAndCheck extends Base{


    @Test(priority = 3)
    public void clickOnTv() throws InterruptedException {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 4)
    public void clickOnComputer()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 5)
    public void clickOnTablets()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 6)
    public void clickOnGames()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[4]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 7)
    public void clickOnConnectedHome()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[5]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 8)
    public void clickOnDronesToys() throws InterruptedException {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[6]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 9)
    public void clickOnCameras() throws InterruptedException {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 10)
    public void clickOnHeadphones()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[8]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 11)
    public void clickOnMovies()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[9]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 12)
    public void clickOnHometheater()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[10]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 13)
    public void Movies()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[11]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 14)
    public void clickOnPhone() throws InterruptedException {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[12]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 15)
    public void clickOnMusic() throws InterruptedException {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[13]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 16)
    public void clickOnIpod()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[14]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 17)
    public void clickOnMajor()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[15]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 18)
    public void clickOnSmallApplliances()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[16]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 19)
    public void clickOnCarAndGPS()throws InterruptedException  {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[17]/div[2]/div/a");
        sleepFor(2);
    }
    @Test(priority = 20)
    public void clickOnBestBuy() throws InterruptedException {
        clickByXpath(".//*[@id='site-control-content']/div[4]/div[1]/div[2]/div/div[2]/div/div[18]/div[2]/div/a");
        sleepFor(2);
    }

}

