package com.Seleniumdemo.Demo1;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Test11 {
public static void main(String[] args) throws InterruptedException, IOException {
	//Driver exe config
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tutorials\\Drivers\\chromedriver.exe");
	
	//Instansiation the WebDriver Instance
	WebDriver driver = new ChromeDriver();
	
	//naviagte to URL
	driver.get("http://the-internet.herokuapp.com/");
	
	//Click on the Link 
	WebElement Upload = driver.findElement(By.linkText("File Upload"));
	Upload.click();
	
	
	//Maxzimize 
	driver.manage().window().maximize();
	
	
	//Upload functionality
	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Dell\\Desktop\\Tutorials\\Test_Files\\Test1.txt");
	
	Thread.sleep(3000);
	
	//capture Image  Also look into Files and Date Time API in Java...
	capture(driver, "src//Captured_images//Capture_"+LocalTime.now().toString().replace(":", "").replace(".", "").trim()+".png");
	
	//Click on Submit
	driver.findElement(By.id("file-submit")).click();
	
	//Verify message
	try{
		if(driver.findElement(By.xpath("//div[@class='example']//h3")).isDisplayed()){
			System.out.println("PASS: The Element is Displayed");
			//capture Image  Also look into Files and Date Time API in Java...
			capture(driver, "src//Captured_images//Capture_"+LocalTime.now().toString().replace(":", "").replace(".", "").trim()+".png");
			if(driver.findElement(By.xpath("//div[@class='example']//h3")).getText().equalsIgnoreCase("File Uploaded!")){
				System.out.println("PASS: THE File upload sucess");
			}
			else{
				System.out.println("Fail: File Upload Fail");
			}
		}
	}
	catch(Exception e){
		capture(driver, "src//Captured_images//Capture_"+LocalTime.now().toString().replace(":", "").replace(".", "").trim()+".png");
		System.out.println(e.getMessage());
	}
	//Close browser
	driver.close();
					
	//Quit Session
	driver.quit();
}


public  static void capture(WebDriver driver_Instance, String path_where_your_file_must_save) throws IOException{
	
	TakesScreenshot picture = ((TakesScreenshot)driver_Instance);
	
	 File Source=picture.getScreenshotAs(OutputType.FILE);
	 
	 File Dest=new File(path_where_your_file_must_save);
	 
	 Files.copy(Source, Dest);
}

}
