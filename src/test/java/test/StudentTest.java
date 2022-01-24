package test;

import org.testng.annotations.Test;

public class StudentTest extends FunctionalTest {

	Util util = new Util();

	@Test
	public void newStudent() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000");

		StudentsPage studentsPage = new StudentsPage(driver);

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

		driver.manage().window().maximize();
		driver.get("http://localhost:3000");

		StudentsPage studentsPage = new StudentsPage(driver);
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

		driver.manage().window().maximize();
		driver.get("http://localhost:3000");

		StudentsPage studentsPage = new StudentsPage(driver);
		studentsPage.clickOnAnyData();
		studentsPage.clickOnName();
		studentsPage.clickOnDelete();
	}

	@Test
	public void addNewCourseStudent() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000");

		StudentsPage studentsPage = new StudentsPage(driver);
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
