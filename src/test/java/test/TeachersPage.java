package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeachersPage extends PageObject {

	public TeachersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(className="MuiFab-label")
	private WebElement addIcon;
	
	 @FindBy(id="formik-text-field-2")
	    private WebElement name;
	 
	 @FindBy(id="formik-text-field-4")
	    private WebElement surname;
	 
	 @FindBy(id="formik-text-field-6")
	    private WebElement email;
	 @FindBy(xpath="//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	    private WebElement saveButton;
	 @FindBy(className="MuiDataGrid-mainGridContainer")
	    private WebElement anyData;
	 @FindBy(xpath="//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']")
	    private WebElement deleteButton;
	 @FindBy(className="MuiButton-label")
	    private WebElement toggleCourses;
	 @FindBy(xpath="//div[not(@*)]/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	    private WebElement assignNewCourseButton;
	 @FindBy(id="formik-select-field-32")
	    private WebElement course;
	 @FindBy(xpath="//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']")
	 private WebElement courseFromList;
	 @FindBy(xpath="//div[@class='makeStyles-actions-16']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	    private WebElement saveCourseButton;
	 
	 public void enterName(String name){
	        //this.name.clear();//does not work so it is replaced
	        this.name.sendKeys(Keys.CONTROL + "a");
	        this.name.sendKeys(Keys.DELETE);
	        this.name.sendKeys(name);	       	       
	    }
	 public void enterSurname(String surname){	        
	        this.surname.sendKeys(Keys.CONTROL + "a");
	        this.surname.sendKeys(Keys.DELETE);
	        this.surname.sendKeys(surname);	       	       
	    }
	 public void enterEmail(String email){
		 	this.email.sendKeys(Keys.CONTROL + "a");
	        this.email.sendKeys(Keys.DELETE);
	        this.email.sendKeys(email);	       	       
	    }
	 
	 public void clickOnName(){
		 name.click();      	       
	    }
	 public void clickOnSurName(){
		 surname.click();      	       
	    }
	 public void clickOnEmail(){
		 email.click();      	       
	 } 
	 public void clickOnAdd(){
		 addIcon.click();      	       
	    }
	 public void clickOnSave(){
		 saveButton.click();      	       
	    }
	 public void clickOnAnyData(){
		 anyData.click();      	       
	    }
	 public void clickOnDelete(){
		 deleteButton.click();      	       
	    }
	 public void clickOnToggleCourses(){
		 toggleCourses.click();      	       
	    }
	 public void clickOnAssignNewCourseButton(){
		 assignNewCourseButton.click(); 
	 }
	 public void clickOnCourse(){
		 course.click();      	       
	    }
	 // select course from drop down
	 public void selectCourseByValue(int value) {		 
		 courseFromList.click();
		}
	 public void clickOnSaveCourseButton(){
		 saveCourseButton.click();      	       
	    }
}

	