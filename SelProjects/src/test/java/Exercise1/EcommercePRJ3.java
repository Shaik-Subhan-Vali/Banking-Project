package Exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommercePRJ3 {

	public static void main(String[] args) throws InterruptedException {
		   
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			
	        WebDriver driver = new FirefoxDriver();
		      
		    driver.get("http://live.techpanda.org/index.php/");
		    
		    driver.manage().window().maximize() ;
		    
		    WebElement MENU = driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/mobile.html']"));
	        MENU.click();
	        
	  
	        WebElement Addtocartbtn= driver.findElement(By.xpath("//button[@title='Add to Cart']")) ;
	        Addtocartbtn.click();
	        
	        WebElement edit= driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/ul/li/a"));
	        edit.click();
	         
	        
	        WebElement box= driver.findElement(By.xpath(" //*[@id=\"qty\"]"));
	        box.sendKeys("1000");
	    
	        WebElement updtbtn= driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[4]/div/div/div[2]/button/span/span"));
	        updtbtn.click(); 
	       
	        WebElement errmsg= driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div/div/ul/li/ul/li/span"));
	        String errormsg = errmsg.getText();
	        
	        System.out.println(errormsg);
	      
	        WebElement empty= driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span"));
	        empty.click();
	      
	        WebElement cart = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/a/span[1]"));
	        cart.click();
	       
	        
	        WebElement vermsg= driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div[3]/p[2]"));
	        String msg = vermsg.getText();
	        
	        System.out.println(msg);
	        
	        driver.quit();
	        
	        
	     	}

}
