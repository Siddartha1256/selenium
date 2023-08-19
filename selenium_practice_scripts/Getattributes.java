package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getattributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		 String e = ele.getAttribute("title");
		 System.out.println(e);
	}

}
