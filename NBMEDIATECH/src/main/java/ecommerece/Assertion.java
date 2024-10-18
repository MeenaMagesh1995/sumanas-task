package ecommerece;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void testAssertFunctions() {
		System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	}
