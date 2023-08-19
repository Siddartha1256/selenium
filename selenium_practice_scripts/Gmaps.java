package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		driver.findElement(By.xpath("//input [@placeholder='Choose starting point, or click on the map...']")).sendKeys("goa");
		driver.findElement(By.xpath("//input [@tooltip='Choose destination...']")).sendKeys("raichur");
		
		
	}

}