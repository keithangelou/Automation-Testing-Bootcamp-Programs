package SeleniumTest.pomsample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage 
{
	WebDriver driver;
	By myAccountDropdown = By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b");
	By signUp = By.xpath("//ul[contains(@class,'navbar-right hidden-sm')]//a/b/../following-sibling::ul//a[contains(text(),'Sign Up')]");

	public homePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Navigate to Sign Up Page
	public signUpPage navigateToSignUpPage() throws Exception
	{
		driver.findElement(myAccountDropdown).click();
		driver.findElement(signUp).click();
		return new signUpPage(driver);
		
	}
	
	
	public signUpPage navigate() throws Exception
	{
		return new signUpPage(driver);
		
	}
}
