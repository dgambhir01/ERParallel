package ER.ER;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	 WebDriver driver;
	
	public WebDriver initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String destPath= System.getProperty("user.dir") + File.separator + "reports" + File.separator + testCaseName + ".png";
		File file = new File(destPath);
		FileUtils.copyFile(src, file);
		return destPath;
	}
	
	@AfterTest
	private void tearDown() {
		// TODO Auto-generated method stub
		
		driver.close();

	}

}
