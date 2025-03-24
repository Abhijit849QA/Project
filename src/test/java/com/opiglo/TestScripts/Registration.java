package com.opiglo.TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration {
	
	@Test
	public void registration() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://dreamwaveinnovation.tech/");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	String text=	driver.findElement(By.xpath("//p[contains(text(),'To sign up')]")).getText();
	System.out.println(text);
        Assert.assertEquals(text,"To sign up, please provide the following information. If you have any questions, please visit our Contact Us page.");
	}
	@Test
	public void fullRegistration() {
		
		
	}
	

}
