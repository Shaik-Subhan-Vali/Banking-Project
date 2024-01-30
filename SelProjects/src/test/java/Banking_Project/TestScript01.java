package Banking_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript01 {

    public static void main(String[] args) throws Exception {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       // String baseUrl = "http://www.demo.guru99.com/V4/";
      
        driver.get(Util.BASE_URL);
        
        driver.findElement(By.name("uid")).sendKeys("mngr550610");
      
        driver.findElement(By.name("password")).sendKeys("pEsupyp");

        driver.findElement(By.name("btnLogin")).click();
        
        
    }
}
