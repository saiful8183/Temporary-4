package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingLings {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://gcreddy.com/project/admin/login.php");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Sendkeys
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement link = driver.findElement(By.xpath("//a[text()='Online Catalog']"));

		
		//is displayed
		boolean status = link.isDisplayed();

		System.out.println(status);

		
		//is enabled
		status = link.isEnabled();

		System.out.println(status);

		
		
		//Capturing the name of the link
		String linkText = link.getText();

		System.out.println(linkText);
		
		
		
		
		//Clickable
		
		link.click();
		
		String landingurl=driver.getCurrentUrl();
		String expectedurl="http://gcreddy.com/project/";
		if(landingurl.equalsIgnoreCase(expectedurl)) {
			
			
			System.out.println("Linked worked");
		}else {
			
			
			System.out.println("Test fail");
		}
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
