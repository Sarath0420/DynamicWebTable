package org.dynamicwebtable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload 
{
	static WebDriver driver;

	@Test
	public void tc0() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/upload/");

		String path = "E:\\Sarath\\Selenium Class\\Important Documents\\POM.txt";

		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys(path);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.id("submitbutton")).click();
	}
}
