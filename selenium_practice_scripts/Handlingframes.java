package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromelatest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-window");
		Thread.sleep(2000);
		driver.findElement(By.id("iframe")).click();
		Thread.sleep(2000);
		 WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='globalsqa']"));
		 Thread.sleep(2000);
		 driver.switchTo().frame(frame1);
		 Thread.sleep(2000);
		 driver.findElement(By.id("s")).sendKeys("switched");
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.close();
	}

}
