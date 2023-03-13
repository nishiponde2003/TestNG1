package Emailable_report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {

	@Test
public void TC2() {
	Reporter.log("Running TC2",true);
}

@Test
public void TC1() {
	Reporter.log("Running TC1",true);
	Assert.fail();//this is used to intentionally fail the TC
}

@Test
public void TC3() {
	Reporter.log("RunningTC3",true);
	Assert.fail();//this is used to intentionally fail the TC
}

@Test
public void TC4() {
	Reporter.log("Running TC4",true);
}

@Test
public void TC5() {
	Reporter.log("Running TC5");
}

}
