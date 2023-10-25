package Exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise1 {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "C:/Users/subha/OneDrive/Desktop/others/drivers/drvrs/chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
     
     driver.manage().window().maximize();
     
     String Title = driver.getTitle();
     System.out.println(Title);
     
     WebElement fname = driver.findElement(By.xpath("//input[@name ='firstname']"));
	 fname.sendKeys("shaik")	;
	 
	 WebElement lname = driver.findElement(By.xpath("//input[@name ='lastname']"));
	 lname.sendKeys("subhan123")	;
	 
	 WebElement sex = driver.findElement(By.xpath("//input[@id ='sex-0']"));
	 sex.click();
	 
	 WebElement exp = driver.findElement(By.id("exp-0"));
	 exp.click();
	 
	 WebElement date = driver.findElement(By.id("datepicker"));
	 date.sendKeys("10/10/2000");
	 
	 WebElement dropdownElement = driver.findElement(By.id("continents"));
	 Select dropdown = new Select(dropdownElement);
	 dropdown.selectByVisibleText("Australia");

	 WebElement profession = driver.findElement(By.id("profession-0"));
	 profession.click();

	 WebElement profession1 = driver.findElement(By.id("profession-1"));
	 profession1.click();
	 
	 WebElement drpdwnElmnts = driver.findElement(By.id("selenium_commands"));
	 Select drp = new Select(drpdwnElmnts);
	 drp.selectByVisibleText("WebElement Commands");
	 
	 WebElement upload = driver.findElement(By.id("photo"));
	 upload.sendKeys("C:/Users/subha/OneDrive/Desktop/CERTIFICATIONS/Resumes & Cover Letters/Cheatsheet.png");

	 
     // driver.close();
		

}
}
 