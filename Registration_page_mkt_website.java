package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_page_mkt_website {

	public static void main(String[] args) throws InterruptedException {

		// WAP on registration page and refresh

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Rajan");
		// or we can use relative xpath for fname =(((//form)[3]/div)[1]//input)[1]

		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Sethi");

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rajansethi19@gmail.com");

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Automation123");

		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();

		driver.findElement(By.xpath("//textarea[@id=\"Present-Address\"]")).sendKeys("Chandigarh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"Pincode\"]")).sendKeys("160001");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"relocate\"]")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//File uplaod example
		//WebElement choosefile = driver.findElement(By.id("file"));
		//choosefile.sendKeys("C:\\Users\\hp\\Downloads\\learningHTML1.html");

		// driver.close();
		//(location)filename.extension"
	}

}
