package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Indexpage extends Basepage {

	public Indexpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[text()='SIGNUP']")
	WebElement lnkRegister;
	@FindBy(xpath = "//a[text()='LOGIN']")
	WebElement slctLogin;
	public void clickRegister() {
		lnkRegister.click();
	}
	public void clickLogin() {
		slctLogin.click();
	}
}