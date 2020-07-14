package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
public static void main(String[] args) throws InterruptedException {
	
	//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
			
		//Instansiation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
			
		//naviagte to URL
		driver.get("http://the-internet.herokuapp.com/");
		
		WebElement Link = driver.findElement(By.linkText("Hovers"));
		Link.click();
	
	WebElement object1 = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));	
	Actions action = new Actions(driver);
	action.moveToElement(object1).perform();
	
	Thread.sleep(3000);
	WebElement object2 = driver.findElement(By.xpath("//div[@class='row']//div[2]//img[1]"));	
	action.moveToElement(object2).perform();
	
	Thread.sleep(3000);
	
	driver.close();
	driver.quit();
}
}
