package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeURLVerify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/usgr/Desktop/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
		String s1= driver.getTitle();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[class='initial']")).click();
		Thread.sleep(5000);
		String s2= driver.getTitle();
		if(s1.equals(s2))
		{
			
			System.out.println("title same");
		}
		else 
		{
			System.out.println("title not same");
		}

	}

}
