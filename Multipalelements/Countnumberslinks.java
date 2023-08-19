package multipalelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countnumberslinks {

	public static void main(String[] args) throws InterruptedException 
	 {
 System.setProperty("webdriver.geckodriver","/software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/checkboxx.html");
List<WebElement> c = driver.findElements(By.xpath("//input"));
int a = c.size();
System.out.println(a);
for(int i=0; i<a;i++)
{
	WebElement we =c.get(i);
  we.click();
  Thread.sleep(1000);
}
for(int i=a-1; i>=0;i--)
{
	WebElement we =c.get(i);
  we.click();
  Thread.sleep(1000);
	}

}
}

