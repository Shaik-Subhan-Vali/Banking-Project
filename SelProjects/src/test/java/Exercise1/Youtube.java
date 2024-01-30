package Exercise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.youtube.com/playlist?list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa");

        driver.manage().window().maximize();

        List<WebElement> videoTitles = driver.findElements(By.xpath("//*[@id=\"video-title\"]"));

        for (WebElement videoTitle : videoTitles) {
            System.out.println(videoTitle.getText());
        }

        driver.quit();
    }
}
