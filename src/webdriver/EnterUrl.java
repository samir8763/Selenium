package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrl 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/usgr/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.facebook.com");
	}
}