package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBoxTest {

	public static void main(String[] args) throws InterruptedException {
	
		
		

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Sendkeys
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		
		//is displayed velidation
		
		
		boolean status=searchBox.isDisplayed();
		
		System.out.println("The status is:"+status);    //expected true
		
		
		//enabled validation
		
		 status=searchBox.isEnabled();
			System.out.println("The status is:"+status); // expected true
		
		
		
	//passing desired input
		
		
			searchBox.sendKeys("10 most beautiful places on earth");
			
			
			//Capturing the input
			String input=searchBox.getAttribute("value");
			System.out.println(input);
			Thread.sleep(2000);
			
			
			//clear
			searchBox.clear();
			Thread.sleep(2000);
			driver.close();
	}

}
