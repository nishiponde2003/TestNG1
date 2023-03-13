package Hard_Soft_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
@Test
public void TC1() {
	String s1="Hii";
	String s2="Hello";
	//create object of SoftAssert class if you want all verifications to execute even if one of verifications fail
	
	SoftAssert s=new SoftAssert();
	s.assertEquals(s1, s2);////verification 1 (it will fail as Strings dont match)
	
	Reporter.log("Hi im running after Verification 1",true);//Verifications 2
	s.assertAll();
}

@Test
public void TC2() {
	Reporter.log("Running TC2",true);
	
}
}
