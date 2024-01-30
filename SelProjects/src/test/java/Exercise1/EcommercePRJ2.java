package Exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommercePRJ2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
	      
	    driver.get("http://live.techpanda.org/index.php/");
	    
	    driver.manage().window().maximize() ;
	    
	    WebElement MENU = driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/mobile.html']"));
        MENU.click();
        
        WebElement mobile= driver.findElement(By.xpath("//a[@title='Sony Xperia']")) ;
        String mobilename =  mobile.getText();
      
        
        String cost1="";
        if(mobilename.matches("SONY XPERIA"))
        {
        	cost1 = driver.findElement(By.xpath("//span[@class='price']")).getText();
        }
        
        mobile.click();
        
        String cost2 = driver.findElement(By.xpath("//span[@class='price']")).getText();
        
        
        if(cost1.equals(cost2))
        {
        	System.out.println("costs are equal");
        }
        else
        {
        	System.out.println("costs are not equal");
        }
      
       driver.quit(); 
	}

}
