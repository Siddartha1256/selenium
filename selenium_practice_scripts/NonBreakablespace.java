package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonBreakablespace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/scripts/&nbsp.html");
		driver.findElement(By.xpath("//span[contains(text(),'mysore')]")).click();
	}

}
