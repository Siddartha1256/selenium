package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getcssvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.id("email"));
		String value = e.getCssValue("line-height");
		System.out.println(value);
	}

}
//o/p 20x