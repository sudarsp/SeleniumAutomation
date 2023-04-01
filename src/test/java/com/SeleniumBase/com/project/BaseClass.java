package com.SeleniumBase.com.project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//public static WebDriver driver;
	

	public  WebDriver login(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D://Chromedrivers//chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		 ChromeOptions option= new ChromeOptions();
		 option.addArguments("--remote-allow-origins=*");
		 DesiredCapabilities cp= new DesiredCapabilities();
		 option.merge(cp);
		 WebDriver driver = new ChromeDriver(option);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			String title= driver.getTitle();
			System.out.println("Title is: "+ title);
			//driver.close();
		return driver;
	}
	
}
