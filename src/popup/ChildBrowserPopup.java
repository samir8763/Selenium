package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());
		ArrayList<String> al=new ArrayList<>(a);
		System.out.println(al.size());
		driver.switchTo().window(al.get(01));
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		driver.close();
		//NoSuchWindowException
		//driver.close();
		//System.out.println(driver.getTitle());
		driver.switchTo().window(al.get(0));
		Thread.sleep(10000);
		System.out.println(driver.getTitle());

	}

}
