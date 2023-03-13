package Assert;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_equals {
@Test
public void TC1() {
	String expTitle="Google";
	String actTitle="Google";
	// verify whether two Strings above matches with each other through assertEquals Method instead of using if else condition;
Assert.assertEquals(expTitle, actTitle);

}
}
