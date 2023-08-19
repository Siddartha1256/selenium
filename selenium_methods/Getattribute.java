package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getattribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String value = e.getAttribute("title");
		System.out.println(value);
		
	}

}
