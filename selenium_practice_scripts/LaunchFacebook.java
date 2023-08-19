package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFacebook {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.instagram.com");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("si0_0artha");
	}

}
