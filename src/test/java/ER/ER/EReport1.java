package ER.ER;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class EReport1 extends Base {

	WebDriver driver;

	@Test
	private void testYouTube() {

		driver = initializeDriver();
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());

	}

}
