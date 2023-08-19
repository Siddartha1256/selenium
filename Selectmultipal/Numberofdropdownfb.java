package selectmultipal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Numberofdropdownfb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.pnp");
		Thread.sleep(1500);
		WebElement ele = driver.findElement(By.id("year"));
		ISelect s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		int a = opt.size();
		System.out.println(a);
		
		

	}

}
