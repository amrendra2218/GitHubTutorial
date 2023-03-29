package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amren\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(40000);
		driver.get("https://www.myntra.com/");
		
		int n=driver.findElements(By.className("desktop-navLink")).size();
		System.out.println(n);
		
		

	}

}
