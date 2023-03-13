package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount=2)
	public void TC1() {
		Reporter.log("Runing TC1",true);
	}

	@Test(invocationCount=3)
	public void TC2() {
		Reporter.log("Running TC2",true);
	}
}
