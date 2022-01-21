package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
<<<<<<< Updated upstream
=======
import org.junit.jupiter.api.AfterAll;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
>>>>>>> Stashed changes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
<<<<<<< Updated upstream
=======
import org.testng.annotations.Test;
>>>>>>> Stashed changes

public class FunctionalTest {
	
    protected static WebDriver driver;
    

<<<<<<< Updated upstream
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
=======
	public static WebDriver driver;

	@Test
	@BeforeClass
	@Parameters("browser")

	public static void setUp(@Optional("firefox") String browser) throws Exception {
		// Check if parameter passed from TestNG crossbrowser.xml is 'chrome'
		if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			// create chrome instance
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		// Check if parameter passed as 'firefox'
		else if (browser.equalsIgnoreCase("firefox")) {
			// set path to geckodriver.exe
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else {
			// If no browser or incorrect browser is passed throw exception
			throw new Exception("Incorrect Browser");
		}
	}

	@AfterAll
	public void cleanUp() {
		 driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown() {
		 driver.close();
	}
>>>>>>> Stashed changes
}