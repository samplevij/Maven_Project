package MyMavenProject.MavenProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class F_C_Test {
WebDriver driver;
/*@Test()
public void test001() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	// Initialize browser
	 driver= new ChromeDriver();	
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);	
driver.findElement(By.id("email")).sendKeys("Nishu");	
	
	}*/
/*@Test()
public void test002() throws Exception {
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\md\\Downloads\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
	// Initialize browser
	 driver= new InternetExplorerDriver();	
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);	
driver.findElement(By.className("inputtext")).sendKeys("Nishu");	
	
}*/
@Test()
public void test003() throws Exception {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\md\\Downloads\\geckodriver-v0.16.0-win64.zip\\geckodriver.exe");
	// Initialize browser
	 driver= new FirefoxDriver();	
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);	
driver.findElement(By.id("email")).sendKeys("Nishu");	
}
}