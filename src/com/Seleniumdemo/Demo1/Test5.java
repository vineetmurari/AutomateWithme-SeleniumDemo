package com.Seleniumdemo.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	 public static void main(String[] args) throws InterruptedException {
		//Driver exe config
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
			
			//Instanciation the WebDriver Instance
			WebDriver driver = new ChromeDriver();
			
			//naviagte to URL
			driver.get("https://www.w3.org/WAI/UA/TS/html401/cp0101/0101-RADIO.html");
			
			//Maxzimize 
			driver.manage().window().maximize();
			
			//Radio Buttons
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='test']//form//input"));
			
			boolean Res=ele.get(0).isSelected();
			boolean Res1=ele.get(1).isSelected();
			
//			String RESULT = ele.get(0).getAttribute("checked");
			
//			if(RESULT.equalsIgnoreCase("TRue")){
//				System.out.println("PASS");
//			}
			
			
			if(!Res1){
				ele.get(1).click();
			}
			Thread.sleep(3000);
			
			//Close browser
			driver.close();
							
			//Quit Session
			driver.quit();
	}
}
