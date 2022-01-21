package test;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CourseTest extends FunctionalTest {

	Util util = new Util();

	@Test
<<<<<<< Updated upstream
	public void newCourse(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");		
        CoursesPage coursesPage = new CoursesPage(driver);               
        coursesPage.clickOnAdd();
        coursesPage.clickOnName();
        coursesPage.enterName("11111rewqerwq");
        coursesPage.clickOnCostPerClass(); 
        coursesPage.enterCost("500");
        coursesPage.clickOnClassPerWeek();   
        coursesPage.enterClass("10");            
        coursesPage.clickOnSave();        
        driver.quit();
=======
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

>>>>>>> Stashed changes
	}

	@Test
<<<<<<< Updated upstream
	public void editCourse(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");
		
		CoursesPage coursesPage = new CoursesPage(driver);                
		coursesPage.clickOnAnyData();        
		coursesPage.clickOnName();
		coursesPage.enterName("peraaaa");
		coursesPage.clickOnCostPerClass(); 
        coursesPage.enterCost("50000000");
        coursesPage.clickOnClassPerWeek();   
        coursesPage.enterClass("10");            
        coursesPage.clickOnSave();        
        driver.quit();
=======
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

>>>>>>> Stashed changes
	}

	@Test
<<<<<<< Updated upstream
	public void deleteCourse(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");
		
		CoursesPage coursesPage = new CoursesPage(driver);               
		coursesPage.clickOnAnyData();        
		coursesPage.clickOnName();                     
		coursesPage.clickOnDelete();        
        driver.quit();
	}	
=======
	public void deleteCourse() {

		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");

		CoursesPage coursesPage = new CoursesPage(driver);
		coursesPage.clickOnAnyData();
		coursesPage.clickOnDeveloperCourseName();
		coursesPage.clickOnDelete();

	}
>>>>>>> Stashed changes
}
