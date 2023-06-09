package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntro {
	public static void main(String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//driver object has the access to all the methods of chromeDriver 
		//ChromeDriver cdriver= new ChromeDriver();
				
		//driver object has the access to all the methods of chromeDriver which are defined in the webdriver interface
		//WebDriver driver= new ChromeDriver();
		
		//Launching The MicrosoftEdge Browser
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("Title is:"+title);
		
		//Validating that we are hitting the same url as desired or it hacked
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000000);
		
	}

}