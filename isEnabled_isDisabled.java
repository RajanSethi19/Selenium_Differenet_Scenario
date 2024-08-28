package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class isEnabled_isDisabled {

	public static void main(String[] args) throws InterruptedException {
		// WAP to launch google, then click on gmail only when it is enabled & displayed

		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement gmail_button = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		
		  if (gmail_button.isDisplayed() && gmail_button.isEnabled()) {
		  gmail_button.click();
		  
		  }
		 

		
		
		  
		 

	}

}
