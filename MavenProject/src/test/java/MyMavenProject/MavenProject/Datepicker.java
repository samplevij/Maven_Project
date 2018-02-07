package MyMavenProject.MavenProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

	WebDriver driver;
	@BeforeTest()
	public void testexample(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser		
		 driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://www.jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);		
		 }
		
	@Test()

	public void datepickertest(){
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker")).click();	
	List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(WebElement ele:allDates){
		String date=ele.getText();
	if(date.equalsIgnoreCase("26")){
		ele.click();

	}
	}
	}

}


