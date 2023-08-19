package selectmultipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Checkmultipal {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.get("file:///C:/Users/USER/Desktop/Hotelmenu2.html");
     WebElement ele = driver.findElement(By.id("nati mane"));
     Select s=new Select(ele);
     boolean b = s.isMultiple();
     if(b) {
    	 System.out.println("multi select dd");
     }
     else {
    	 System.out.println("not multi select dd");
     }

	}

}
