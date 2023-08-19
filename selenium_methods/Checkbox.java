package selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 driver.get("https://demoqa.com/automation-practice-form");
 //WebElement e=driver.findElement(By.xpath("//input"));
// boolean b = e.isSelected();
 WebElement e=driver.findElement(By.xpath("//type=['checkbox']"));
 boolean b = e.isSelected();
 if(b) {
	 System.out.println("cbox is selected");
 }
 else {
	 System.out.println("cbox is not selected");
 }
	}
	

}
