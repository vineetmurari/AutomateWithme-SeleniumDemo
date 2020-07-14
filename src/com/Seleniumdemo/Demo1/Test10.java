package com.Seleniumdemo.Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/***
 * 
 * 
 * 
 * Actions class - Hover, DragandDrop, Double click, context click
 *
 */


public class Test10 {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
	//Instansiation the WebDriver Instance
	WebDriver driver = new ChromeDriver();
		
	//naviagte to URL
	driver.get("http://the-internet.herokuapp.com/");
	
	WebElement Link = driver.findElement(By.linkText("Broken Images"));
	//NewWindow.click();
	
	Actions action = new Actions(driver);
	action.contextClick(Link).build().perform();
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	
	driver.close();
	driver.quit();
	
}
}
