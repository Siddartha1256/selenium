package selenium_practice_scripts;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Appsetposition {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Point p= new Point(100, 100);
		driver.manage().window().setPosition(p);


	}

}
