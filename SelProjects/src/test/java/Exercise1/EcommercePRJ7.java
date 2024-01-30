package Exercise1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommercePRJ7 {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	      
	    driver.get("http://live.techpanda.org/index.php/");
	    
	    driver.manage().window().maximize() ;
	   
        
	    WebElement account = driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]"));
        account.click();
        
        WebElement login = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a"));
        login.click();
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("TErXterteryGAMER@gmail.com");
        
        WebElement pwd = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        pwd.sendKeys("Dhon@1981");
        
        WebElement log = driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span"));
        log.click();
       
        WebElement myorders = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a"));
        myorders.click();
        
        WebElement orderid = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]"));
        String s1= orderid.getText();
        
        
        WebElement vieworder = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[6]/span/a[1]"));
        vieworder.click();
        
        WebElement orderid2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/h1"));
        String s2= orderid2.getText();
        System.out.println(s1);
        System.out.println(s2);
        if(s2.contains(s1))
        {
        	System.out.println("Matches");
        }
        else
        {
        	System.out.println("Not Matches");
        }
        
        WebElement porder = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]"));
        porder.click();
        
     
       for(String handle : driver.getWindowHandles())
       {
    	   driver.switchTo().window(handle);
       }
       
       
        
	}

}














