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
	
	@FindBy(className="MuiFab-label")
	private WebElement addIcon;
	@FindBy(id="formik-text-field-2")
    private WebElement name;
	@FindBy(id="formik-text-field-4")
    private WebElement costPerClass;
	@FindBy(id="formik-text-field-6")
    private WebElement classPerWeek;
	@FindBy(xpath="//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
    private WebElement saveButton;
	 @FindBy(className="MuiDataGrid-viewport")
	    private WebElement anyData;
	 @FindBy(xpath="//div[@class='makeStyles-actions-13']/button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary']")
	    private WebElement deleteButton;
	
	public void clickOnAdd(){
		 addIcon.click();      	       
	    }
	public void clickOnName(){
		 name.click();      	       
	    }
	public void clickOnCostPerClass(){
		costPerClass.click();      	       
	    }
	public void clickOnClassPerWeek(){
		classPerWeek.click();      	       
	    }
	public void clickOnSave(){
		 saveButton.click();      	       
	    }
	 public void enterName(String name){	        
	        this.name.sendKeys(Keys.CONTROL + "a");
	        this.name.sendKeys(Keys.DELETE);
	        this.name.sendKeys(name);	       	       
	    }
	 public void enterCost(String costPerClass){	        
	        this.costPerClass.sendKeys(Keys.CONTROL + "a");
	        this.costPerClass.sendKeys(Keys.DELETE);
	        this.costPerClass.sendKeys(costPerClass);	       	       
	    }
	 public void enterClass(String classPerWeek){	        
	        this.classPerWeek.sendKeys(Keys.CONTROL + "a");
	        this.classPerWeek.sendKeys(Keys.DELETE);
	        this.classPerWeek.sendKeys(classPerWeek);	       	       
	    }
	 public void clickOnAnyData(){
		 anyData.click();      	       
	    }
	 public void clickOnDelete(){
		 deleteButton.click();      	       
	    }
}

	