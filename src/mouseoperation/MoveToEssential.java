package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEssential {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	WebElement essential=driver.findElement(By.xpath("//a[.='Essentials']"));
	Actions act=new Actions(driver);
	act.moveToElement(essential).perform();
	Thread.sleep(5000);
	WebElement mask=driver.findElement(By.xpath("//a[.='Masks']"));
	act.moveToElement(mask).click(mask).perform();
	}

}
