package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Users/usgr/Desktop/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		System.out.println(driver.getTitle());
	}
}