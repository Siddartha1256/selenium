package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YAhoomail {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("siddartha1256@yahoo.com");
		driver.findElement(By.xpath("input[@id='login-signin']")).click();
		//driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("deadoralive3.1");
		//driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		
	}

}

