package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentsPage extends PageObject {

	public StudentsPage(WebDriver driver) {
		super(driver);
<<<<<<< Updated upstream
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className="MuiFab-label")
    	private WebElement addIcon;
	
	 @FindBy(id="formik-text-field-2")
	    private WebElement name;
	 
	 @FindBy(id="formik-text-field-4")
	    private WebElement surname;
	 
	 @FindBy(id="formik-text-field-6")
	    private WebElement accountName;
	 
	 @FindBy(id="formik-text-field-8")
	    private WebElement email;
	 	
	 @FindBy(xpath="//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	    private WebElement saveButton;
	 
	 @FindBy(xpath="//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']")
	    private WebElement deleteButton;
	 
	 @FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']/span[@class='MuiButton-label']")
	    private WebElement addNewCourseButton1;
	 
	 @FindBy(xpath="//div[not(@*)]/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	    private WebElement addNewCourseButton;
	 	
	 
	 @FindBy(id="formik-select-field-52")
	    private WebElement course;
	 
	 @FindBy(id="formik-text-field-10")
	    private WebElement cardNumber;
	 	 
	 @FindBy(className="MuiDataGrid-viewport")
	    private WebElement anyData;
	 
	 @FindBy(className="MuiButton-label")
	    private WebElement toggleCourses;
	 
	 @FindBy(id="formik-text-field-54")
	    private WebElement classesBought;
	 
	 @FindBy(xpath="//div[@class='makeStyles-actions-16']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	    private WebElement saveCourseButton;
	 
	 @FindBy(xpath="//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']")
	    private WebElement courseFromList;
	 
	 
	 	 	 	 
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
	 public void enterAccountName(String accountName){
	        this.accountName.sendKeys(Keys.CONTROL + "a");
	        this.accountName.sendKeys(Keys.DELETE);
	        this.accountName.sendKeys(accountName);	       	       
	    }
	 public void enterEmail(String email){
		 	this.email.sendKeys(Keys.CONTROL + "a");
	        this.email.sendKeys(Keys.DELETE);
	        this.email.sendKeys(email);	       	       
	    }
	 public void enterCardNumber(String cardNumber){
	        this.cardNumber.clear();
	        this.cardNumber.sendKeys(cardNumber);	       	       
	    }
	 
	 public void clickOnClassesBought(){
		 classesBought.click();      	       
	    }
	 public void clickOnCourse(){
		 course.click();      	       
	    }
	 public void clickOnName(){
		 name.click();      	       
	    }
	 public void clickOnSurName(){
		 surname.click();      	       
	    }
	 public void clickOnAccountName(){
		 accountName.click();      	       
	    }
	 public void clickOnEmail(){
		 email.click();      	       
	 } 
	 public void clickOnCardNumber(){
		 cardNumber.click();      	       
	 }
	 public void clickOnAdd(){
		 addIcon.click();      	       
	    }
	 public void clickOnSave(){
		 saveButton.click();      	       
	    }
	 public void clickOnDelete(){
		 deleteButton.click();      	       
	    }
	 
	 public void clickOnAnyData(){
		 anyData.click();      	       
	    }
	 public void clickOnToggleCourses(){
		 toggleCourses.click();      	       
	    }
	 public void clickOnAddNewCourseButton(){
		 addNewCourseButton.click();      	       
	    }
	 // select course from drop down
	 public void selectCourseByValue(int value) {
		 /*Select element = new Select(courseFromList);
		 element.selectByIndex(value);*/
		 courseFromList.click();
=======
		/*
		 * assertTrue(addIcon.isDisplayed()); assertTrue(name.isDisplayed());
		 * assertTrue(accountName.isDisplayed()); assertTrue(email.isDisplayed());
		 * assertTrue(saveButton.isDisplayed()); assertTrue(deleteButton.isDisplayed());
		 * assertTrue(addNewCourseButton.isDisplayed());
		 * assertTrue(course.isDisplayed()); assertTrue(cardNumber.isDisplayed());
		 * assertTrue(anyData.isDisplayed()); assertTrue(toggleCourses.isDisplayed());
		 * assertTrue(classesBought.isDisplayed());
		 * assertTrue(saveCourseButton.isDisplayed());
		 * assertTrue(courseFromList.isDisplayed());
		 */
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "MuiFab-label")
	private WebElement addIcon;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;

	@FindBy(xpath = "//input[@name='surname']")
	private WebElement surname;

	@FindBy(xpath = "//input[@name='accountName']")
	private WebElement accountName;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement saveButton;

	@FindBy(xpath = "//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']")
	private WebElement deleteButton;

	@FindBy(xpath = "//div[not(@*)]/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement addNewCourseButton;

	@FindBy(xpath = "//input[@name='developerCourseId']")
	private WebElement course;

	@FindBy(xpath = "//input[@name='bankCardNumber']")
	private WebElement cardNumber;

	@FindBy(className = "MuiDataGrid-viewport")
	private WebElement anyData;

	@FindBy(className = "MuiButton-label")
	private WebElement toggleCourses;

	@FindBy(xpath = "//input[@name='classesBought']")
	private WebElement classesBought;

	@FindBy(xpath = "//div[@class='makeStyles-actions-16']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement saveCourseButton;

	@FindBy(xpath = "//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']")
	private WebElement courseFromList;

	public void enterName(String name) {
		// this.name.clear();//does not work so it is replaced
		this.name.sendKeys(Keys.CONTROL + "a");
		this.name.sendKeys(Keys.DELETE);
		this.name.sendKeys(name);
	}

	public void enterSurname(String surname) {
		this.surname.sendKeys(Keys.CONTROL + "a");
		this.surname.sendKeys(Keys.DELETE);
		this.surname.sendKeys(surname);
	}

	public void enterAccountName(String accountName) {
		this.accountName.sendKeys(Keys.CONTROL + "a");
		this.accountName.sendKeys(Keys.DELETE);
		this.accountName.sendKeys(accountName);
	}

	public void enterEmail(String email) {
		this.email.sendKeys(Keys.CONTROL + "a");
		this.email.sendKeys(Keys.DELETE);
		this.email.sendKeys(email);
	}

	public void enterCardNumber(String cardNumber) {
		this.cardNumber.clear();
		this.cardNumber.sendKeys(cardNumber);
	}

	public void clickOnClassesBought() {
		if (classesBought.isDisplayed() && classesBought.isEnabled()) {
			classesBought.click();
		}
	}

	public void clickOnCourse() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(course));
		element.click();
	}

	public void clickOnName() {
		if (name.isDisplayed() && name.isEnabled()) {
			name.click();
>>>>>>> Stashed changes
		}
	}

	public void clickOnSurName() {
		if (surname.isDisplayed() && surname.isEnabled()) {
			surname.click();
		}
	}

	public void clickOnAccountName() {
		if (accountName.isDisplayed() && accountName.isEnabled()) {
			accountName.click();
		}
	}

	public void clickOnEmail() {
		if (email.isDisplayed() && email.isEnabled()) {
			email.click();
		}
	}

	public void clickOnCardNumber() {
		if (cardNumber.isDisplayed() && cardNumber.isEnabled()) {
			cardNumber.click();
		}
	}

	public void clickOnAdd() {
		if (addIcon.isDisplayed() && addIcon.isEnabled()) {
			addIcon.click();
		}
	}

	public void clickOnSave() {
		if (saveButton.isDisplayed() && saveButton.isEnabled()) {
			saveButton.click();
		}
	}

	public void clickOnDelete() {
		if (deleteButton.isDisplayed() && deleteButton.isEnabled()) {
			deleteButton.click();
		}
	}

	public void clickOnAnyData() {
		if (anyData.isDisplayed() && anyData.isEnabled()) {
			anyData.click();
		}
	}

	public void clickOnToggleCourses() {
		if (toggleCourses.isDisplayed() && toggleCourses.isEnabled()) {
			toggleCourses.click();
		}
	}

	public void clickOnAddNewCourseButton() {
		if (addNewCourseButton.isDisplayed() && addNewCourseButton.isEnabled()) {
			addNewCourseButton.click();
		}
	}

	// select course from drop down
	public void selectCourseByValue(int value) {
		if (courseFromList.isDisplayed() && courseFromList.isEnabled()) {
			courseFromList.click();
		}

	}

	// enter value of a class
	public void enterClassesBought(String numberOfClasses) {
		this.classesBought.sendKeys(Keys.CONTROL + "a");
		this.classesBought.sendKeys(Keys.DELETE);
		this.classesBought.sendKeys(numberOfClasses);
	}

	public void clickOnSaveCourseButton() {
		if (saveCourseButton.isDisplayed() && saveCourseButton.isEnabled()) {
			saveCourseButton.click();
		}
	}

}
