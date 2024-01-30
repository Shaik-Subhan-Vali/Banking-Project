package Exercise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommercePRJ4 {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			
	        WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		      
		    driver.get("http://live.techpanda.org/index.php/");
		    
		    driver.manage().window().maximize() ;
		   
	        
		    WebElement MENU = driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/mobile.html']"));
	        MENU.click();
		
	        WebElement item1= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")) ;
	        item1.click();
	        
	        WebElement item2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a"));
	        item2.click();
	        
	        String s1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a")).getText();
	        		
	        String s2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a")).getText();
	        
	        WebElement compare = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button/span/span"));	
	        compare.click();
	        
	        Thread.sleep(2000);
	        
	        for (String handle : driver.getWindowHandles()) 
	        {
		    	driver.switchTo().window(handle);
		    }
	       
	        driver.manage().window().maximize() ;
	        
	        
	        String s3 = driver.findElement(By.xpath("/html/body/div/table/tbody[1]/tr[1]/td[1]/h2/a")).getText();
	        String s4 = driver.findElement(By.xpath("/html/body/div/table/tbody[1]/tr[1]/td[2]/h2/a")).getText();
	        
	        if(s1.equalsIgnoreCase(s3) && s2.equalsIgnoreCase(s4))
	        {
	        	 System.out.println("correct comparision");	
	        }
	        else
	        {
	        	System.out.println("wrong comparision");	
	        }
	        
	        WebElement close = driver.findElement(By.xpath("/html/body/div/div[2]/button/span/span"));
	        close.click();
	       
	        driver.quit();
	      	}

}






















