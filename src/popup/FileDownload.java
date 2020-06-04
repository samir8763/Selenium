package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\usgr\\Downloads\\Compressed\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.selenium.dev/downloads");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Robot r=new Robot();
		for(int i=0;i<2;i++);
		
		{
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
