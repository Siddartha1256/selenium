package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicesessinsta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.Instagram.com");
		
		driver.findElement(By.cssSelector("input[class='userName']")).sendKeys("si0_0artha");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("3.odeadoralive");
		
		driver.findElement(By.cssSelector("button[type='password']")).click();
	}
	}
