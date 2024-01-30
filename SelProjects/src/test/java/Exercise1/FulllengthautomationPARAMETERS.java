package Exercise1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FulllengthautomationPARAMETERS {

	public static void main(String[] args) throws IOException {
		
		
		    WebDriver driver = DRIVER.webdr();
		  
		    driver.get(Util.baseurl);
		    
		    driver.manage().window().maximize();
		  
		    WebElement uid = driver.findElement(By.name("uid"));
		    
			WebElement pwd = driver.findElement(By.name("password"));			
			
	        WebElement btn = driver.findElement(By.name("btnLogin"));
	        
	        for (TestData testData : TestData.testDataList) {
	            String user = testData.getUsername();
	            String pwrd = testData.getPassword();

	            uid.sendKeys(user);
	            pwd.sendKeys(pwrd);
	            btn.click();

	            WebElement head = driver.findElement(By.className("heading3"));

	            if (head.isDisplayed()) {
	                System.out.println("Success");
	            } else {
	                driver.switchTo().alert();
	                String alertText = driver.switchTo().alert().getText();
	                System.out.println("Login was unsuccessful. Alert Message: " + alertText);
	                driver.switchTo().alert().accept();
	            }
	            
	            uid.clear();
	            pwd.clear();
	            
	            Actions actions = new Actions(driver);
	            actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();

	            // Switch to the new tab
	            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	            driver.switchTo().window(tabs.get(1));
	        }
	        
	        // Close the WebDriver
	        driver.quit();  
		
		
	}

}
