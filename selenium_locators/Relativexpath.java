package selenium_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relativexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver","./software/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/input1.html");
		Thread.sleep(1500);
		WebElement aja = (WebElement) driver.findElements(By.xpath("//div[2]/input[1]"));
		aja.sendKeys("sid");
		List<WebElement> ele = driver.findElements(By.xpath("//div/input"));
		((WebElement) ele).sendKeys("ajay");
		

	}

}
