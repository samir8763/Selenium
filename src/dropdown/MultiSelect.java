package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Qspiders/Selenium/13_05_20/SelectClass%20multiple.html");
	WebElement listbox=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(listbox);
	//sel.selectByVisibleText("Brazil");
	sel.selectByValue("GBU");
	sel.selectByIndex(3);
	
	}

}
