package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraNewTab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	WebElement essential=driver.findElement(By.xpath("//a[.='Essentials']"));
	Actions act=new Actions(driver);
	act.moveToElement(essential).perform();
	Thread.sleep(3000);
	WebElement mask=driver.findElement(By.xpath("//a[.='Masks']"));
	act.sendKeys(Keys.CONTROL).click(mask).perform();
	Thread.sleep(10000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);
	System.out.println(driver.getTitle());

	}

}
