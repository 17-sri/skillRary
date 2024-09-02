package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Indexpage;
import pageObjects.Signup_page;
import testBase.Baseclass;

public class TC001_SignupTest extends Baseclass {
	//public WebDriver driver;

	@Test
	public void verify_Signup()  {
		Indexpage indexPage = new Indexpage(driver);
		indexPage.clickRegister();
		Signup_page signUp = new Signup_page(driver);
		signUp.setFirstName(randomString());
		signUp.setLastName(randomString());
		signUp.setEmail(randomString()+"@gmail.com");
		String password = randomAlphaNumeric();
		signUp.setPassword(password);
		signUp.setcnfrmPassword(password);
		signUp.clickRegisterBtn();
		String cnfrmMsg = signUp.getmsgConfirmation();
		Assert.assertEquals(cnfrmMsg, "Thank you for Registering.");
	}
} 