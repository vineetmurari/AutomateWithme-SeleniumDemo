package com.Seleniumdemo.Demo1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
		
		//Chrome Prefs
		String fileDownloadPath = "C:\\Users\\Dell\\Desktop\\Tutorials\\Test_Files\\";
		  
		  Map<String, Object> prefsMap = new HashMap<String, Object>();
		  prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", fileDownloadPath);
		  
		  ChromeOptions option = new ChromeOptions();
		  option.setExperimentalOption("prefs", prefsMap);
		  option.addArguments("--test-type");
		  option.addArguments("--disable-extensions");
		  
		  //Instantiation Driver
		  WebDriver driver  = new ChromeDriver(option);

		  //naviagte to URL
		driver.get("http://the-internet.herokuapp.com/");
		
		//Click on the Link - Data Tables.
		WebElement download = driver.findElement(By.linkText("File Download"));
		download.click();
		
		//Download Scenario
		driver.findElement(By.xpath("//a[contains(text(),'cat.jpg')]")).click();
		Thread.sleep(3000);
		
		
		//Check if That is downloaded.
		File DownloadedFile = new File(fileDownloadPath+"cat.jpg");
		
		Thread.sleep(4000);
		
		boolean flag =DownloadedFile.exists();
		if(flag){
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
		
		
		//Close browser
		driver.close();
						
		//Quit Session
		driver.quit();
		
	}
}
