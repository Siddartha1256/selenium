package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickele {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/simple_context_menu.html");
			Thread.sleep(2000);
			 WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
			 Actions act = new Actions(driver);
			 act.contextClick(ele).perform();


	}

}
