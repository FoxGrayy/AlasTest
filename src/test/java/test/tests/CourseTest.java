package test.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.Util;
import test.pageobjects.CoursesPage;
import test.tests.base.FunctionalTest;

public class CourseTest extends FunctionalTest {

	Util util = new Util();
	private CoursesPage coursesPage;
	
	@BeforeMethod
	protected void navigateToCourses() {
		//driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");
		coursesPage = new CoursesPage(driver);
	}
	
	@Test
	public void newCourse() {
		coursesPage.clickOnAdd();
		coursesPage.clickOnDeveloperCourseName();
		coursesPage.enterDeveloperCourseName(util.randomString(10));
		coursesPage.clickOnCostPerClass();
		coursesPage.enterCost(util.randomStringNumber(3));
		coursesPage.clickOnClassPerWeek();
		coursesPage.enterClass(util.randomStringNumber(2));
		coursesPage.clickOnSave();
	}

	@Test
	public void editCourse() {
		coursesPage.clickOnAnyData();
		coursesPage.clickOnDeveloperCourseName();
		coursesPage.enterDeveloperCourseName(util.randomString(7));
		coursesPage.clickOnCostPerClass();
		coursesPage.enterCost(util.randomStringNumber(2));
		coursesPage.clickOnClassPerWeek();
		coursesPage.enterClass(util.randomStringNumber(2));
		coursesPage.clickOnSave();
	}

	@Test
	public void deleteCourse() {
		coursesPage.clickOnAnyData();
		coursesPage.clickOnDeveloperCourseName();
		coursesPage.clickOnDelete();
	}

}
