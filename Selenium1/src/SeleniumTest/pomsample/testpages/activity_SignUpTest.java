package SeleniumTest.pomsample.testpages;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumTest.pomsample.pages.homePage;
import SeleniumTest.pomsample.pages.signUpPage;

public class activity_SignUpTest 
{

WebDriver driver;
	
	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpulumbarit\\Documents\\Selenium Training DXC\\seleniumbrowsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception 
	{
		
		//driver.close();
	}

	@Test
	public void signUp() throws Exception 
	{
		String fname = "Keith";
		String lname = "Pulumbarit";
		String num = "09161234567";
		String mail = "kkkk66@gmail.com";
		String pass = "abcd123456";
		String cpass = "abcd1234";
		
		homePage homepage = new homePage(driver);
		signUpPage objSignUp = homepage.navigateToSignUpPage();
		
		signUpPage objSignUp1 = homepage.navigate();


		objSignUp.navigateToSignUpPage(fname, lname, num, mail, pass, cpass);
		boolean h = objSignUp1.validatePass();
		if (h == true)
		{
			pass = "abcd1234";
			cpass = "abcd1234";
			objSignUp1.inputCorrectPass(pass, cpass);
			objSignUp1.validateUser(fname, lname);
		}
		else
		{
			
		}
				
	}
	
	

}
