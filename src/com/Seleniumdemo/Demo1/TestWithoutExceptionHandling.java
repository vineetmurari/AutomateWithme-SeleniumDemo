package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithoutExceptionHandling {
	public static void main(String[] args) {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
		//Instansiation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
		
		//naviagte to URL
		driver.get("http://the-internet.herokuapp.com/");
		
		//Check the Test with exception Handling
	
			if(driver.findElement(By.linkText("ABCDEFGH")).isDisplayed()){
				System.out.println("PASS: The Fake Link is displayed on the Screen.");
			}

		
		driver.findElement(By.linkText("A/B Testing")).click();
	}
}
