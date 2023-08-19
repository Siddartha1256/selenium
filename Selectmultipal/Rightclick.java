package selectmultipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/text/simple-context");
         WebElement ele = driver.findElement(By.xpath("//button[.='double-clic me to see Alert']"));
        Actions act=new Actions(driver);
        act.contextClick(ele).perform();///// pending script

	}

}
