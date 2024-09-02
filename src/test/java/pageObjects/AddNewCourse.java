package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddNewCourse extends Basepage {

	public AddNewCourse(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath ="//span[text()='Courses']")
	WebElement btnCourse;
	@FindBy(css = "a[href='products.php']")
	WebElement btnCourseList;
	@FindBy(xpath = "//a[@id='addproduct']")
	WebElement btnNew;
	@FindBy(xpath = "//input[@id='name']")
	WebElement txtCourseName;
	@FindBy(xpath = "//input[@id='price']")
	WebElement textCoursePrice; 
	@FindBy(xpath = "//select[@id='category']")
	WebElement categoryDropdown;
	@FindBy(xpath = "//button[@name='add']")
	WebElement  btnSave;
	public void clickCourse() {
		btnCourse.click();
	}
	public void clickCourseList() {
		btnCourseList.click();
	}
	public void clickNew() {
		btnNew.click();
	}
	public void setCourseName(String cName) {
		txtCourseName.sendKeys(cName);
	}
	public void setCoursePrice(String cPrice) {
		textCoursePrice.sendKeys(cPrice);
	}
	public void setddCategory(String category) {
		Select dropdown = new Select(categoryDropdown);
	    dropdown.selectByVisibleText(category);		
	}
	public void clickSave() {
		btnSave.click();
	}	
}