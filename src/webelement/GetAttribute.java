package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	//System.out.println(firstname.getAttribute("aria-label"));
	firstname.sendKeys("samir");
	
	  String attributevalue=firstname.getAttribute("value");
	  System.out.println(attributevalue);
	 
	//System.out.println(firstname.getAttribute("value"));
	}

}
