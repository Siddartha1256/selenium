package disabledements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolldownandup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 for(int i=0; i<3;i++)
		 {
			 js.executeScript("window.scrollBy(0,20)");
			 Thread.sleep(1000);
		 }
		 for(int i=0; i<3;i++)
		 {
			 js.executeScript("window.scrollBy(0,-20)");
			 Thread.sleep(1000);
		 }
	}

}
