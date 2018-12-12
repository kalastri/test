package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto {
	
	
	static WebDriver driver;
	
	public static void openBrowser(String browsername) throws InterruptedException
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver=new ChromeDriver();
            Thread.sleep(5000);
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		
	}
	
	
	public static void openAppUrl(String url)
	{
		driver.get(url);
	}
	
	public static void clickOn(String webelementlocator)

	{
		driver.findElement(By.xpath(webelementlocator)).click();
	}
	
	public static void enterText(String webelementLocator,String data)
	{
		driver.findElement(By.xpath(webelementLocator)).sendKeys(data);
	}
	
	public static void selectByIndex(String webelementlocator,int index)
	{
		Select s=new Select(driver.findElement(By.xpath(webelementlocator)));
		
		s.selectByIndex(index);
	}
	
	public static void selectByVisibleText(String webelementlocator,String visibleText)
	{
		Select s=new Select(driver.findElement(By.xpath(webelementlocator)));
		
		s.selectByVisibleText(visibleText);
	}
	
	public static void selectByValue(String webelementlocator,String valuet)
	{
		Select s=new Select(driver.findElement(By.xpath(webelementlocator)));
		
		s.selectByVisibleText(valuet);
	}
	
	
	public static void browserClose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
