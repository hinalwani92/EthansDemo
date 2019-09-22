package MyJenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne
{
	@Test
	
	public void VerifyTitle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com//");
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	
}
