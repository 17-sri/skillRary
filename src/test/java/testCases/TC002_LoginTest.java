package testCases;

import org.testng.annotations.Test;

import testBase.Baseclass;

public class TC002_LoginTest extends Baseclass{
	@Test
	public void verify_Login() {
		login();
	}
}