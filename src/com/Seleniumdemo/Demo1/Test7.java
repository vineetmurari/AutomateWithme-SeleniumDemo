package com.Seleniumdemo.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
	 public static void main(String[] args) throws InterruptedException {
		//Driver exe config
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
			
			//Instansiation the WebDriver Instance
			WebDriver driver = new ChromeDriver();
			
			//naviagte to URL
			driver.get("http://the-internet.herokuapp.com/");
			
			//Click on the Link - Iframes
			WebElement Iframe_link = driver.findElement(By.linkText("WYSIWYG Editor"));
			Iframe_link.click();
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			
			/**
			 * 
			 * Switch to Iframe by ID, Name, Index
			 */
			
			
		List<WebElement> ListofFrames=driver.findElements(By.tagName("iframe"));
		int numberOfFrames = ListofFrames.size(); 
		
		System.out.println("Size of Frames "+numberOfFrames);
		//Switch to frame
		driver.switchTo().frame(0);
		WebElement content =driver.findElement(By.xpath("//body[@id='tinymce']//p"));
		content.clear();
		content.sendKeys("I'm Writing this Content inside the Frame.....");;
		Thread.sleep(3000);
		
		//Switch back to normal Content
		driver.switchTo().defaultContent();
		WebElement bold =driver.findElement(By.xpath("//*[@title='Formats']"));
		bold.click();
		Thread.sleep(3000);
		//Close browser
		driver.close();
								
		//Quit Session
		driver.quit();
	}
}
