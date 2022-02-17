package test.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.pageobjects.base.PageObject;

public class StudentsPage extends PageObject {

	public StudentsPage(WebDriver driver) {
		super(driver);
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

	PageObject po = new PageObject(driver);

	@FindBy(className = "MuiFab-label")
	private WebElement addIcon;

	@FindBy(xpath = ".//input[@name='name']")
	private WebElement name;

	@FindBy(xpath = ".//input[@name='surname']")
	private WebElement surname;

	@FindBy(xpath = ".//input[@name='accountName']")
	private WebElement accountName;

	@FindBy(xpath = ".//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = ".//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement saveButton;

	@FindBy(xpath = ".//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']")
	private WebElement deleteButton;

	@FindBy(xpath = ".//div[not(@*)]/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement addNewCourseButton;

	@FindBy(xpath = ".//input[@name='developerCourseId']")
	private WebElement course;

	@FindBy(xpath = ".//input[@name='bankCardNumber']")
	private WebElement cardNumber;

	@FindBy(className = "MuiDataGrid-viewport")
	private WebElement anyData;

	@FindBy(className = "MuiButton-label")
	private WebElement toggleCourses;

	@FindBy(xpath = ".//input[@name='classesBought']")
	private WebElement classesBought;

	@FindBy(xpath = ".//div[@class='makeStyles-actions-16']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement saveCourseButton;

	@FindBy(xpath = ".//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']")
	private WebElement courseFromList;

	public StudentsPage enterName(String name) {
		// this.name.clear();//does not work so it is replaced
		this.name.sendKeys(Keys.CONTROL + "a");
		this.name.sendKeys(Keys.DELETE);
		this.name.sendKeys(name);
		return this;
	}

	public StudentsPage enterSurname(String surname) {
		this.surname.sendKeys(Keys.CONTROL + "a");
		this.surname.sendKeys(Keys.DELETE);
		this.surname.sendKeys(surname);
		return this;
	}

	public StudentsPage enterAccountName(String accountName) {
		this.accountName.sendKeys(Keys.CONTROL + "a");
		this.accountName.sendKeys(Keys.DELETE);
		this.accountName.sendKeys(accountName);
		return this;
	}

	public StudentsPage enterEmail(String email) {
		this.email.sendKeys(Keys.CONTROL + "a");
		this.email.sendKeys(Keys.DELETE);
		this.email.sendKeys(email);
		return this;
	}

	public StudentsPage enterCardNumber(String cardNumber) {
		this.cardNumber.clear();
		this.cardNumber.sendKeys(cardNumber);
		return this;
	}

	public StudentsPage clickOnClassesBought() {
		po.WaitToBeClickable(classesBought);
		po.CheckIsDisplayedAndClick(classesBought);
		return this;
	}

	public StudentsPage clickOnCourse() {
		po.WaitToBeClickable(course);
		po.CheckIsDisplayedAndClick(course);
		return this;
	}

	public StudentsPage clickOnName() {
		po.WaitToBeClickable(name);
		po.CheckIsDisplayedAndClick(name);
		return this;

	}

	public StudentsPage clickOnSurName() {
		po.WaitToBeClickable(surname);
		po.CheckIsDisplayedAndClick(surname);
		return this;
	}

	public StudentsPage clickOnAccountName() {
		po.WaitToBeClickable(accountName);
		po.CheckIsDisplayedAndClick(accountName);
		return this;
	}

	public StudentsPage clickOnEmail() {
		po.WaitToBeClickable(email);
		po.CheckIsDisplayedAndClick(email);
		return this;
	}

	public StudentsPage clickOnCardNumber() {
		po.WaitToBeClickable(cardNumber);
		po.CheckIsDisplayedAndClick(cardNumber);
		return this;
	}

	public StudentsPage clickOnAdd() {
		po.WaitToBeClickable(addIcon);
		po.CheckIsDisplayedAndClick(addIcon);
		return this;
	}

	public StudentsPage clickOnSave() {
		po.WaitToBeClickable(saveButton);
		po.CheckIsDisplayedAndClick(saveButton);
		return this;
	}

	public StudentsPage clickOnDelete() {
		po.WaitToBeClickable(deleteButton);
		po.CheckIsDisplayedAndClick(deleteButton);
		return this;
	}

	public StudentsPage clickOnAnyData() {
		po.WaitToBeClickable(anyData);
		po.CheckIsDisplayedAndClick(anyData);
		return this;
	}

	public StudentsPage clickOnToggleCourses() {
		po.WaitToBeClickable(toggleCourses);
		po.CheckIsDisplayedAndClick(toggleCourses);
		return this;
	}

	public StudentsPage clickOnAddNewCourseButton() {
		po.WaitToBeClickable(addNewCourseButton);
		po.CheckIsDisplayedAndClick(addNewCourseButton);
		return this;
	}

	// select course from drop down
	public StudentsPage selectCourseByValue(int value) {
		po.WaitToBeClickable(courseFromList);
		po.CheckIsDisplayedAndClick(courseFromList);
		return this;
	}

	// enter value of a class
	public StudentsPage enterClassesBought(String numberOfClasses) {
		this.classesBought.sendKeys(Keys.CONTROL + "a");
		this.classesBought.sendKeys(Keys.DELETE);
		this.classesBought.sendKeys(numberOfClasses);
		return this;
	}

	public StudentsPage clickOnSaveCourseButton() {
		po.WaitToBeClickable(saveCourseButton);
		po.CheckIsDisplayedAndClick(saveCourseButton);
		return this;
	}

}
