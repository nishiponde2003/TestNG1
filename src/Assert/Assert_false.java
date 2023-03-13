package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_false {
	@Test 
	public void TC3() {
		Reporter.log("RunningTC3",false);
	    int LnkGivenNo=30;
		int	LnkActNo=25;
		boolean actR=LnkGivenNo==LnkActNo;
		Assert.assertFalse(actR);//TC is Passed
		//This is changed code
}
}
