package com.qafox.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest {
	File file;
	FileInputStream fis;
	
	WebDriver driver;
	Properties prop;
	@BeforeTest
	public void openBrowser() throws IOException
	{    
		file=new File("./config.properties");
		fis=new FileInputStream(file);
		prop=new Properties();
		
		prop.load(fis);
		
	String val=	prop.getProperty("browser");
	String url=prop.getProperty("url");
	
	System.out.println(val);
	   //	driver=new ChromeDriver();
	
	if(val.equals("chrome"))
	{
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	else if(val.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get(url);
	}
	else 
	{
		System.out.println("Browser not found");
	}
		
	}
	
	@Test
	public void test1()
	{
		
	}
	
	
	

}
