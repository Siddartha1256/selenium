package selectmultipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//button[.='X']")).click();
        Thread.sleep(1500);
       WebElement ele = driver.findElement(By.xpath("//div[.='Fashion'][4]"));
       Thread.sleep(1500);
       Actions act=new Actions(driver);
       act.moveToElement(ele).perform();
	}

}
