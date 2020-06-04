package multiplewebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Qspiders/Selenium/12_05_20/MultipleElements.html");
	List<WebElement> links=driver.findElements(By.xpath("//a"));
	System.out.println(links.size());
	//links.get(4).click();
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		System.out.println(links.get(i).getAttribute("href"));
	}
	links.get(3).click();
	}

}
