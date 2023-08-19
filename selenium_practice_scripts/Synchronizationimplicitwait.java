package selenium_practice_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronizationimplicitwait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromelatest/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://WWW.fb.com");
		driver.findElement(By.id("email")).sendKeys("adghjhgf@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("adghjhgf@gm");
		driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		System.out.println(t);
	}

}
