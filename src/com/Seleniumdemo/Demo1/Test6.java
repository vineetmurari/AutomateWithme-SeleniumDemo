package com.Seleniumdemo.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * WEBTABLES, Frames
 * 
 */
public class Test6 {
 public static void main(String[] args) throws InterruptedException {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
		//Instansiation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
		
		//naviagte to URL
		driver.get("http://the-internet.herokuapp.com/");
		
		//Click on the Link - Data Tables.
		WebElement Data_Table_Link = driver.findElement(By.linkText("Sortable Data Tables"));
		Data_Table_Link.click();
		
		Thread.sleep(3000);
		
		
		//Record in Data Table
		List<WebElement> Record_elements =driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td"));
		for(WebElement e: Record_elements){
			System.out.println(e.getText());
		}
		System.out.println("=====================Record in Data Table=========================");
		//ALL Records
		List<WebElement> ALL_Records = driver.findElements(By.xpath("//table[@id='table1']//tr//td"));
		for(WebElement e: ALL_Records){
			System.out.println(e.getText());
		}
		System.out.println("=================ALL Records================================");
		//Column in Data Table
		List<WebElement> Col_Ele = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));
		for(WebElement e:Col_Ele ){
			System.out.println(e.getText());
		}
		System.out.println("=======================Column in Data Table=======================");
		//One cell Value
		WebElement one_cell= driver.findElement(By.xpath("//table[@id='table1']//tr[1]//td[1]"));
		System.out.println(one_cell.getText());
		System.out.println("============================One cell Value=========================");
		//BACK
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Close browser
		driver.close();
						
		//Quit Session
		driver.quit();
}
}
