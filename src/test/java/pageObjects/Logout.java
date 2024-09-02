package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends Basepage {

	public Logout(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[@class='hidden-xs']")
	WebElement lnkAdmin;
	@FindBy(xpath = "//a[normalize-space()='Sign out']")
	WebElement lnkSignout;
	public void clickAdmin() {
		lnkAdmin.click();
	}
	public void clickSignout() {
		lnkSignout.click();
	}
}