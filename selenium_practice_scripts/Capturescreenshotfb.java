package selenium_practice_scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreenshotfb {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.fb.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9743401256");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("deadoralive3.o");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst =new File("E:\\azazaz\\az.jpeg");
		FileUtils.copyFile(src,dst);
	}
}
