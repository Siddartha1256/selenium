package selenium_methods;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  Point p=new Point(200, 855);
		  Thread.sleep(2000);
		  driver.manage().window().setPosition(p);
		  driver.quit();
		  

	}

}
