package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Featchboththetitles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[.='New Window']")).click();
		Thread.sleep(1500);
		Set<String> a = driver.getWindowHandles();
		for (String string : a) {
			driver.switchTo().window(string);
			String t = driver.getTitle();
			System.out.println(t);
			Thread.sleep(1200);
			driver.close();

	}

}
}
