package com.Seleniumdemo.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	
	/*
	 * 
	 * Dropdown, Checkboxes, Radio Button, WebTables, Frames, 
	 * Working with Multiple Tab and Windows
	 * Actions Class- KeyBoard, Mouse Action
	 * hover, Drag Drop..
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Driver exe config
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
		
		//Instanciation the WebDriver Instance
		WebDriver driver = new ChromeDriver();
		
		//naviagte to URL
		driver.get("http://the-internet.herokuapp.com/");
		
		//Maxzimize 
		driver.manage().window().maximize();
		
		//Dropdown Link
		WebElement Dropdown_Link=driver.findElement(By.linkText("Dropdown"));
		Dropdown_Link.click();
		
		//Get Dropdown values
		WebElement drop_down =driver.findElement(By.id("dropdown"));
		Select DropdownValues = new Select(drop_down);
		List<WebElement> options = DropdownValues.getOptions();
		for(WebElement e: options){
			System.out.println(e.getText());
		}
		System.out.println("Get Current Selected Option : ");
		List<WebElement> SelecedOptions =DropdownValues.getAllSelectedOptions();
		for(WebElement e: SelecedOptions){
			System.out.println(e.getText());
		}
		System.out.println("Now Select Other Options...");
		DropdownValues.selectByIndex(2);
		Thread.sleep(3000);
		DropdownValues.selectByVisibleText("Option 2");
		Thread.sleep(3000);
		DropdownValues.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		
		
		///////////Check boxes///////////////
		
	//	driver.navigate().back();
		
		//CheckBox Link
		WebElement CheckBox_Link=driver.findElement(By.linkText("Checkboxes"));
		CheckBox_Link.click();
				
		List<WebElement> checkBoxes_List = driver.findElements(By.xpath("//form[@id='checkboxes']//input"));
		boolean res=checkBoxes_List.get(0).isSelected();
		boolean res1=checkBoxes_List.get(1).isSelected();
		
		if(!res){
			checkBoxes_List.get(0).click();
		}
		if(!res1){
			checkBoxes_List.get(1).click();
		}
		else{
			System.out.println("Already checked SO not gonna do taht Again!!!");
		}
		Thread.sleep(3000);

		//Close browser
		driver.close();
						
		//Quit Session
		driver.quit();
	}
}
