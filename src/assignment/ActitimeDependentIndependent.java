package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeDependentIndependent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("samir");
		driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'sam')]/../..//a[contains(text(),'delete')]")).click();
		
	}

}
