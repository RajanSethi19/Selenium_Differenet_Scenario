package Different_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Scenario {

	public static void main(String[] args) throws InterruptedException {
		
		// WAP to launch amazon & hoverover account&list then click on signin
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10074976510291773204&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050531&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select sc= new Select(e1);
		Thread.sleep(3000);
		sc.selectByVisibleText("Books");
		Thread.sleep(3000);
		WebElement Books=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		Thread.sleep(3000);
		Books.sendKeys("Science");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();

	}

}
