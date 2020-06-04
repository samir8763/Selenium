package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldRelease {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement forgetaccount=driver.findElement(By.xpath("//a[.='Forgotten account?']"));
	Actions act=new Actions(driver);
	act.clickAndHold(forgetaccount).perform();
	Thread.sleep(3000);
	act.release(forgetaccount).perform();

	}

}
