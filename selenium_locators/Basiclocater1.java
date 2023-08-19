package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclocater1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/dummyweb2.html");
Thread.sleep(2000);
driver.findElement(By.tagName("input")).sendKeys("first data");
Thread.sleep(2000);
driver.findElement(By.id("a1")).sendKeys("second data");
Thread.sleep(2000);
driver.findElement(By.name("n1")).click();
Thread.sleep(2000);
driver.findElement(By.className("c1")).click();



	}

}
