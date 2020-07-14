package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
		/*
		 * Link click -completed
		 * Alerts-completed
		 * Page Back, forward, Maximize, Reload -completed
		 *  Checkbox
		 * Radio Buttons
		 * DropDown
		 * Waits - V important
		 * Web tables
		 * Multiple windows Tab
		 * Frames.
		 * Action Calss - K M Actions
		 * JS Executor
		 * 
		 */
	
	
		// Working with Alerts..
	
		public static void main(String[] args) throws InterruptedException {
			//Driver exe config
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
			
			//Instansiation the WebDriver Instance
			WebDriver driver = new ChromeDriver();
			
			//naviagte to URL
			driver.get("http://the-internet.herokuapp.com/");
			
			//Maxzimize 
			driver.manage().window().maximize();
			
			WebElement Alerts_Link=driver.findElement(By.linkText("JavaScript Alerts"));
			Alerts_Link.click();
			
			WebElement Button_JS_Alert =driver.findElement(By.xpath("//li[1]//button[1]"));
			Button_JS_Alert.click();
			Thread.sleep(3000);
			
			// Handle alert
			driver.switchTo().alert().accept(); //dismmiss
//			driver.switchTo().alert().dismiss();
			
			//comparing the Results
			String Expected="You successfuly clicked an alert";
			
			String Actual=driver.findElement(By.id("result")).getText();
			
			if(Expected.equalsIgnoreCase(Actual)){    
				System.out.println("PASS: The Results are matching");
			}
			else{
				System.out.println("Fail: Your results are not matching");
			}
			
			
			
			//BACK
			driver.navigate().back();
			Thread.sleep(3000);
			//Forward
			driver.navigate().forward();
			Thread.sleep(3000);
			//Reload
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			//Close browser
			driver.close();
							
			//Quit Session
			driver.quit();
		}
}
