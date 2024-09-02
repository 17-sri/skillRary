package testCases;

import org.testng.annotations.Test;

import pageObjects.Logout;
import testBase.Baseclass;

public class TC003_LogoutTest extends Baseclass{
		
	@Test
	public void verify_Logout() throws InterruptedException {
		login();
		Logout logout = new Logout(driver);
		logout.clickAdmin();
		logout.clickSignout();
	}
}