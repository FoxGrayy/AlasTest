package test;

import org.testng.annotations.Test;

public class CourseTest extends FunctionalTest {
	
	@Test
	public void newCourse(){
		
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

	}
	@Test
	public void editCourse(){

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

	}
	
	@Test
	public void deleteCourse(){
		
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/course");
		
		CoursesPage coursesPage = new CoursesPage(driver);               
		coursesPage.clickOnAnyData();        
		coursesPage.clickOnName();                     
		coursesPage.clickOnDelete();    
		driver.quit();

	}	
}
