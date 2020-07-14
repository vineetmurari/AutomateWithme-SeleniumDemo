package com.Seleniumdemo.Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test9 {
	
	/*
	 * alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()
	 */
public static void main(String[] args) throws InterruptedException {
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
	//Instansiation the WebDriver Instance
	WebDriver driver = new ChromeDriver();
		
	//naviagte to URL
	driver.get("http://the-internet.herokuapp.com/");
	
	
	//Thread.sleep(3000);
	
//	//WebDriver wait
	WebDriverWait wait = new WebDriverWait (driver, 120);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dropdown")));
	
	
	WebElement Dropdown_Link=driver.findElement(By.linkText("Dropdown"));
	Dropdown_Link.click();
	
	driver.close();
	
	driver.quit();
	
}
}
