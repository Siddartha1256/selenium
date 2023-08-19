package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Csslocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
       driver.get("https://www.instagram.com");
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ajay");
       /*
       Thread.sleep(1500);
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("uygfh9hof");
       Thread.sleep(1500);
       driver.findElement(By.cssSelector("button[type='submit']")).click();*/
       
	}

}
