package test;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CourseTest extends FunctionalTest {
	
	@Test
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
	}
	@Test
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
	}
	
	@Test
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
}
