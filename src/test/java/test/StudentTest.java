package test;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentTest extends FunctionalTest {
<<<<<<< Updated upstream
	
	@Test
	public void newStudent(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000");
		
        StudentsPage studentsPage = new StudentsPage(driver);       
        
        studentsPage.clickOnAdd();
        studentsPage.clickOnName();
        studentsPage.enterName("11111rewqerwq");
        studentsPage.clickOnSurName();
        studentsPage.enterSurname("11111");    
        studentsPage.clickOnAccountName();        
        studentsPage.enterAccountName("11111");        
        studentsPage.clickOnEmail();
        studentsPage.enterEmail("55233fdsfds@gmail.com");
        studentsPage.clickOnCardNumber();
        studentsPage.enterCardNumber("5555646446");        
        studentsPage.clickOnSave();
        
        //driver.quit();
=======

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

>>>>>>> Stashed changes
	}

	@Test
<<<<<<< Updated upstream
	public void editStudent(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000");
		
        StudentsPage studentsPage = new StudentsPage(driver);               
        studentsPage.clickOnAnyData();        
        studentsPage.clickOnName();
        studentsPage.enterName("99edit");
        studentsPage.clickOnSurName();
        studentsPage.enterSurname("9999");                  
        studentsPage.clickOnEmail();
        studentsPage.enterEmail("99999@gmail.com");                
        studentsPage.clickOnSave();
        driver.quit();
=======
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
>>>>>>> Stashed changes
	}

	@Test
<<<<<<< Updated upstream
	public void deleteStudent(){
		
		WebDriver driver=new ChromeDriver();
=======
	public void deleteStudent() {

>>>>>>> Stashed changes
		driver.manage().window().maximize();
		driver.get("http://localhost:3000");

		StudentsPage studentsPage = new StudentsPage(driver);
		studentsPage.clickOnAnyData();
		studentsPage.clickOnName();
		studentsPage.clickOnDelete();
	}

	@Test
<<<<<<< Updated upstream
	public void addNewCourseStudent(){
		
		WebDriver driver=new ChromeDriver();
=======
	public void addNewCourseStudent() {

>>>>>>> Stashed changes
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
