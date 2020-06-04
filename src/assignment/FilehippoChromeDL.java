package assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilehippoChromeDL 
{

	public static void main(String[] args)
	{
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://filehippo.com/download_google_chrome");
		driver.findElement(By.xpath("(//span[.='Google Chrome'])[1]/../../../../..//a[.='Download Latest Version']")).click();
		driver.findElement(By.id("modal-di-continue-link")).click();
		driver.manage().window().maximize();
	}

}
