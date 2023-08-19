package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextkanada {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("WebDriver.chromedriver","/software/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   Thread.sleep(1500);
	   driver.findElement(By.linkText("ಕನ್ನಡ")).click();
	}

}
