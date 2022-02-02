package test.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.Util;
import test.pageobjects.StudentsPage;
import test.tests.base.FunctionalTest;

public class StudentTest extends FunctionalTest {

	Util util = new Util();
	private StudentsPage studentsPage;
	
	@BeforeMethod
	protected void navigateToCourses() {
		//driver.manage().window().maximize();
		driver.get("http://localhost:3000");
		studentsPage = new StudentsPage(driver);
	}
	
	@Test
	public void newStudent() {
		studentsPage.clickOnAdd();
		studentsPage.clickOnName();
		studentsPage.enterName(util.randomString(7));
		studentsPage.clickOnSurName();
		studentsPage.enterSurname(util.randomString(7));
		studentsPage.clickOnAccountName();
		studentsPage.enterAccountName(util.randomString(7));
		studentsPage.clickOnEmail();
		studentsPage.enterEmail(util.randomString(5) + "@" + util.randomString(4));
		studentsPage.clickOnCardNumber();
		studentsPage.enterCardNumber(util.randomStringNumber(7));
		studentsPage.clickOnSave();
	}

	@Test
	public void editStudent() {
		studentsPage.clickOnAnyData();
		studentsPage.clickOnName();
		studentsPage.enterName(util.randomString(7));
		studentsPage.clickOnSurName();
		studentsPage.enterSurname(util.randomString(7));
		studentsPage.clickOnEmail();
		studentsPage.enterEmail(util.randomString(7) + "@" + util.randomString(5));
		studentsPage.clickOnSave();
	}

	@Test
	public void deleteStudent() {
		studentsPage.clickOnAnyData();
		studentsPage.clickOnName();
		studentsPage.clickOnDelete();
	}

	@Test
	public void addNewCourseStudent() {
		studentsPage.clickOnAnyData();
		studentsPage.clickOnToggleCourses();
		studentsPage.clickOnAddNewCourseButton();
		studentsPage.clickOnCourse();
		studentsPage.selectCourseByValue(2);
		studentsPage.clickOnClassesBought();
		studentsPage.enterClassesBought(util.randomStringNumber(2));
		studentsPage.clickOnSaveCourseButton();
	}
}
