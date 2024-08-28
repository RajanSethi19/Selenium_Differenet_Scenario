package Different_Scenarios;

import org.openqa.selenium.chrome.ChromeDriver;

public class Back_forward_Refresh {

	public static void main(String[] args) throws InterruptedException {
		
		//WAP to navigate Backward, forward and Refresh
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		

	}

}
