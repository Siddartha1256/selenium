package selenium_practice_scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcom {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			Thread.sleep(2000);
			 driver.findElement(By.name("submit")).click();
			 Alert a = driver.switchTo().alert();
					 String t = a.getText();
					 System.out.println(t);
					 Thread.sleep(2000);
					 //a.dismiss();//quit
					a.accept();//ok
	}

}
