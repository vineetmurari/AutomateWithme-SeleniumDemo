package com.Seleniumdemo.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_demo2 {
	
	/**
	 * ID --> Priority.
	 * Name --> Unique Name
	 * Class Name --> Unique 
	 * Xpath --> Mostly used 
	 * Css Selector--> 
	 * Link Text <a>
	 * Partial Link Text <a>
	 */
	
	/**
	 * getAttribute(arg0) .getText().isDisplayed()
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
				
		//Instansiation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
		//naviagte to URL
		driver.get("https://www.google.co.in/");
		
		//Give the search String...
		
		String Search_text="QA Automation";
		WebElement Text_box=driver.findElement(By.name("q"));
		Text_box.sendKeys(Search_text);
		Thread.sleep(3000);
		Text_box.clear();
		Text_box.sendKeys(Keys.ENTER);
		//Click on Google search
		List<WebElement> Button_serach= driver.findElements(By.xpath("//input[@name ='btnK']"));
		
		Button_serach.get(1).click();
		
		Thread.sleep(5000);		
		
		//Close browser
		driver.close();
				
		//Quit Session
		driver.quit();
	}
}
