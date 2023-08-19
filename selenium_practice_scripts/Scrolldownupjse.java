package selenium_practice_scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownupjse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.fb.com");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		for(int i=0;i<3;i++) 
		{
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(2000);
		}
		for(int i=0;i<3;i++) 
		{
			js.executeScript("window.scrollBy(0,-50)");
			Thread.sleep(2000);
		}
	}

}
