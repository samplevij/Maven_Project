package MyMavenProject.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {


	WebDriver driver;	
	@BeforeTest()
	public void launchBrowser() {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\md\\Downloads\\geckodriver-v0.16.0-win64\\GeckoDriver.exe");
			// Initialize browser
			//driver= new FirefoxDriver();	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser		
		 driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
			
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);		
	}
	@Test()
	public void testcase() {
	
	driver.findElement(By.cssSelector("#email")).sendKeys("Znishu@yahoo.com");
		
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("12345");	
	

	driver.close();	
	}

}
