package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandelingToolTips {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement gendertooltip=driver.findElement(By.xpath("//a[@id='gender-help']"));
	String Expectedtooltiptext=gendertooltip.getAttribute("title");
	String actualtooltiptext="Click for more information";
	Assert.assertEquals(actualtooltiptext, Expectedtooltiptext);
	}

}
