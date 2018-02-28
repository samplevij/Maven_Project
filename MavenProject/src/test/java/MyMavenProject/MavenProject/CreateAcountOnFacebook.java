package MyMavenProject.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAcountOnFacebook {

WebDriver driver;
@BeforeClass()
public void Testverification(){
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	// Initialize browser		
	 driver=new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);	
	}

@Test()
public void test() {
	
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);	
	driver.findElement(By.id("u_0_e")).sendKeys("zinnat");
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);	
	driver.findElement(By.xpath(".//*[@id='u_0_g']")).sendKeys("nishu");
driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("znishu@yahoo.com");
}

@AfterClass()
public void close() {
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);	
		
driver.quit();	
	
}
}
