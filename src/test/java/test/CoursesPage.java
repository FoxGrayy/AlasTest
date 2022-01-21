package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursesPage extends PageObject {

	public CoursesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "MuiFab-label")
	private WebElement addIcon;
	@FindBy(xpath = "//input[@name='developerCourseName']")
	private WebElement developerCourseName;
	@FindBy(xpath = "//input[@name='costPerClass']")
	private WebElement costPerClass;
	@FindBy(xpath = "//input[@name='classesPerWeek']")
	private WebElement classPerWeek;
	@FindBy(xpath = "//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement saveButton;
	@FindBy(className = "MuiDataGrid-viewport")
	private WebElement anyData;
	@FindBy(xpath = "//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']")
	private WebElement deleteButton;

	public void clickOnAdd() {
		addIcon.click();
	}

	public void clickOnDeveloperCourseName() {
		developerCourseName.click();
	}

	public void clickOnCostPerClass() {
		costPerClass.click();
	}

	public void clickOnClassPerWeek() {
		classPerWeek.click();
	}

	public void clickOnSave() {
		saveButton.click();
	}

	public void enterDeveloperCourseName(String developerCourseName) {
		this.developerCourseName.sendKeys(Keys.CONTROL + "a");
		this.developerCourseName.sendKeys(Keys.DELETE);
		this.developerCourseName.sendKeys(developerCourseName);
	}

	public void enterCost(String costPerClass) {
		this.costPerClass.sendKeys(Keys.CONTROL + "a");
		this.costPerClass.sendKeys(Keys.DELETE);
		this.costPerClass.sendKeys(costPerClass);
	}

	public void enterClass(String classPerWeek) {
		this.classPerWeek.sendKeys(Keys.CONTROL + "a");
		this.classPerWeek.sendKeys(Keys.DELETE);
		this.classPerWeek.sendKeys(classPerWeek);
	}

	public void clickOnAnyData() {
		anyData.click();
	}

	public void clickOnDelete() {
		deleteButton.click();
	}
}
