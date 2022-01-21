package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeacherTest extends FunctionalTest {

	Util util = new Util();

	@Test
<<<<<<< Updated upstream
	public void newTeacher(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");		
        TeachersPage teachersPage = new TeachersPage(driver);              
        teachersPage.clickOnAdd();
        teachersPage.clickOnName();
        teachersPage.enterName("profsor");
        teachersPage.clickOnSurName();
        teachersPage.enterSurname("profa");                   
        teachersPage.clickOnEmail();
        teachersPage.enterEmail("55233fdsfds@gmail.com");            
        teachersPage.clickOnSave();
        
        driver.quit();
=======
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
		driver.quit();
>>>>>>> Stashed changes
	}

	@Test
<<<<<<< Updated upstream
	public void editTeacher(){
		
		WebDriver driver=new ChromeDriver();
=======
	public void editTeacher() {

>>>>>>> Stashed changes
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
        driver.quit();
	}

	@Test
<<<<<<< Updated upstream
	public void deleteTeacher(){
		
		WebDriver driver=new ChromeDriver();
=======
	public void deleteTeacher() {

>>>>>>> Stashed changes
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");

		TeachersPage teachersPage = new TeachersPage(driver);
		teachersPage.clickOnAnyData();
		teachersPage.clickOnName();
		teachersPage.clickOnDelete();
		driver.quit();
	}

	@Test
<<<<<<< Updated upstream
	public void addNewCourseTeacher(){
		
		WebDriver driver=new ChromeDriver();
=======
	public void addNewCourseTeacher() {

>>>>>>> Stashed changes
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
        driver.quit();
	}

}
