package Hard_Soft_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_assert {
@Test
public void TC1() {
	Reporter.log("Running TC1",true);
}

@Test
public void TC2() {
	Reporter.log("Running TC2",true);
	Assert.fail();//TC will fail (This is called Hard Assert and verifications further in this test case will not get executed)
	Reporter.log("Hi im running after failing TC2",true);// This verification will not appear in console or emailable report due to hard assert.
}
}
