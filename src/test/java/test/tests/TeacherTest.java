package test.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.Util;
import test.pageobjects.TeachersPage;
import test.tests.base.FunctionalTest;

@Listeners(test.tests.TestListener.class)
public class TeacherTest extends FunctionalTest {

	Util util = new Util();
	private TeachersPage teachersPage;

	@BeforeMethod
	protected void navigateToTeachers() {
		// driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");
		teachersPage = new TeachersPage(driver);
	}

	@Test
	public void newTeacher() {
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
		teachersPage.clickOnAnyData();
		teachersPage.clickOnName();
		teachersPage.clickOnDelete();
	}

	@Test
	public void addNewCourseTeacher() {
		teachersPage.clickOnAnyData();
		// teachersPage.clickOnName();
		teachersPage.clickOnToggleCourses();
		teachersPage.clickOnAssignNewCourseButton();
		teachersPage.clickOnCourse();
		teachersPage.selectCourseByValue(2);
		teachersPage.clickOnSaveCourseButton();
	}

}
