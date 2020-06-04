package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.americanairlines.in/");
		  driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		  driver.findElement(By.xpath("(//a[.='22'])[1]")).click();
		  //22.6.2020
		  //driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		  //driver.findElement(By.xpath("(//a[.='22'])[2]")).click();
		  driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		  for(int i=0;i<=4;i++)
		  {
			  driver.findElement(By.xpath("//a[@title='Next']")).click();  
			  
		  }
		  driver.findElement(By.xpath("(//a[.='22'])[2]")).click();  
	}

}
