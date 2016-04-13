package com.spark.test;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QASample {
	
	public WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	
	@Test
	public void TestgoogleSearch() {
		System.out.println("I M in google Search");
	}
	
	@Test
	public void TestYahoosearch() {
		System.out.println("i m in yahoo serach");
	}

	@After
	public void tearDown() throws Exception {

		driver.close();
		driver.quit();
	}


}