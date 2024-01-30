package Banking_Project;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript05 {

    private WebDriver driver;
    private String baseUrl;

    @DataProvider(name = "GuruTest")
    public Object[][] testData() {
        Object[][] data = new Object[4][2];

        data[0][0] = Util.USER_NAME;
        data[0][1] = Util.PASSWD;

        data[1][0] = "invalid";
        data[1][1] = "valid";

        data[2][0] = "valid";
        data[2][1] = "invalid";

        data[3][0] = "invalid";
        data[3][1] = "invalid";

        return data;
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
    public void testCase05(String username, String password) throws Exception {
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
            String pageText = driver.findElement(By.tagName("tbody")).getText();
            String[] parts = pageText.split(Util.PATTERN);
            String dynamicText = parts[1];

            assertTrue(dynamicText.substring(1, 5).equals(Util.FIRST_PATTERN));

            String remain = dynamicText.substring(dynamicText.length() - 4);
            assertTrue(remain.matches(Util.SECOND_PATTERN));
        }
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
