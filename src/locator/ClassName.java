package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.className("inputtext")).sendKeys("samir");
	driver.findElement(By.className("inputtext")).sendKeys("behera");
	
	}

}
