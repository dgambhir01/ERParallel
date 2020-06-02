package ER.ER;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class EReport2 extends Base {

	WebDriver driver;

	@Test
	private void testGoogle() {

		driver = initializeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

	}

}
