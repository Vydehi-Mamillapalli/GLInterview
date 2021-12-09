package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.EnglishTest;
import resources.base;

public class EnglishTestPage extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	 
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test
	
	public void testExamNavigation() throws IOException
	{

	
		driver.get(prop.getProperty("url"));
		EnglishTest ET = new EnglishTest(driver);
		ET.selectEnglish().click();
	    ET.starttest().click();
		ET.clickSecondPane().click();
		ET.clickOneNext().click();
		ET.clickMultiQone().click();
		ET.clickTwoNext().click();
		ET.clickMultiQtwo().click();
		ET.clickThreeNext().click();
		ET.clickFourNext().click();
		ET.clickMultiQthree().click();
		ET.clickFiveNext().click();
		ET.clickMultiQfour().click();
		ET.clickSixNext().click();
		ET.clickSevenNext().click();
		ET.clickMultiQfive().click();
		ET.clickEightNext().click();
		ET.clickMultiQsix().click();
		ET.clickNineNext().click();
		ET.clickMultiQseven().click();
		ET.clickTenNext().click();
		ET.clickEndtest().click();
	}

	@AfterTest
	public void teardown()
	{
		
		//driver.close();
	
		
	}


		
		
	}
	

