package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReplaceText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("samir");
	Thread.sleep(3000);
	firstname.clear();
	firstname.sendKeys("behera");
	}

}
