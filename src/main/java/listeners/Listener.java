package listeners;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		String TCName = result.getName();
		Reporter.log("TC " + TCName + " is completed successfully", true);
	}

	@Override

	public void onTestStart(ITestResult result) {
		String TCName = result.getName();
		Reporter.log("TC" + TCName + "is completd succeessfully", true);
	}

@Override
	public void onTestSkipped(ITestResult result) {
		

	String TCName=result.getName();
	Reporter.log("TC "+ TCName+ "is skipped please check depends method",true);
}
@Override
public void onTestFailure(ITestResult result)
{

Reporter.log("TC " +result.getName()+" is failed, please check again",true);
}



}


