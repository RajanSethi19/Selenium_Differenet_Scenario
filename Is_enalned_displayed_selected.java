package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enalned_displayed_selected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.xpath("(//input[@id=\"vehicle2\"])[1]"));
		Thread.sleep(2000);
		checkbox.click();

		Thread.sleep(2000);
		if (checkbox.isDisplayed() == true && checkbox.isSelected() == true && checkbox.isEnabled() == true) {
			System.out.println("Element is displayed ,selected and Enabled");
		}

	}

}
