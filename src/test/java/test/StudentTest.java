package test;

import org.testng.annotations.Test;

public class StudentTest extends FunctionalTest {
	
	@Test 
	public void newStudent(){
		
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
        driver.quit();
	}
	@Test
	public void editStudent(){
		
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

	}
	
	@Test
	public void deleteStudent(){

		driver.manage().window().maximize();
		driver.get("http://localhost:3000");
		
        StudentsPage studentsPage = new StudentsPage(driver);               
        studentsPage.clickOnAnyData();        
        studentsPage.clickOnName();                     
        studentsPage.clickOnDelete();        
        driver.quit();
	}
	
	@Test
	public void addNewCourseStudent(){
		
		driver.manage().window().maximize();
		driver.get("http://localhost:3000");
		
        StudentsPage studentsPage = new StudentsPage(driver);               
        studentsPage.clickOnAnyData();        
        studentsPage.clickOnName();                     
        studentsPage.clickOnToggleCourses();
        studentsPage.clickOnAddNewCourseButton();
        studentsPage.clickOnCourse();
        studentsPage.selectCourseByValue(2);
        studentsPage.clickOnClassesBought();
        studentsPage.enterClassesBought("200");
        studentsPage.clickOnSaveCourseButton();
        driver.quit();
	}
}
