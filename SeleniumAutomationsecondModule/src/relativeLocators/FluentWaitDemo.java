package relativeLocators;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://theautomationzone.blogspot.com/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[contains(text(),'with small delay')]")).click();

//		
//		//Creating a reference veriable of WebDriverWait class

//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		//Setting wait conditions for the element and capturing the text.Saving the text under a veriable
//		String message=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'with small delay')]"))).getText();
//		
//		
//		System.out.println(message);
//		
//		
//		

		// Object of Fluentwait class

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		
		.ignoring(NoSuchElementException.class);
		
		
		
		String message=wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//p[contains(text(),'with small delay')]"))).getText();
		
		
		System.out.println(message);
		
	}


		
	}


