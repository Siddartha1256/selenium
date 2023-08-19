package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver geckodriver","./software/geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/enable.html");
WebElement ele=driver.findElement(By.xpath("//input"));
boolean b= ele.isEnabled();
	if(b) {
		System.out.println("element is enable");
	}
	else {
		System.out.println("element is not enable");
	}
	}
	

}
