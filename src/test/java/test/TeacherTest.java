package test;

import org.testng.annotations.Test;

public class TeacherTest extends FunctionalTest {

	Util util = new Util();

	@Test
	public void newTeacher() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");

		TeachersPage teachersPage = new TeachersPage(driver);
		teachersPage.clickOnAdd();
		teachersPage.clickOnName();
		teachersPage.enterName(util.randomString(10));
		teachersPage.clickOnSurName();
		teachersPage.enterSurname(util.randomString(10));
		teachersPage.clickOnEmail();
		teachersPage.enterEmail(util.randomString(5) + "@" + util.randomString(5));
		teachersPage.clickOnSave();
	}

	@Test
	public void editTeacher() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");

		TeachersPage teachersPage = new TeachersPage(driver);
		teachersPage.clickOnAnyData();
		teachersPage.clickOnName();
		teachersPage.enterName(util.randomString(10));
		teachersPage.clickOnSurName();
		teachersPage.enterSurname(util.randomString(10));
		teachersPage.clickOnEmail();
		teachersPage.enterEmail(util.randomString(5) + "@" + util.randomString(5));
		teachersPage.clickOnSave();
	}

	@Test
	public void deleteTeacher() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");

		TeachersPage teachersPage = new TeachersPage(driver);
		teachersPage.clickOnAnyData();
		teachersPage.clickOnName();
		teachersPage.clickOnDelete();
	}

	@Test
	public void addNewCourseTeacher() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");

		TeachersPage teachersPage = new TeachersPage(driver);
		teachersPage.clickOnAnyData();
		// teachersPage.clickOnName();
		teachersPage.clickOnToggleCourses();
		teachersPage.clickOnAssignNewCourseButton();
		teachersPage.clickOnCourse();
		teachersPage.selectCourseByValue(2);
		teachersPage.clickOnSaveCourseButton();
	}

}
