package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Click {
public static void main(String[] args) throws InterruptedException {
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
	//Instansiation the WebDriver Instance
	WebDriver driver = new ChromeDriver();
		
	//naviagte to URL
	driver.get("http://the-internet.herokuapp.com/");
	
	WebElement Link = driver.findElement(By.linkText("Hovers"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", Link);
	
	driver.navigate().back();
	
	//executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//executor.executeScript("window.scrollBy(0,-350)", "");
	executor.executeScript("window.scrollBy(0,350)", "");
	
    Thread.sleep(3000);
    
    
    //Open New Window using JS executor
    String link = "window.open('https://www.google.com','_blank');";

    executor.executeScript(link);
	
    Thread.sleep(3000);
    
	driver.close();
	driver.quit();
	
}
}
