package Home_Search;
import Common.Base;
import utility.DataReader;
import java.io.IOException;

public class GetItemsFromExcel extends Base{

    //Reading Data from ExcelFile
    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = "A:\\New folder\\Selenium\\Selenium_Projects\\AutomationHWork\\AutomationHWork\\BestBuy\\Data\\Search_Item.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
