package SeleniumTest.pomsample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpPage 
{
	WebDriver driver;
	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By phone = By.name("phone");
	By email = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmpassword");
	//driver.findElement(By.id("cookyGotItBtn")).click();
	By signUpButton = By.xpath("//button[contains(@type,'submit']");
	
	
	public signUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToSignUpPage(String fname, String lname, String num, String mail, String pass, String cpass) throws Exception
	{

		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(phone).sendKeys(num);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirmpassword).sendKeys(cpass);	
		//driver.findElement(By.id("cookyGotItBtn")).click();
		driver.findElement(By.id("cookyGotItBtn")).click();
		driver.findElement(By.xpath("//button[text()=' Sign Up']")).click();
		
		Thread.sleep(3000);
		

	}
	
	public void inputCorrectPass(String pass, String cpass) throws Exception
	{

		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirmpassword).sendKeys(cpass);	
		//driver.findElement(By.id("cookyGotItBtn")).click();
		//driver.findElement(By.id("cookyGotItBtn")).click();
		driver.findElement(By.xpath("//button[text()=' Sign Up']")).click();
		
		Thread.sleep(3000);

	}
	
	public boolean validateUser(String fname, String lname) throws Exception
	{

		boolean text = driver.findElement(By.xpath("//h3[contains(text(),'Hi')]")).isDisplayed();
		if ( text == true) 
		{
			System.out.println(fname +" " + lname);
			return true;
		}
		else 
		{
			return false;
		}


	}
	
	public boolean validatePass()
	{
		boolean text = driver.findElement(By.xpath("//p[contains(text(),'Password not matching with confirm password.')]")).isDisplayed();
		if ( text == true) 
		{
			driver.findElement(password).clear();
			driver.findElement(confirmpassword).clear();
			return true;
		}
		else 
		{
			System.out.println("False");
			return false;
		}
		
	}
}
