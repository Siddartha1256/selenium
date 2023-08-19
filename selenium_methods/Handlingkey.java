package selenium_methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingkey {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","/software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/clear.html");
	    WebElement e=driver.findElement(By.xpath("//input"));
	    Thread.sleep(1500);
	    e.sendKeys(Keys.CONTROL+"a");
	    e.sendKeys(Keys.DELETE);
	}

}
