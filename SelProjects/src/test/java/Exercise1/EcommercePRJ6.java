package Exercise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommercePRJ6 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	      
	    driver.get("http://live.techpanda.org/index.php/");
	    
	    driver.manage().window().maximize() ;
        
	    WebElement account = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]"));
        account.click();
        
	    WebElement login = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a"));
        login.click();
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("TErXterteryGAMER@gmail.com");
        
        WebElement pwd = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        pwd.sendKeys("Dhon@1981");
        
        WebElement log = driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span"));
        log.click();
        
        WebElement wishlt = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a"));
        wishlt.click();
        
        WebElement Addtocart = driver.findElement(By.xpath("//*[@id=\"item_69374\"]/td[5]/div/button/span/span"));
        Addtocart.click();
        
        driver.navigate().back();
        
        WebElement Addtocart2 = driver.findElement(By.xpath("//*[@id=\"item_69375\"]/td[5]/div/button/span/span"));
        Addtocart2.click();
        
        WebElement proceed = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span"));
        proceed.click();
      
        WebElement CNTN = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button/span/span"));
        CNTN.click();
        
   /*     WebElement SHPCOST = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/dl/dd/ul/li/label/span"));
        
        if(SHPCOST.isDisplayed())
        {
        	System.out.println("Shipping cost is displayed");
        }
        else
        {
            System.out.println("Shipping cost is not displayed"); 
        } */
        
        WebElement CNTNw = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button/span/span"));
        CNTNw.click();//*[@id="shipping-method-buttons-container"]/button/span/span
  
        
        WebElement radio = driver.findElement(By.xpath("//*[@id=\"dt_method_checkmo\"]/label"));
        if(!radio.isSelected())
        {
        radio.click();
        }
        
        WebElement CNTN4 = driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button/span/span"));
        CNTN4.click();
      
        WebElement grandvalue = driver.findElement(By.xpath("//*[@id=\"checkout-review-table\"]/tfoot/tr[3]/td[2]/strong/span"));
        if(grandvalue.isDisplayed())
        {
        	 System.out.println("grand value is displayed"); 
        }
        else
        {
       	     System.out.println("grand value is not displayed"); 
        }	
        
        WebElement placed = driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button/span/span"));
        placed.click();
        
      
        WebElement done = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1"));
        String finalmsg = done.getText();
        String finalomsg= "Your order has been received.";
        
        WebElement order = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a"));
        String orderno = order.getText();
        
        if(finalmsg.equalsIgnoreCase(finalomsg))
        {
        	System.out.println("Order placed and order no. is "+ orderno);
        }
        else
        {
            System.out.println("Shipping cost is not displayed"); 
        }
      
        driver.quit();
       
        
	}

}
