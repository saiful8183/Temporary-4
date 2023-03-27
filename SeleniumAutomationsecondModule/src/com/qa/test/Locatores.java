package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatores {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		// Creat a webdriver instance of edgedriver

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

		// Identifying clickme elementwith the attribute id

//		WebElement element = driver.findElement(By.id("button1"));
//
//		element.click();

//		WebElement element1 = driver.findElement(By.className("buttonClass"));
//		element1.click();

//		WebElement element2 = driver.findElement(By.name("button1"));
//		element2.click();
//		

//		
//		WebElement linkText = driver.findElement(By.linkText("Click this link"));
//		linkText.click();
//		

//		WebElement partiallinkText = driver.findElement(By.partialLinkText("Click this "));
//		partiallinkText.click();
//		
		
		int totalLinks=driver.findElements(By.tagName("a")).size();
		System.out.println("This page contains"+totalLinks+ "links.");
		
		
		
	                                    	//CSS\\
		
		
		
		
		//Clicking on "Click this button using id" by using "css selector"
		
		// Tag+id  >>  (Tag#idvalue).                    Here tag is optional
		
		//driver.findElement(By.cssSelector("a#idExample")).click();
		//driver.findElement(By.cssSelector("#idExample")).click();  //without tag
		
		
	//Clicking on "Button" by using "css selector"
		
		//Tag+class  >> (Tag.classvalue).              Here tag is optional
		
		
		
		//driver.findElement(By.cssSelector("button.buttonClass")).click();
		//driver.findElement(By.cssSelector(".buttonClass")).click();   //without tag
		
		
		
		
		
	//Clicking on "Click this button using id" by using "css selector"
		
		// Tag+attribute  >>(Tag[class=classvalue]).              Here tag is optional
		
		
		//driver.findElement(By.cssSelector("button[ class=buttonClass]")).click();
		
		//driver.findElement(By.cssSelector("[ class=buttonClass]")).click();  //without tag
		
		
		
		
		
		
		
		
		
	//Clicking on " button " by using "css selector"
		
		// Tag+class+attribute  >>  (Tag.classvalue[attribute=value]).              Here tag is optional
		
		
		//driver.findElement(By.cssSelector("button.buttonClass[type=submit]")).click();
		
		//driver.findElement(By.cssSelector(".buttonClass[type=submit]")).click();   //without tag
		
		
	}

}
