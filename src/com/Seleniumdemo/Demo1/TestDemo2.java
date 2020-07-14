package com.Seleniumdemo.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo2 {
	public static void main(String[] args) throws InterruptedException {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
		//Instansiation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
		
		//naviagte to URL
		driver.get("https://www.google.co.in/");
		
		String Serach_text ="QA Automation";
		
		WebElement Text_input_box =driver.findElement(By.name("q"));
		
		Text_input_box.sendKeys(Serach_text);
		
		Thread.sleep(3000);
		
		Text_input_box.clear();
		
		Thread.sleep(3000);
		
		Text_input_box.sendKeys(Keys.ENTER);
		
		List<WebElement> Button_List =driver.findElements(By.name("btnK"));
		
		
		WebElement TargetButton =Button_List.get(1);
		TargetButton.click();
		
		Thread.sleep(3000);
		
		//Close browser
		driver.close();
						
		//Quit Session
		driver.quit();
		
		
	}
}
