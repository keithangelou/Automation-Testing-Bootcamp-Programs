package SeleniumTest;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity_Selenium {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpulumbarit\\Documents\\Selenium Training DXC\\seleniumbrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b/../following-sibling::ul//a[contains(text(),'Sign Up')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Keith");
		driver.findElement(By.name("lastname")).sendKeys("Pulumbarit");
		driver.findElement(By.name("phone")).sendKeys("1234");
		driver.findElement(By.name("email")).sendKeys("kkk12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("asdasdas1213");
		driver.findElement(By.name("confirmpassword")).sendKeys("asdasdas1213");
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		
		
		driver.findElement(By.id("cookyGotItBtn")).click();
		driver.findElement(By.xpath("//button[text()=' Sign Up']")).click();
		
		Thread.sleep(3000);
		//driver.close();
	}

}
