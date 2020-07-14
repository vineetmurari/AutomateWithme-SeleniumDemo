package com.Seleniumdemo.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropToEle {
public static void main(String[] args) {
	//Driver exe config
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
				
			//Instansiation the WebDriver Instance
			WebDriver driver = new ChromeDriver();
				
			//naviagte to URL
			driver.get("http://the-internet.herokuapp.com/");
			
			WebElement Link = driver.findElement(By.linkText("Drag and Drop"));
			Link.click();
			
				
			Actions action = new Actions(driver);
			
			WebElement Source = driver.findElement(By.xpath("//div[@id='column-a']"));
			WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
			 Point point = dest.getLocation();
			 int x = point.getX();
			 int y =point.getY();
			action.dragAndDropBy(Source, x,y).build().perform();
}
}
