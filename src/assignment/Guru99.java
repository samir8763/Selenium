package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		WebElement listbox=driver.findElement(By.name("country"));
		Select sel=new Select(listbox);
		//sel.selectByVisibleText("ANTARCTICA");
		sel.selectByValue("ANTARCTICA");
		//sel.deselectByValue("ANTARCTICA");
		//sel.selectByIndex(5);
		System.out.println(sel.isMultiple());
		List<WebElement> option=sel.getOptions();
		System.out.println(option.size());
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
		List<WebElement> selected=sel.getAllSelectedOptions();
		System.out.println(selected.size());
		for(int i=0;i<selected.size();i++)
		{
			System.out.println(selected.get(i).getText());
		}
		//WebElement firstselected=sel.getFirstSelectedOption();
		//System.out.println(firstselected.getText());
	}

}
