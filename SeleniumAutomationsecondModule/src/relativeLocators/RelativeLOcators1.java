package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLOcators1 {

	public static void main(String[] args) {

		// System.setProperty("webdriver.edge.driver","C:\\Users\\Saiful
		// Chowdhury\\Desktop\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		//Implicitlywaits for a webelement to be available for a given number of time.It means Maximum wait.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		
		//Identify a webelement which will help us to findout our desired element
		WebElement xyz = driver.findElement(By.xpath("//label[text()='Password']"));

		driver.findElement(RelativeLocator.with(By.tagName("input")).above(xyz)).sendKeys("Admin");

		//Identifying password field in relation to password(label)label
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(xyz)).sendKeys("Admin123");
	}

}
