package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

		 //System.setProperty("webdriver.chrome.driver",
		 //"C:\\Users\\Saiful Chowdhury\\Desktop\\Drivers\\chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();

		 co.addArguments("--remote-allow-origins=*");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 

		
		
		
		
		
		
		
		
		
		
		
		                                          // or \\

		
		
		
		
		
		// For firefox no need to set set properti

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Saiful Chowdhury\\Desktop\\Drivers\\msedgedriver.exe");
//
//		WebDriver driver = new EdgeDriver();
//
//		driver.get("https://www.google.com");
//
//		
		
		
		// or\\

		
		
		
		// System.setProperty("webdriver.gecko, driver", "C:\\Users\\Saiful
		// Chowdhury\\Desktop\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");

		// // Browser navigation commend
//		driver.get("https://www.google.com");
//		Thread.sleep(2000);
//
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.get("https://www.target.com/");
//
//		
//		//Method chaining.
//		driver.navigate().back();
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//
//		Thread.sleep(2000);
//
//		// refresh
//		driver.navigate().refresh();
//		driver.close();
	}

}
