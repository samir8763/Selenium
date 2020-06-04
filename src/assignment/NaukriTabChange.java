package assignment;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriTabChange 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@class='bannerItemLink'][1]")).click();
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());
		ArrayList<String> al=new ArrayList<String>(a);
		System.out.println(al.size());
		driver.switchTo().window(al.get(01));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[.='Contact Us'])[2]")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[5]")).click();
		Set<String> a1=driver.getWindowHandles();
		ArrayList<String> al1=new ArrayList<String>(a1);
		System.out.println(al1.size());
		driver.switchTo().window(al1.get(02));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(al1.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[6]")).click();
		Set<String> a2=driver.getWindowHandles();
		ArrayList<String> al2=new ArrayList<String>(a2);
		System.out.println(al2.size());
		driver.switchTo().window(al2.get(03));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//span[.='Contact Us'])[2]")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(al2.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='bannerItemLink'])[4]")).click();
		Set<String> a3=driver.getWindowHandles();
		ArrayList<String> al3=new ArrayList<String>(a3);
		System.out.println(al3.size());
		driver.switchTo().window(al3.get(04));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[.='About Us'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(al3.get(01));
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(al3.get(02));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(al3.get(03));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(al3.get(04));
		Thread.sleep(2000);
		driver.close();



	}

}
