package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geckodriver","./software/geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/swap.html");
Thread.sleep(1500);
WebElement e=driver.findElement(By.id("a1"));
e.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(1500);
WebElement q=driver.findElement(By.id("a3"));
q.sendKeys(Keys.CONTROL+"v");
Thread.sleep(1500);
WebElement a=driver.findElement(By.id("a2"));
a.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(1500);
WebElement b=driver.findElement(By.id("a1"));
b.sendKeys(Keys.CONTROL+"v");
Thread.sleep(1500);
WebElement c=driver.findElement(By.id("a3"));
c.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(1500);	
WebElement d=driver.findElement(By.id("a2"));
d.sendKeys(Keys.CONTROL+"v");
driver.quit();
	}

}
