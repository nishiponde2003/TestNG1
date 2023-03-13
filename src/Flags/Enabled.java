package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {

	@Test(enabled = false)
	public void TC1() {
		Reporter.log("Runnig TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("Runnig TC2",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("Runnig TC3",true);
	}
}
