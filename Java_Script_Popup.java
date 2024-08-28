package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Popup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://grotechminds.com/javascript-pop");
		Thread.sleep(2000);
		WebElement popup=driver.findElement(By.xpath("//button[.=\"Click \"]"));
		Thread.sleep(2000);
		popup.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		popup.click();
		
	}

}
