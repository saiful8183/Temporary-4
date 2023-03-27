package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Sendkeys
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("search for meat");

		Thread.sleep(2000);

		element.clear();

		// WebElement
		// element2=driver.findElement(By.xpath("//input[@type='password']"));
//		element2.sendKeys("admin123");
//		
//		
//		
//		//WebElement element1=driver.findElement(By.xpath("//button[@type='submit']"));
//		//element1.click();
//		
//		Thread.sleep(4000);
		
		
		
		
		
	//Capturing gmail link and saving it under a variable	
		
		
		WebElement gmaillink=driver.findElement(By.xpath("//a[@aria-label='Gmail(opens a new tab)']"));
		
		String text=gmaillink.getText();
		
		System.out.println(text);
		
		
		
		
		
		
	//	Get attribute of gmaillink
		
	String completlink=gmaillink.getAttribute("href");
	System.out.println("The entire link :"+completlink);	
		
		
		

	}

}
