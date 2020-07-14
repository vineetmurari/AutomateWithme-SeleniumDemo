package com.Seleniumdemo.Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

public class Test13 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		   String dest="C:\\Users\\Dell\\Desktop\\Tutorials\\Test_Files\\Postman.exe";
	        String Souce="C:\\Users\\Dell\\Downloads\\Postman.exe";
	        
	        
		File file = new File(Souce);
		
		if(file.exists()){
			file.delete();
		}
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//*[text()='Postman.exe']")).click();
		 Robot robot=new Robot();
	        robot.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_S);
	        robot.keyRelease(KeyEvent.VK_ALT);
	        robot.keyRelease(KeyEvent.VK_S); 
	        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_Q);
	        robot.keyRelease(KeyEvent.VK_ALT);
	        robot.keyRelease(KeyEvent.VK_Q); 
	        
	        File file1 = new File(dest);
	        
	        Files.copy(file, file1);
	        
	        if(file.exists()){
	        	file.delete();
	        }
	    try{    
		driver.close();
		driver.quit();
	    }
	    catch(Exception e){
	    	System.out.println(e.getMessage());
	    	
	    	  try {
	    		  Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
	    		  } catch (IOException e1) {
	    		  e1.printStackTrace();
	    		  }
	    	
	    }
	}
	}