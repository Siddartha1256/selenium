package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
 WebDriver driver= new FirefoxDriver();
 //driver.get("https://www.youtube.com/watch?v=unxAnJBy12Q&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=3");
 driver.get("https://www.youtube.com");
 driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Java OOPs in One Shot by apna collage");
 Thread.sleep(1500);
 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
 Thread.sleep(1500);
 //driver.findElement(By.cssSelector("a[id='title']")).click();
 driver.findElement(By.cssSelector("a[id='video-title']")).click();
 driver.quit();

 
	}

}
