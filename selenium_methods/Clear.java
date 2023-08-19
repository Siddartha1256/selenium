package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
FirefoxDriver driver= new  FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/clear.html");
Thread.sleep(1500);
WebElement e=driver.findElement(By.xpath("//input"));
e.clear();


	}

}
