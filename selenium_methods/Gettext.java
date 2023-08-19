package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//span[.='Documentation']"));
		Thread.sleep(1500);
		String text = e.getText();
		System.out.println(text);
	
	}

}
