package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multielement {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/textfield.html");
Thread.sleep(2000);
driver.findElement(By.tagName("input")).sendKeys("hello");
Thread.sleep(2000);
driver.findElement(By.tagName("input")).sendKeys("world");
	}

}
