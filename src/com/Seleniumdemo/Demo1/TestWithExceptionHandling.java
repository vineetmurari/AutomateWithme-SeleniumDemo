package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithExceptionHandling {
public static void main(String[] args) throws Exception {
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
	
	//Instansiation the WebDriver Instance
	WebDriver driver = new ChromeDriver();
	
	//naviagte to URL
	driver.get("http://the-internet.herokuapp.com/");
	
	//Check the Test with exception Handling
	TestWithExceptionHandling.Exception_test(driver);
	
	
	driver.findElement(By.linkText("A/B Testing")).click();
}

public static void Exception_test(WebDriver driver) throws Exception {
	try{
		if(driver.findElement(By.linkText("ABCDEFGH")).isDisplayed()){
			System.out.println("PASS: The Fake Link is displayed on the Screen.");
		}
	}
	catch(Exception e){
		System.out.println(e);;
	}
}
}
