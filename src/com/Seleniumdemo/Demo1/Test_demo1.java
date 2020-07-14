package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_demo1 {

	public static void main(String[] args) throws InterruptedException {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
		//Instansiation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
		
		//naviagte to URL
		driver.get("https://www.google.co.in/");
		
		//get Title text here
		String Text_Title = driver.getTitle();
		
		//Wait
		Thread.sleep(4000);
		
		//Print the Text inside the Title Tag.
		System.out.println(" The Title Tag Text is "+Text_Title);
		
		//Close browser
		driver.close();
		
		//Quit Session
		driver.quit();
	}

}
