package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyPdCd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/scripts/dummypg.html");
		Thread.sleep(1500);
		WebElement first= driver.findElement(By.tagName("input"));
		first.sendKeys("success");
		Thread.sleep(1500);
		first.clear();
		WebElement second= driver.findElement(By.id("a1"));
		second.sendKeys("success");
		Thread.sleep(1500);
		second.clear();

	}

}
