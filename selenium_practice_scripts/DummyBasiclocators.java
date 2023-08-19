package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DummyBasiclocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/scripts/dummyBL.html");
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).sendKeys("first data");
		Thread.sleep(1500);
		driver.findElement(By.id("a1")).sendKeys("second data");
		Thread.sleep(1500);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("c1")).click();
	}

}
