package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class BingSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com");
	driver.findElement(By.id("sb_form_q")).sendKeys("hritik");
	Thread.sleep(3000);
	List<WebElement> suggestion=driver.findElements(By.xpath("//input[contains(text(),'hritik')]")); 
	System.out.println(suggestion.size());
	for(int i=0;i<suggestion.size();i++)
	{
		System.out.println(suggestion.get(i).getText());
		
	}
	}

}