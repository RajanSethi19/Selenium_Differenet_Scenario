package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Right_Click_Scenario {

	public static void main(String[] args) throws InterruptedException {
		// WAP to launch google & right-click on gmail & click on incognito mode

		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1 = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		a.contextClick(e1).perform();
		
	
		

	}

}
