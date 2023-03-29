package com.Amutest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amren\\Downloads\\Compressed\\chromedriver.exe")
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
