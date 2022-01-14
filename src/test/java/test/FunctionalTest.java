package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalTest {
	
    protected static WebDriver driver;
    

    @BeforeClass
    public static void setUp(){
    	//System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp(){
    	//System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        //driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown(){
    	//System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        //driver.close();
    }
}