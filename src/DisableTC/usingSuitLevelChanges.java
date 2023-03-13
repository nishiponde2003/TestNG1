package DisableTC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class usingSuitLevelChanges {
	//for this way of skipping TC using Suit Level Changes we make modification in suit.
	//please refer the test suit for this program 
	//we are going to disable or skip TC2, so it will not come into emailable report nor will appear as a failed test.
	@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("Running TC3",true);
	}
}
