package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getsize {

	public static void main(String[] args) {
		  System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://facebook.com");
		  WebElement e=driver.findElement(By.name("email"));
		  int h = e.getSize().getHeight();
		  System.out.println(h);
		  int w = e.getSize().getWidth();
		  System.out.println(w);

	}

}
