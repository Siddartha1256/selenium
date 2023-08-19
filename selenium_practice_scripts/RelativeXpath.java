package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/scripts/dummyxpathwebpage.html");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//div[1]/input"));
		e.sendKeys("si0_0artha");
	}

}