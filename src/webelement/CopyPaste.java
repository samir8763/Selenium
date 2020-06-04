package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("samir");
	firstname.sendKeys(Keys.CONTROL,"a");
	firstname.sendKeys(Keys.CONTROL,"c");
	WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
	surname.sendKeys(Keys.CONTROL,"v");
	}

}
