package testCases;

import org.testng.annotations.Test;

import pageObjects.AddNewCourse;
import testBase.Baseclass;

public class TC004_AddnewcourseTest extends Baseclass{
	@Test
	public void add_new_course() {
		login();//from Baseclass.java
		AddNewCourse addNewcourse = new AddNewCourse(driver);
		addNewcourse.clickCourse();
		addNewcourse.clickCourseList();
		addNewcourse.clickNew();//consider adding machine learning course
		addNewcourse.setCourseName(courseProperties.getProperty("course.machinelearnig"));
		addNewcourse.setCoursePrice(courseProperties.getProperty("price"));
		addNewcourse.setddCategory(courseProperties.getProperty("category.ML"));
		addNewcourse.clickSave();
	}
}