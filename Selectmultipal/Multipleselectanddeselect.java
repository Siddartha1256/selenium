package selectmultipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselectanddeselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/Hotelmenu2.html");
Thread.sleep(1500);
WebElement ele = driver.findElement(By.id("nati mane"));
Select s=new Select(ele);
Thread.sleep(1500);
s.selectByIndex(1);
Thread.sleep(1500);
s.selectByValue("k");
Thread.sleep(1500);
s.selectByVisibleText("mutton soup");
Thread.sleep(1500);
s.deselectAll();


	}

}
