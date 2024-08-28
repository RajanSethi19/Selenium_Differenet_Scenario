package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Scenario {

	public static void main(String[] args) throws InterruptedException {
		// WAP to launch flipkart & hoverover login & click on 'my profile'

		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e1= driver.findElement(By.xpath("//a[@title =\"Login\"]//span"));
		WebElement e2= driver.findElement(By.xpath("//a[@title=\"My Profile\"]"));
		Actions a= new Actions(driver);
		a.moveToElement(e1).moveToElement(e2).click().perform();
	}

}
