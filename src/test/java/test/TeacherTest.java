package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeacherTest extends FunctionalTest {

	@Test
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
	}
	
	@Test
	public void editTeacher(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");		
		TeachersPage teachersPage = new TeachersPage(driver);               
		teachersPage.clickOnAnyData();        
		teachersPage.clickOnName();
		teachersPage.enterName("99edit");
		teachersPage.clickOnSurName();
		teachersPage.enterSurname("9999");                  
		teachersPage.clickOnEmail();
		teachersPage.enterEmail("99999@gmail.com");                
		teachersPage.clickOnSave();
        driver.quit();
	}
	
	@Test
	public void deleteTeacher(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");		
        TeachersPage teachersPage = new TeachersPage(driver);               
        teachersPage.clickOnAnyData();        
        teachersPage.clickOnName();                     
        teachersPage.clickOnDelete();        
        driver.quit();
	}
	@Test
	public void addNewCourseTeacher(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/teacher");		
		TeachersPage teachersPage = new TeachersPage(driver);              
		teachersPage.clickOnAnyData();        
		teachersPage.clickOnName();                     
		teachersPage.clickOnToggleCourses();
		teachersPage.clickOnAssignNewCourseButton();
		teachersPage.clickOnCourse();
		teachersPage.selectCourseByValue(2);               
		teachersPage.clickOnSaveCourseButton();
        driver.quit();
	}
	
}
