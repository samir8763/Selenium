package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanAirlines {
	 public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.americanairlines.in/");
	  WebElement fromCity=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
	  fromCity.sendKeys("san");
	  Thread.sleep(5000);
	  
	  List<WebElement> suggestions=driver.findElements(By.xpath("//a[contains(text(),'San')]"));
	  System.out.println(suggestions.size());
	  
		/*
		 * for(int i=0;i<=5;i++) { fromCity.sendKeys(Keys.ARROW_DOWN); }
		 * fromCity.sendKeys(Keys.ENTER);
		 * driver.findElement(By.xpath("//a[.='San Jose (SJO), Costa Rica']")).click();
		 */
		  
			
			  for(int i=0;i<suggestions.size();i++)
			  {
				  
			 if(suggestions.get(i).getText().equalsIgnoreCase("San Jose (SJO), Costa Rica")) 
				 {
				 suggestions.get(i).click(); 
				 break; 
				 }
			 
			 }
			 
		 
}
}