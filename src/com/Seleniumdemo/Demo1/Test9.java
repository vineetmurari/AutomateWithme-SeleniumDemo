package com.Seleniumdemo.Demo1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
	
	
	
	//Implicit wait
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//WebDriver wait
//	WebDriverWait wait = new WebDriverWait (driver, 5);
//	WebElement Dropdown_Link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dropdown")));
	

//	WebElement Dropdown_Link=driver.findElement(By.linkText("Dropdown"));
//	Dropdown_Link.click(); 
	
	
	//Static Wait
	//Thread.sleep(5000);
	
	
// Fluent Wait
//		FluentWait<WebDriver> wait = new FluentWait<>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(Exception.class);
//
//				WebElement ele=wait.until(new Function<WebDriver, WebElement>() {
//				@Override
//				public WebElement apply(WebDriver t) {
//					return driver.findElement(By.linkText("Dropdown"));
//				}
//				});
//		
//				ele.click();
	
	
// //Fluent Wait - variant
//	FluentWait<WebDriver> wait = new FluentWait<>(driver)
//			.withTimeout(Duration.ofSeconds(10))
//			.pollingEvery(Duration.ofSeconds(10))
//			.ignoring(Exception.class);
//
//	WebElement Dropdown_Link1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dropdown")));
//	
////	=driver.findElement(By.linkText("Dropdown"));
//	Dropdown_Link1.click();
	

//WebDriver wait - Varient
//Wait<WebDriver> wait = new WebDriverWait (driver, 120)
//.pollingEvery(Duration.ofSeconds(10))
//.ignoring(Exception.class);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dropdown")));

//	WebElement Dropdown_Link2=driver.findElement(By.linkText("Dropdown"));
//	Dropdown_Link2.click();	
	
	
	
	driver.close();
	
	driver.quit();
	
}
}
