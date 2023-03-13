package DisableTC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingTestNGFlag {
	//we can skip/disable a TC by using testNG flag: (enabled=false). This is called as hard coding and we generally prefer the other way i.e. by 
	//using suit level changes using keyword-> exclude
	@Test(enabled = false)
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
