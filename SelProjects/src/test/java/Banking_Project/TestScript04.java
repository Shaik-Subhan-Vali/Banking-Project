package Banking_Project;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript04 {

    private WebDriver driver;
    private String baseUrl;

    @DataProvider(name = "GuruTest")
    public Object[][] testData() throws Exception {
        return Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME, Util.TABLE_NAME);
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", Util.CHROME_PATH);
        driver = new ChromeDriver();
        baseUrl = Util.BASE_URL;
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
        driver.get(baseUrl + "/V4/");
    }

    @Test(dataProvider = "GuruTest")
    public void testCase04(String username, String password) throws Exception {
        String actualTitle;
        String actualBoxMsg;
        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        try {
            Alert alt = driver.switchTo().alert();
            actualBoxMsg = alt.getText();
            alt.accept();
            assertEquals(actualBoxMsg, Util.EXPECT_ERROR);

        } catch (NoAlertPresentException Ex) {
            actualTitle = driver.getTitle();
            assertEquals(actualTitle, Util.EXPECT_TITLE);
        }
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
