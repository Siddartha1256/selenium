package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqaassig {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("siddartha");
		
		driver.findElement(By.id("userEmail")).sendKeys("shameonyou951@gmail.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Industrial Rajaji nagar");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("Industrial Rajaji nagar");
		
		driver.findElement(By.id("submit")).click();
	}
	
}
