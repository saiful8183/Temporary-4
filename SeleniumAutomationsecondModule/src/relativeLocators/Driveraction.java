package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driveraction {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Sendkeys
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("Admin");
		
	
		
		
		WebElement element2=driver.findElement(By.xpath("//input[@type='password']"));
		element2.sendKeys("admin123");
		
		
		
		//WebElement element1=driver.findElement(By.xpath("//button[@type='submit']"));
		//element1.click();
		
		Thread.sleep(4000);
		
		
		
		
	}

}
