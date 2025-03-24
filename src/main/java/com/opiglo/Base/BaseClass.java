package com.opiglo.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	

}
