package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooXpathLocator {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("samirbehera6@yahoo.in");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();

	}

}
