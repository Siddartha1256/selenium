package selectmultipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		driver.get("https://www.dhtmlgoodied.com/script/drag-drop-custom/demo-drag-drop-3.html");
       // driver.findElement(By.xpath("//button[.='X']")).click();
        Thread.sleep(1500);
       WebElement ele1 = driver.findElement(By.id("box3"));
       WebElement ele2 = driver.findElement(By.id("box103"));
       Actions act=new Actions(driver);
       act.dragAndDrop(ele1, ele2).perform();

	}

}
