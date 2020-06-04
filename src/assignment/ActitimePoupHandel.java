package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePoupHandel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("samir");
		driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'sam')]/../..//a[contains(text(),'delete')]")).click();
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	//alt.dismiss();
	alt.accept();
		
	}

}
