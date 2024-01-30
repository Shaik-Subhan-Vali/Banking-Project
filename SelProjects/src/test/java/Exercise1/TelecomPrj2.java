package Exercise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TelecomPrj2  {

	//Verifying 4 modules
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
	      
	    driver.get("https://demo.guru99.com/telecom/");
	    
	    driver.manage().window().maximize() ;
	    
	    WebElement Opt1 = driver.findElement(By.xpath("//a[@href='addcustomer.php']"));
	    WebElement Opt2 = driver.findElement(By.xpath("//a[@href='addtariffplans.php']"));
	    WebElement Opt3 = driver.findElement(By.xpath("//a[@href='assigntariffplantocustomer.php']"));
	    WebElement Opt4 = driver.findElement(By.xpath("//a[@href='billing.php']"));
	
	    //1st scenario
	
	    try {
	    WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"card\"]/div[1]")); 
        driver.switchTo().frame(frameElement);
        WebElement elementInsideFrame = driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/svg")); 
        driver.switchTo().defaultContent();
	   
    
	   
	    
	    Opt1.click();
	    
	    String header = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/h3")).getText();
	    System.out.println(header);
	  
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	
	
	
	
	
	
	
}
}