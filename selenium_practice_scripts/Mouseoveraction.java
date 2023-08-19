package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//butto[.='x']")).click();
			 Thread.sleep(2000);
			 WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[4]"));
			 Actions act = new Actions(driver);
			 act.moveToElement(ele).perform();
	}

}
