package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void TC1() {
		Reporter.log("Running TC1",true);
	}

	@Test(priority=0)
	public void TC2() {
		Reporter.log("Running TC2",true);
	}

	@Test(priority=-1)
	public void TC3() {
		Reporter.log("Running TC3",true);

	}
	//sequence execution shall be: TC3, TC2, TC1

}
