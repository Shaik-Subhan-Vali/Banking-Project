package Banking_Project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript03 {

    static WebDriver driver;
    private static String baseUrl;

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", Util.CHROME_PATH);
        driver = new ChromeDriver();
        baseUrl = Util.BASE_URL;
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
        driver.get(baseUrl + "/V4/");
    }

    public static void main(String[] args) throws Exception {
        String[][] testData = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME, Util.TABLE_NAME);
        String username, password;
        String actualTitle;
        String actualBoxtitle;

        for (int i = 0; i < testData.length; i++) {
            username = testData[i][0];
            password = testData[i][1];

            setUp();

            driver.findElement(By.name("uid")).clear();
            driver.findElement(By.name("uid")).sendKeys(username);

            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(password);

            driver.findElement(By.name("btnLogin")).click();

            try {
                Alert alert = driver.switchTo().alert();
                actualBoxtitle = alert.getText();
                alert.accept();
                if (actualBoxtitle.contains(Util.EXPECT_ERROR)) {
                    System.out.println("Test case SS[" + i + "]: Passed");
                } else {
                    System.out.println("Test case SS[" + i + "]: Failed");
                }
            } catch (NoAlertPresentException ex) {
                actualTitle = driver.getTitle();
                if (actualTitle.contains(Util.EXPECT_TITLE)) {
                    System.out.println("Test case SS[" + i + "]: Passed");
                } else {
                    System.out.println("Test case SS[" + i + "]: Failed");
                }
            }
            driver.close();
        }
    }
}
