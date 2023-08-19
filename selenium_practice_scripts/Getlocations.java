package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getlocations {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		 Point loc = ele.getLocation();
		 System.out.println(loc);
		 int x = loc.getX();
		 int y = loc.getY();
		 System.out.println(x);
		 System.out.println(y);
	}

}
