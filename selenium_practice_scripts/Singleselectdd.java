package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselectdd {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/HP/Desktop/scripts/multiselectdd.html");
			 WebElement ele = driver.findElement(By.id("Raichur biryani house"));
			 Select s = new Select(ele);
			 s.selectByIndex(1);
			 Thread.sleep(1000);
			 s.selectByValue("t");
			 Thread.sleep(1000);
			 s.selectByVisibleText("chicken lollypop");
			 Thread.sleep(1000);
			 
	}

}
