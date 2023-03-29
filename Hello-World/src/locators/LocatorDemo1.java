package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amren\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(900000000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000000000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("desktop-headerMount")).click();
		Thread.sleep(4000);

	}

}
