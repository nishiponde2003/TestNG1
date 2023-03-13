package Emailable_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFF {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\FirefoxDriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
}
}
