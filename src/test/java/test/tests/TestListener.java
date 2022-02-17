package test.tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;	

public class TestListener  implements ITestListener
{
	private static Logger log = LogManager.getLogger(Log.class.getName());
				
	
	@Override
	public void onTestStart(ITestResult result) {
		log.info("$$$$$$$$$$$$$$$$$$$$$     " + "START" + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		log.info(result.getMethod().getMethodName() + " Started ");
		log.info(result.getMethod().getDescription());
		
		
	}
	
	public void endTestCase(ITestResult result) {
		log.info(result.getMethod().getMethodName() + " Finished ");
		log.info(result.getMethod().getDescription());
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

	}


	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info( " TestCase succeeded and TestCase name is:" + result.getMethod().getMethodName());
	}


	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.info( " TestCase failed and TestCase name is:" + result.getMethod().getMethodName());
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info( " TestCase skipped and TestCase name is:" + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		log.info(" TestCase failed with success pecentage :" + result.getMethod().getSuccessPercentage());
	}


	public void onStart(ITestResult result) {
		log.info("$$$$$$$$$$$$$$$$$$$$$     " + "START" + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		log.info(result.getMethod().getMethodName() + " Started ");
		log.info(result.getMethod().getDescription());
		
	}


	public void onFinish(ITestResult result) {
		log.info(result.getMethod().getMethodName() + " Finished ");
		log.info(result.getMethod().getDescription());
		log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}   
}
