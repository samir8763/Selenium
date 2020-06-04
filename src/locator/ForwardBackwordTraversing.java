package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackwordTraversing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Qspiders/Selenium/11_05_20/Demo.html");
	//HTML TO D
	driver.findElement(By.xpath("/html//div[2]/input[2]")).click();
	//BODY TO E
	driver.findElement(By.xpath("//body//div[3]/input[1]")).click();
	//F TO BODY
	driver.findElement(By.xpath("//div[3]/input[2]/../..")).click();
	//F TO BODY/HTML TO A
	driver.findElement(By.xpath("//div[3]/input[2]/../..//div[1]/input[1]")).click();
	}

}
