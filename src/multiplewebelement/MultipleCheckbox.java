package multiplewebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Qspiders/Selenium/12_05_20/MultipleElements.html");
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkbox.size());
	/*
	 * for(int i=0;i<checkbox.size();i++) 
	 * { 
	 * Thread.sleep(3000);
	 * checkbox.get(i).click(); 
	 * }
	 */
	/*
	 * for(int i=0;i<checkbox.size();i+=2) { Thread.sleep(1000);
	 * checkbox.get(i).click(); }
	 */
		for(int i=checkbox.size()-1;i>=0;i-=2) 
		{ 
			Thread.sleep(1000);
			checkbox.get(i).click();
		}

}
}