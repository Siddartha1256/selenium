package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownpassdataele {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromelatest"
				+ "/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.fb.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(2000);	
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("asdfghjk@gmail.com");
	}

}
