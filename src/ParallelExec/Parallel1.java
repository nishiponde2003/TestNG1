package ParallelExec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium suppliments\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.upstox.com/?&client_id=PW3-6Agd37PB52Q6B6DDpYWLuT7b&platform_id=PW3&redirect_path=%2F&redirect_query=e30%3D&redirect_uri=https%3A%2F%2Fpro.upstox.com");
	}
}
