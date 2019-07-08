package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demotest1 {

	static WebDriver driver = null;

	@Test
	public static void demo1111() {

		System.out.println("test");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Keyur-Data\\Key-Demo-Selenium08072019\\artifactiddemo\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.google.com");
	}

}
