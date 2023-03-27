package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorMessage {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Sendkeys
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement link = driver.findElement(By.xpath("//input[@name='username']"));

		link.sendKeys("Admin");

		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));

		button.click();

		
		//Capturing the element which has the error message
		WebElement error = driver.findElement(By.xpath("//span[text()='Required']"));

		
		
		//Capturing actual error message
		String actualerror = error.getText();
		
		
		
		//Expected error message
		String expectederror = "Required";

		
		
		
		
		//Comparing actual vs expected
		if (actualerror.equalsIgnoreCase(expectederror)) {

			System.out.println("Test pass.Happy");
		} else {

			System.out.println("sorry,Test fail");

		}
		driver.close();

	}

}
