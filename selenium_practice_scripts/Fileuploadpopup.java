package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/HP/Desktop/scripts/uploadfilepopup.html");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.name("upload file"));
			ele.sendKeys("C:\\Users\\HP\\Desktop\\download.jpeg");
		
	}

}
