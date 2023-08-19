package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refresh {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.navigate().to("https://www.facebook.com");
		  Thread.sleep(2000);	  
		 driver.navigate().to("https://www.google.com");
		 Thread.sleep(1500);
		 driver.navigate().back();
		 Thread.sleep(1500);
		 driver.navigate().forward();
		 Thread.sleep(1500);
		 driver.navigate().refresh();
		 driver.quit();

	}

}
