package ER.ER;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class EReport3 extends Base {

	WebDriver driver;


	@Test
	private void testYahoo() {

		driver = initializeDriver();
		driver.get("https://yahoo.com");
		System.out.println(driver.getTitle());

		Assert.assertFalse(true);

	}

}
