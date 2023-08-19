package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Submit {

	public static void main(String[] args) {
	    System.setProperty("WebDrive.gekodriver","./software/gekodriver");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("file:///C:/Users/USER/Desktop/webele.html");
	    WebElement ele=driver.findElement(By.xpath("//input"));
	    boolean b =ele.isDisplayed();
	    if(b)
	    {
	    	System.out.println("element is display");
	    }
	    else {
	    	System.out.println("element is not display");
	    }
       

	}

}
