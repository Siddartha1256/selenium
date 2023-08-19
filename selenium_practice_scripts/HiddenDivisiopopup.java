package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisiopopup {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[.='Date']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[.='8']")).click();
	}

}
