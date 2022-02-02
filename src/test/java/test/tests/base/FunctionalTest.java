package test.tests.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class FunctionalTest {

	public WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setUp(@Optional("firefox") String browser) throws Exception {
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

	@AfterMethod
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}