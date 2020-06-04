package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/usgr/Downloads/DependentIndependentXpath.html");
	List<WebElement> deg=driver.findElements(By.xpath("//b[.='Scarlett Johansson']/../..//li"));
	/*
	 * System.out.println(deg.getText()); WebElement
	 * dep=driver.findElement(By.xpath("//b[.='Scarlett Johansson']/../..//li[3]"));
	 * System.out.println(dep.getText()); WebElement
	 * offadd=driver.findElement(By.xpath("//b[.='Scarlett Johansson']/../..//li[3]"
	 * )); System.out.println(offadd.getText()); WebElement
	 * mob=driver.findElement(By.xpath("//b[.='Scarlett Johansson']/../..//li[4]"));
	 * System.out.println(mob.getText());
	 */
	
	for(int i=0;i<deg.size();i++)
{
	System.out.println(deg.get(i).getText());
}
	}

}
