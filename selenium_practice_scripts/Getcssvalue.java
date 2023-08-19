package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getcssvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("email"));
		 String value = ele.getCssValue("font-size");
		 System.out.println(value);
	}

}
