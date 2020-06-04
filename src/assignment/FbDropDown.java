package assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement listbox1=driver.findElement(By.id("day"));
	WebElement listbox2=driver.findElement(By.id("month"));
	WebElement listbox3=driver.findElement(By.id("year"));
	Select sel1=new Select(listbox1);
	Select sel2=new Select(listbox2);
	Select sel3=new Select(listbox3);
	
	/*
	 * sel1.selectByVisibleText("26"); sel2.selectByVisibleText("Mar");
	 * sel3.selectByVisibleText("1995");
	 */
	sel1.selectByValue("26");
	sel2.selectByValue("3");
	sel3.selectByValue("1995");
	List<WebElement> option1=sel1.getOptions();
	System.out.println(option1.size());
	for(int i=0;i<option1.size();i++)
	{
		System.out.println(option1.get(i).getText());
	}
	List<WebElement> option2=sel2.getOptions();
	System.out.println(option2.size());
	for(int i=0;i<option2.size();i++)
	{
		System.out.println(option2.get(i).getText());
	}
	List<WebElement> option3=sel3.getOptions();
	System.out.println(option3.size());
	for(int i=0;i<option3.size();i++)
	{
		System.out.println(option3.get(i).getText());
	}
	List<WebElement> selected1=sel1.getAllSelectedOptions();
	System.out.println(selected1.size());
	for(int i=0;i<selected1.size();i++)
	{
		System.out.println(selected1.get(i).getText());
	}
	List<WebElement> selected2=sel2.getAllSelectedOptions();
	System.out.println(selected2.size());
	for(int i=0;i<selected2.size();i++)
	{
		System.out.println(selected2.get(i).getText());
	}
	List<WebElement> selected3=sel3.getAllSelectedOptions();
	System.out.println(selected3.size());
	for(int i=0;i<selected3.size();i++)
	{
		System.out.println(selected3.get(i).getText());
	}
	Select sec01=new Select(listbox1);
	System.out.println(sec01.isMultiple());
	Select sec02=new Select(listbox2);
	System.out.println(sec02.isMultiple());
	Select sec03=new Select(listbox3);
	System.out.println(sec03.isMultiple());
	
	}

}
