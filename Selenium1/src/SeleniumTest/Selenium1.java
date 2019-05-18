package SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpulumbarit\\Documents\\Selenium Training DXC\\seleniumbrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Work\\seleniumbrowsers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Work\\seleniumbrowsers\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        // navigate to login page
		driver.findElement(By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b/../following-sibling::ul//a[contains(text(),'Login')]")).click();
        
        // email element
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
        
        // password element
		driver.findElement(By.name("password")).sendKeys("demouser");
        
        // login button
		driver.findElement(By.xpath("//button[text()='Login']")).click();
        
        // check header
		driver.findElement(By.xpath("//h3[contains(text(),'Hi')]")).isDisplayed();
        
        // take screenshot
        takeScreenShot(driver);
        
        // logout
        driver.findElement(By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b")).click();
        driver.findElement(By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b/../following-sibling::ul//a[contains(text(),'Logout')]")).click();
        
        // sleep for 5 seconds
		Thread.sleep(5000);
		
		// close the webdriver session
		driver.close();
	}
	
	
public static void takeScreenShot(WebDriver driver) 
{
		
		String filePath = "C:\\Users\\kpulumbarit\\seleniumworkspace\\Screenshot\\ss1.jpg";
		
		// instantiate screenshot object
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		// call method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		// move image file to new destination
		File DestFile=new File(filePath);
		
		try 
		{
			// copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


}
