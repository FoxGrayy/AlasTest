package test;

import org.testng.annotations.Test;

public class CourseTest extends FunctionalTest {

	Util util = new Util();

	@Test
	public void newCourse() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");

		CoursesPage coursesPage = new CoursesPage(driver);
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

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");

		CoursesPage coursesPage = new CoursesPage(driver);
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

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");

		CoursesPage coursesPage = new CoursesPage(driver);
		coursesPage.clickOnAnyData();
		coursesPage.clickOnDeveloperCourseName();
		coursesPage.clickOnDelete();

	}

}
