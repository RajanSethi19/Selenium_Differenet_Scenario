package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_ {

	public static void main(String[] args) throws InterruptedException {

		// WAP to check whether radio button is selected or not
		// https://grotechminds.com/registration/

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement male = driver.findElement(By.xpath("//input[@value=\"male\"]"));
		Thread.sleep(3000);
		WebElement female = driver.findElement(By.xpath("//input[@value=\"Female\"]"));
		Thread.sleep(3000);
		male.click();
		//female.click();
		boolean b=male.isSelected();
		System.out.println(b);
		boolean b1=female.isSelected();
		System.out.println(b1);

	}

}
