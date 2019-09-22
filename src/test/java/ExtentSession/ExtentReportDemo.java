package ExtentSession;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo
{
	public static void main(String[] args)
	{
		/*
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		*/
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\Selenium\\Selenium logs\\Batch.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReporter);
		ExtentTest logger = report.createTest("Aut_01_VerifyLogin", "User is able to login succcessfully");
		logger.log(Status.PASS, "Username entered successfully in text box");
		logger.log(Status.PASS, "Password entered successfully in text box");
		logger.log(Status.FAIL, "Unable to click on login button");
		logger.log(Status.INFO, "Home page is not displayed");
		report.flush();
	}
}