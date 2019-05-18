package SeleniumTest.pomsample.testpages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumTest.pomsample.pages.homePage;
import SeleniumTest.pomsample.pages.signUpPage;

public class signUpTest 
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
		String mail = "kkkk2@gmail.com";
		String pass = "abcd1234";
		String cpass = "abcd1234";
		
		homePage homepage = new homePage(driver);
		signUpPage objSignUp = homepage.navigateToSignUpPage();
		
		//homepage.navigateToSignUpPage();
		objSignUp.navigateToSignUpPage(fname, lname, num, mail, pass, cpass);
		
		//Thread.sleep(3000);
		
				
	}

}
