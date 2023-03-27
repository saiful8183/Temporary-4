package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebDriverManager {

	public static void main(String[] args) {

		
		
		
		
		//
//		// Import webDriverManager


		
		//		WebDriverManager.edgedriver().setup();
//
//		// Creat a webdriver instance of edgedriver
//		WebDriver driver = new EdgeDriver();

	
		
		
		//Firefox
		
		WebDriverManager.firefoxdriver().setup();

		// Creat a webdriver instance of edgedriver
		WebDriver driver = new FirefoxDriver();
		
		
		
		
		
		// Using Chrome

		// Settingup chrome
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		//If webDriverManager not working then use.....

		//ChromeOptions co = new ChromeOptions();

		// co.addArguments("--remote-allow-origins=*");
	

		// Creat a webdriver instance of Chrome
		//WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.google.com/");

	}

}
