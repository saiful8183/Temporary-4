package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Explicitwait {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful Chowdhury\\Desktop\\Drivers\\chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");

	}

}
