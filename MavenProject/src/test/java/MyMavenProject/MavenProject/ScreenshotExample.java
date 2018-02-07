package MyMavenProject.MavenProject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotExample {

	WebDriver driver;
	@BeforeTest()
	public void beforeclass(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser		
		 driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);		
		 }
		
	@Test()
	public void datepicker() throws Exception{
		
		
		try {
			driver.findElement(By.name("usernam")).sendKeys("zinnatnishu@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 getscreenshot();
		}
		
	}

public void getscreenshot() throws Exception{
File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrfile, new File("C:\\samplescreenshot.png"));














}

}


