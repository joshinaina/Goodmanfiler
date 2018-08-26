package goodman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fielder {

	WebDriver driver;
	
	@Test
	
	public void automationtestion() throws InterruptedException
	{
		//launching browser
				System.setProperty("webdriver.ie.driver","C:\\Users\\LittleMonkey\\Desktop\\software\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//Passing URL
				
				driver.get("https://kiwicollection.littlemonkey.info/search/");
				
				//maximizing window
				
				driver.manage().window().maximize();
				
				
				//click on  contact
				
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[8]/a")).click();
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				//click on customer feedback
				
				//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/a")).click();
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Thread.sleep(3000);
				
				//Selecting value from dropdown country from  the dropdown
				
				//Select dropdown=new Select(driver.findElement(By.id("UserForm_Form_Enquiry_Type")));
				//dropdown.selectByVisibleText("Enquiry");
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//click on first name
				
				//driver.findElement(By.name("First_Name")).sendKeys("Testname");
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				//click on last name
	}
}

		
				