package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Qspiders/Selenium/08_05_20/AbsoluteXpath.html");
	driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("samir");
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");

	}

}
