package selenium_practice_scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chroff {

	public static void main(String[] args) {
		String key1="webdriver.chrome.driver";
		String value1="./software/chromedriver.exe";
		System.setProperty(key1, value1);
		ChromeDriver driver1=new ChromeDriver();
		String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		
	}
}
