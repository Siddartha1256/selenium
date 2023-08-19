package screenshottt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshottt 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/geckodriver.exe");
	        WebDriver driver=new FirefoxDriver();
	        driver.get("https://www.facebook.com/");
	         WebElement w = driver.findElement(By.id("email"));
	         w.sendKeys("ajaygujjar424@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("ajay1999");
	        driver.findElement(By.xpath("//button")).click();
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(1000,1000)");
	        Thread.sleep(2000);
	        TakesScreenshot ts=(TakesScreenshot) driver;
	        File src= ts.getScreenshotAs(OutputType.FILE);
	        File dst=new File("C:\\ajay\\fb.jpeg");
	        FileHandler.copy(src, dst);
	        Thread.sleep(1500);
	        driver.quit();
	       
	}

}
