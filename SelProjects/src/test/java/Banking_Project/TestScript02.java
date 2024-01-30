package Banking_Project;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestScript02 {

    static WebDriver driver;
    private static String baseUrl;

    public static void setUp() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", Util.CHROME_PATH);
     
        ChromeOptions chromeOptions = new ChromeOptions();
        
        driver = new ChromeDriver(chromeOptions);
        baseUrl = Util.BASE_URL;
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
        driver.get(baseUrl + "/V4/");
         }

    public static void main(String[] args) throws Exception {
        setUp();

        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(Util.PASSWD);

        driver.findElement(By.name("btnLogin")).click();

        String actualTitle = driver.getTitle();
        if (actualTitle.contains(Util.EXPECT_TITLE)) {
            System.out.println("Test case: Passed");
        } else {
            System.out.println("Test case: Failed");
        }

        driver.quit();
    }
}
