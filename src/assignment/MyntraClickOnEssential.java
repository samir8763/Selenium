package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraClickOnEssential {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		WebElement link=driver.findElement(By.linkText("Essentials"));
		link.click();
		WebElement link1=driver.findElement(By.linkText("Essentials"));
		System.out.println(link1.getText());
	}

}
