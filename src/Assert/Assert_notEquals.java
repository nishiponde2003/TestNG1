package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_notEquals {
@Test
public void TC2() {
	String expTitle="Google";
	String actTitle="Googgle";
	//Assert.assertNotEquals: test case should pass when two values does not match; 
	Assert.assertNotEquals(expTitle, actTitle);
}

}
