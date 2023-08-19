package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getloc {

	public static void main(String[] args) {
	
  System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
  WebDriver driver = new FirefoxDriver();
  driver.get("https://facebook.com");
  WebElement e=driver.findElement(By.xpath("//img[@alt='Facebook']"));
  Point loc = e.getLocation();
  System.out.println(loc);
  int x=loc.getX();
  System.out.println(x);
  int y = loc.getY();
  System.out.println(y);
	}

}
