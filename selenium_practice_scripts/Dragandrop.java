package selenium_practice_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Thread.sleep(2000);
			 WebElement ele = driver.findElement(By.id("box3"));
			 WebElement ele1 = driver.findElement(By.id("box103"));
			 Actions act = new Actions(driver);
			 act.dragAndDrop(ele,ele1).perform();

	}

}
