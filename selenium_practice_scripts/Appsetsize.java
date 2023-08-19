package selenium_practice_scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Appsetsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Dimension d = new Dimension(100, 100);
		driver.manage().window().setSize(d);

	}

}
