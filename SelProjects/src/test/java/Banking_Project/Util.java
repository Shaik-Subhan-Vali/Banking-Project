package Banking_Project;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Util {
	
	public static final int WAIT_TIME = 30;
    public static final String FILE_PATH = "C:\\Users\\subha\\OneDrive\\Desktop\\AUTOMATION TESTING\\Demo projects\\testData.xls";
    public static final String SHEET_NAME = "Data";
    public static final String TABLE_NAME = "testData";
    public static final String USER_NAME = "mngr550610";
    public static final String PASSWD = "pEsupyp";
    public static final String BASE_URL = "http://www.demo.guru99.com/";
    public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
    public static final String EXPECT_ERROR = "User or Password is not valid";
    public static final String CHROME_PATH = "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
    public static final String PATTERN = ":";
    public static final String FIRST_PATTERN = "mngr";
    public static final String SECOND_PATTERN = "[0-9]+";

    public static WebDriver initializeChromeDriver() {
        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }

    public static String[][] getDataFromExcel(String xlFilePath, String sheetName, String tableName) throws Exception {
        String[][] tabArray = null;
        Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
        Sheet sheet = workbook.getSheet(sheetName);

        int startRow, startCol, endRow, endCol, ci, cj;
        Cell tableStart = sheet.findCell(tableName);
        startRow = tableStart.getRow();
        startCol = tableStart.getColumn();

        Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1, 100, 64000, false);
        endRow = tableEnd.getRow();
        endCol = tableEnd.getColumn();

        tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
        ci = 0;

        for (int i = startRow + 1; i < endRow; i++, ci++) {
            cj = 0;
            for (int j = startCol + 1; j < endCol; j++, cj++) {
                tabArray[ci][cj] = sheet.getCell(j, i).getContents();
            }
        }

        return tabArray;
    }
}
