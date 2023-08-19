package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Deleteallcookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().deleteAllCookies();
		  driver.quit();

	}

}
