package Exercise1;      //Banking project

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Fulllengthautomation {

	public static void main(String[] args) {
		
		    FirefoxProfile ffp = createcustomfirefoxprofile();
		
		    WebDriver driver = DRIVER.webdr();
		    
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); // duration.ofseconds kindha rayali guthupetuko
		    
		     
		    
	try {	    
		    driver.get(Util.baseurl);
		    
		    driver.manage().window().maximize() ;
		    
		    WebElement uid = driver.findElement(By.name("uid"));
		    
			WebElement pwd = driver.findElement(By.name("password"));			
			
	        WebElement btn = driver.findElement(By.name("btnLogin"));
	        
	        uid.sendKeys(Util.uid);
	        pwd.sendKeys(Util.pwd);
	        btn.click();
	       
	        WebElement head =  driver.findElement(By.className("heading3"));	       
	       
	       if(head.isDisplayed())
	       {
	    	   System.out.println("Success");
	       }
	       else
	       {
	    	   System.out.println("Failed");
	       }       
	   }
    catch(Exception e)
	   {
		   e.printStackTrace();
       }
	finally 
	   {
	       driver.quit();
	   }    
	}
	
	private static FirefoxProfile createcustomfirefoxprofile() {
		 // Create a Firefox profile
        FirefoxProfile profile = new FirefoxProfile();

        // Add custom preferences or configurations if needed
        // For example, you can set browser preferences like this:
        // profile.setPreference("browser.download.folderList", 2);
        // profile.setPreference("browser.download.dir", "your_download_directory_path");
        
     return profile;
	}

	
	
	
	
	
	
	
	
	
	
	
}
