package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersUSMobNoPrint {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		 driver.get("http://www.qspiders.com/contact");
		  WebElement usno= driver.findElement(By.xpath("//a[.='Qspiders Us']/../../..//div[contains(text(),'+1')]"));	
		    System.out.println(usno.getText());
		
	}

}
