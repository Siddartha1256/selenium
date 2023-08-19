package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearThedatausingTAG {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/scripts/textfield.html");
		driver.findElement(By.tagName("input")).sendKeys("hello world");
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).clear();
	}

}
