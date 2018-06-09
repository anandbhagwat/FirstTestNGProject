package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGFile2 { 
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "D:\\geckodriver\\geckodriver.exe";
	public WebDriver driver ; 
	
	
	@BeforeTest
	public void f0() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void f00() {
		System.out.println("After Test");
	}
	
	
	@BeforeMethod
	public void f0000() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void f000() {
		System.out.println("After Method");
	}
	
	
  @Test
  
  public void f1() {			
	  System.out.println("In Method f1");
		}
//	  System.out.println("launching firefox browser"); 
//      System.setProperty("webdriver.firefox.marionette", driverPath);
//      driver = new FirefoxDriver();
//      driver.get(baseUrl);
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
//      //driver.close();
  
@Test
  
  public void f2() {
	System.out.println("In Method f2");
//	  System.out.println("launching firefox browser"); 
//      System.setProperty("webdriver.firefox.marionette", driverPath);
//      driver = new FirefoxDriver();
//      driver.get(baseUrl);
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
      //driver.close();
  }
}
