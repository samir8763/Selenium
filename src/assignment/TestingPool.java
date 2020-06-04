package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingPool 
{ 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
	WebElement list= driver.findElement(By.xpath("//select[@name='Week']"));
		 Select sel= new Select(list);
		  List<WebElement> list1=sel.getOptions();
		 System.out.println(list1.size());
		   for(int i=0;i<list1.size();i++)
		        {
		        	System.out.println(list1.get(i).getText());
		        }
		        System.out.println(sel.isMultiple());
		        sel.selectByValue("Thu");
		        sel.selectByValue("Wed");
		        System.out.println(sel.getFirstSelectedOption());

		        
		        sel.deselectAll();

		
	
	}

}
