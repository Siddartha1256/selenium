package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partillydynamic {

	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("WebDriver.chromedriver","/software/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	   driver.get("https://www.google.com/doodles");
	   Thread.sleep(1500);
	   driver.findElement(By.partialLinkText("Sri Lanka")).click();
	   
	}
}
