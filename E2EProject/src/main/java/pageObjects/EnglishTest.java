package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnglishTest {
	public WebDriver driver;
	
	By English=By.linkText("English");
	By Starttest=By.xpath("//button[@class='start-test-button']");
	By SecondPane=By.xpath("(//button[@type='button'])[2]");	
	By OneNext=By.xpath("//button[@class='next-button']");
	By MultiQone=By.xpath("(//label[@class='multi-choice-answer-label'])[3]");	
	By TwoNext=By.xpath("//button[@class='next-button']");
	By MultiQtwo=By.xpath("(//label[@class='multi-choice-answer-label'])[4]");	
	By ThreeNext=By.xpath("//button[@class='next-button']");
	By FourNext=By.xpath("//button[@class='next-button']");
	By MultiQthree=By.xpath("(//label[@class='multi-choice-answer-label'])[2]");	
	By FiveNext=By.xpath("//button[@class='next-button']");
	By MultiQfour=By.xpath("(//label[@class='multi-choice-answer-label'])[2]");	
	By SixNext=By.xpath("//button[@class='next-button']");
	By SevenNext=By.xpath("//button[@class='next-button']");
	By MultiQfive=By.xpath("(//label[@class='multi-choice-answer-label'])[2]");	
	By EightNext=By.xpath("//button[@class='next-button']");
	By MultiQsix=By.xpath("(//label[@class='multi-choice-answer-label'])[5]");	
	By NineNext=By.xpath("//button[@class='next-button']");
	By MultiQseven=By.xpath("(//label[@class='multi-choice-answer-label'])[2]");	
	By TenNext=By.xpath("//button[@class='next-button']");
	By Endtest=By.xpath("//button[@class='end-test-button']");
	
	public EnglishTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement selectEnglish()
	{
	 return	driver.findElement(English);
	}
	
	public WebElement starttest()
	{
	return	driver.findElement(Starttest);
	}
	public WebElement clickSecondPane()
	{
	return	driver.findElement(SecondPane);
	}
	public WebElement clickOneNext()
	{
	return	driver.findElement(OneNext);
	}
	public WebElement clickMultiQone()
	{
	return	driver.findElement(MultiQone);
	}
	public WebElement clickTwoNext()
	{
	return	driver.findElement(TwoNext);
	}
	public WebElement clickMultiQtwo()
	{
	return	driver.findElement(MultiQtwo);
	}
	public WebElement clickThreeNext()
	{
	return	driver.findElement(ThreeNext);
	}
	public WebElement clickFourNext()
	{
	return	driver.findElement(FourNext);
	}
	public WebElement clickMultiQthree()
	{
	return	driver.findElement(MultiQthree);
	}
	public WebElement clickFiveNext()
	{
	return	driver.findElement(FiveNext);
	}
	public WebElement clickMultiQfour()
	{
	return	driver.findElement(MultiQfour);
	}
	public WebElement clickSixNext()
	{
	return	driver.findElement(SixNext);
	}
	public WebElement clickSevenNext()
	{
	return	driver.findElement(SevenNext);
	}
	public WebElement clickMultiQfive()
	{
	return	driver.findElement(MultiQfive);
	}
	public WebElement clickEightNext()
	{
	return	driver.findElement(EightNext);
	}
	public WebElement clickMultiQsix()
	{
	return	driver.findElement(MultiQsix);
	}
	public WebElement clickNineNext()
	{
	return	driver.findElement(NineNext);
	}
	public WebElement clickMultiQseven()
	{
	return	driver.findElement(MultiQseven);
	}
	public WebElement clickTenNext()
	{
	return	driver.findElement(TenNext);
	}
	public WebElement clickEndtest()
	{
	return	driver.findElement(Endtest);
	}
	
}
