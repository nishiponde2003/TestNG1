package MultiBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi {
@Parameters("browsername")
@Test
public void TC(String browsername) {
	WebDriver driver=null;
	
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","E:\\\\\\\\FirefoxDriver\\\\\\\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
driver.get("https://www.youtube.com/");

}

}
