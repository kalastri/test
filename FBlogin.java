package FeaceBook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import reusable.Auto;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.gecko.driver", "E:\\SeleniumRequriments\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("manoj");
		driver.findElement(By.name("password")).sendKeys("774647");
		Thread.sleep(2000);
		//driver.quit();
		 * 
		 * 
*/		
		
		
		Auto driver=new Auto();
		
		driver.openBrowser("chrome");
		
		Thread.sleep(2000);
		
		driver.openAppUrl("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.enterText("//input[@name='firstname']","Rushi");
		Thread.sleep(2000);
		
		driver.enterText("//input[@name='lastname']", "Lakkam");
		Thread.sleep(2000);
		
		driver.selectByIndex("//select[@id='day']", 6);
		Thread.sleep(2000);
		
		driver.selectByVisibleText("//select[@id='month']", "Aug");
		Thread.sleep(2000);
		
		driver.selectByValue("//select[@id='year']", "11");
		Thread.sleep(2000);
		
		driver.clickOn("//input[id='u_0_a']");
		Thread.sleep(2000);
		
		driver.browserClose();
		
		
		
		

	}

}
