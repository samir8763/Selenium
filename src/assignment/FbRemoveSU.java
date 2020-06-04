package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRemoveSU {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	  WebElement username= driver.findElement(By.xpath("//input[@name='firstname']"));
      username.sendKeys("suraj");
      for(int i=1;i<=5;i++)
      {
      	username.sendKeys(Keys.ARROW_LEFT);
      }
      for(int i=1;i<=2;i++) {
      	
      	username.sendKeys(Keys.DELETE);
      	
      	
      }
	}

}