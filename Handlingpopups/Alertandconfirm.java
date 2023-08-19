package handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertandconfirm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com");
		Thread.sleep(1500);
         driver.findElement(By.name("submit")).click();
         Thread.sleep(1500);       
     Alert a = driver.switchTo().alert();
String t = a.getText();
System.out.println(t);
Thread.sleep(1500);
a.accept();
	}

}
