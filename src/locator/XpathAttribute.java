package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("samir");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
	}

}
