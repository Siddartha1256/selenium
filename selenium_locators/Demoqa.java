package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./software/chromedrivrr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1500);
        driver.findElement(By.id("userName")).sendKeys("ajay");
        Thread.sleep(1500);
        driver.findElement(By.id("userEmail")).sendKeys("ajay@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.id("currentAddress")).sendKeys("pwd quarters");
        Thread.sleep(1500);
        driver.findElement(By.id("permanentAddress")).sendKeys("pwd quarters raichur");
        driver.findElement(By.id("submit")).click();
	}

}
