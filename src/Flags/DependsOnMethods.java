package Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void LoginTC() {
		Reporter.log("Running Login_TC",true);
		Assert.fail();// test once by removing 'Assert.fail'.
	}

	@Test(dependsOnMethods ={"LoginTC"})
	public void Logout_TC() {
		Reporter.log("Running Logout_TC",true);
	}
}
