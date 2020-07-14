package com.Seleniumdemo.Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
public static void main(String[] args) throws InterruptedException {
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
	
	//Instansiation the WebDriver Instance
	WebDriver driver = new ChromeDriver();
	
	//naviagte to URL
	driver.get("http://the-internet.herokuapp.com/");
	
	//Click on the Link - Multiple Windows
	WebElement NewWindow = driver.findElement(By.linkText("Multiple Windows"));
	NewWindow.click();
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	WebElement Click_Here= driver.findElement(By.xpath("//div[@id='content']//div//a"));
	Click_Here.click();
	
	String main_window = driver.getWindowHandle();
	System.out.println(main_window);
	Set<String> set = driver.getWindowHandles();
	ArrayList<String> Window_List = new ArrayList<String>();
	Window_List.addAll(set);
	//Switch to new Window
	for(String e:Window_List){
		if(!(main_window.equals(e))){
			driver.switchTo().window(e);  
			break;
		}
	}
	
	
	/***
	 * 
	 * MW -> getWH(); --> current Window Session ID - 1234
	 * SET-> getWHs(); ---> {1234, 1235}
	 * SET -> LIST
	 * LIST ------------------->{1234, 1235}
	 * loop i -----------------> 1-> if NOT  MW == i DO NOTHING , IF DOEST NOT MATCH THEN SWITCH TO NEW WINDOW - 1235
	 * 
	 */
	
	
	
	System.out.println(driver.getTitle());
	WebElement New_win_text=driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
	if(New_win_text.isDisplayed()){
		System.out.println("PASS: The Text displayed");
	}
	
	driver.close();
	
	Thread.sleep(3000);
	//Switch back to main Window
	driver.switchTo().window(main_window);
	
	driver.close();
	
	driver.quit();
	
	
}
}
