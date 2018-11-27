package citigroup.nbs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",".//Resources//chromedriver.exe");
		driver =new ChromeDriver();
	}
	@Test
	public void launchApp() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
//		driver.get("http://demo.guru99.com/test/guru99home/");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
