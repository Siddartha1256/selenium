package selenium_practice_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chroffLC {

	public static WebDriver driver;
	public static void chrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();//to close 1
	}
	public static void firefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();//to close 1
	}
public static void main(String[] args) throws InterruptedException {
	chrome();
	firefox();
}
}