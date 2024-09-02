package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='email']")
	WebElement txtuserName;
	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@id='last']")
	WebElement btnLogin;
	public void setusername(String uname) {
		txtuserName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickLoginbtn() {
		btnLogin.click();
	}
}