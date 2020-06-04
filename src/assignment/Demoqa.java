package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/selectmenu");
	
	WebElement listbox1=driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[1]"));
	listbox1.click();
	WebElement sel1=driver.findElement(By.id("ui-id-2"));
	sel1.click();
	
	WebElement listbox2=driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[2]"));
	listbox2.click();
	WebElement sel2=driver.findElement(By.id("ui-id-7"));
	sel2.click();
	
	WebElement listbox3=driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[3]"));
	listbox3.click();
	WebElement sel3=driver.findElement(By.id("ui-id-11"));
	sel3.click();
	
	WebElement listbox4=driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[4]"));
	listbox4.click();
	WebElement sel4=driver.findElement(By.id("ui-id-30"));
	sel4.click();
	//Select sel01=new Select(listbox1);
	//System.out.println(sel01.isMultiple());
	}

}
