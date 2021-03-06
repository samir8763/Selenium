package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Qspiders/Selenium/13_05_20/SelectClass%20multiple.html");
	WebElement listbox=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(listbox);
	sel.selectByVisibleText("Brazil");
	sel.selectByVisibleText("Canada");
	sel.selectByValue("USD");
	List<WebElement> selected=sel.getAllSelectedOptions();
	System.out.println(selected.size());
	for(int i=0;i<selected.size();i++)
	{
		System.out.println(selected.get(i).getText());
	}
	}

}
