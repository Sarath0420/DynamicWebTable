package org.dynamicwebtable;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable
{
	static WebDriver driver;
	
//	@Test
//	private void tc0()
//	{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.goal.com/en-in/tables");
//		driver.manage().window().maximize();
//
//	}
	
	@Test
	private void tc1()
	{
		// To find number of columns in the table
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> thcontent = driver.findElements(By.tagName("th"));
		
		System.out.println(thcontent.size());
		System.out.println("Hi");
		System.out.println("Sarath");
	}
	
	@Test
	private void tc2()
	{
		// To find number of Rows in the table
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> tablerow = driver.findElements(By.tagName("tr"));
		
		System.out.println(tablerow.size());
		
		WebElement tddata = driver.findElement(By.xpath("//tr[@class='even']/td[text()='Learn to interact with Elements']/following-sibling::td[1]"));
		
		String text = tddata.getText();
		
		System.out.println(text);
	}
	
	@Test
	private void tc3()
	{
		// To find number of Rows in the table
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		WebElement tddata = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following-sibling::td[1]"));
		
//		WebElement tddata = driver.findElement(By.xpath("//tr[@class='even']/td[text()='Learn to interact with Elements']/following-sibling::td[1]"));
		
		String text = tddata.getText();
		
		System.out.println(text);
	}

}
