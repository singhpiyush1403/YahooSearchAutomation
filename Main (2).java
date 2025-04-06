

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class YahooTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("Http://Yahoo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("selenium");	
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
	

	}

}
