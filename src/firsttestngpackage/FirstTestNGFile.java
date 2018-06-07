package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile { 
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "D:\\geckodriver\\geckodriver.exe";
	public WebDriver driver ; 
	
  @Test
  public void f() {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.firefox.marionette", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      //driver.close();
  }
}
