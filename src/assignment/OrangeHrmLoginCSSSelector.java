package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginCSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
	}

}
