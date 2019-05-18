package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps 
{
	public WebDriver driver;
	
	
	@Given("I am at the OrangeHRM home page")
	public void i_am_at_the_OrangeHRM_home_page() 
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpulumbarit\\Documents\\Selenium Training DXC\\Selenium-Java-Cucumber\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter {string} and {string}")
	public void i_input(String string, String string2) 
	{
	    driver.findElement(By.name("txtUsername")).sendKeys(string);
	    driver.findElement(By.name("txtPassword")).sendKeys(string2);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() 
	{
	    driver.findElement(By.id("btnLogin")).click();
	}
	
	@When("I click on the admin button")
	public void i_click_on_the_admin_button()
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	@When("I click on the qualifications button")
	public void i_click_on_the_qualifications_button()
	{
		driver.findElement(By.id("menu_admin_Qualifications")).click();
	}
	
	@When("I click on the skills button")
	public void i_click_on_the_skills_button()
	{
		driver.findElement(By.id("menu_admin_viewSkills")).click();
	}
	
	@When("I click on the add button")
	public void i_click_on_the_add_button()
	{
		driver.findElement(By.id("btnAdd")).click();
	}

	
	@When("I enter skills with {string} and {string}")
	public void i_enter(String string3, String string4) 
	{
	    driver.findElement(By.name("skill[name]")).sendKeys(string3);
	    driver.findElement(By.name("skill[description]")).sendKeys(string4);;
	}
	
	@When("I click on the save button")
	public void i_click_on_the_save_button()
	{
		driver.findElement(By.id("btnSave")).click();
	}
	
	@Then("I should see the skills")
	public void i_should_see_the_skills() 
	{
		/*WebElement name = driver.findElement(By.xpath(@));
	    Assert.assertTrue(string3.isDisplayed());
	    Assert.assertTrue(string4.isDisplayed());*/
	    
	}
}
