package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpExpAmericanAirlines 
{

		 public static void main(String[] args) throws InterruptedException 
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\usgr\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.americanairlines.in/");
		  WebElement searchcity=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
	        searchcity.sendKeys("san");
	        //WebElement searchcitysan=driver.findElement(By.xpath("//a[@id='ui-id-24']"));
	        WebDriverWait wait=new WebDriverWait(driver, 15);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-24']")));
	        List<WebElement>city=driver.findElements(By.xpath("//li[@role='presentation'])"));
	        for(int i=0;i<city.size();i++) {
	        	
	        	System.out.println(city.get(i).getText());
	        }
	        city.get(6).click();
		}

	
			
			 
			
	}


