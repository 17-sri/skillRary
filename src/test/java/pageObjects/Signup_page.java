package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup_page extends Basepage {

	public Signup_page(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;
	@FindBy(xpath = "//input[@type='email']")
	WebElement txtEmail;
	@FindBy(xpath = "//div[@class='col-md-6']//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//div[@class='col-md-6']//input[@placeholder='Confirm Password']")
	WebElement cnfrmPassword;
	@FindBy(xpath = "//input[@name='signup']")
	WebElement btnRegister;
	@FindBy(xpath = "//h2[normalize-space()='Thank you for Registering.']")
	WebElement msgConfirmation;
	public void setFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void setcnfrmPassword(String pwd) {
		cnfrmPassword.sendKeys(pwd);
	}
	public void clickRegisterBtn() {
		btnRegister.click();
	}
	public String getmsgConfirmation() {
		try {
			return(msgConfirmation.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}
}