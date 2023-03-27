package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlarts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Sendkeys
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Clicking on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(1000);

		// Changing the focus of the driver to alart and saving alart under a veriable
		Alert popup = driver.switchTo().alert();

		
		//Capturing the text present in the alart
		String alertmessage = popup.getText();

		String expectedMessahe = "Please enter a valid user name";

		if (alertmessage.equalsIgnoreCase(expectedMessahe)) {

			System.out.println("pass.Alart message is validate");
		} else {
			System.out.println("Alart did not match");
		}

		// System.out.println(alertmessage);

		Thread.sleep(1000);

		popup.accept();

		Thread.sleep(1000);

		driver.close();
	}

}
