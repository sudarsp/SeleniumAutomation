package com.SeleniumBase.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;



public class WindowsHandlePage {
	WebDriver driver;
	public WindowsHandlePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void f1() throws InterruptedException
	{
		
		System.out.println("Title1:    "+ driver.getTitle());
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		String abc= driver.getWindowHandle();
		System.out.println("Window1:  "+ abc);
		Set<String> s=driver.getWindowHandles();
		System.out.println("All Windows"+ s);
		List<String> ls= new ArrayList<>(s);
		for(String listt:ls)
		{		
			
		
			
			driver.switchTo().window(listt);
			 Thread.sleep(3000);
			String title= driver.findElement(By.xpath("//div[@class='post-head']/h1")).getText();
			Thread.sleep(3000);
			System.out.println( "wndowHn:  "+ listt+ "  "+ title);
			if(title.equals("Basic Controls"))
			{
				System.out.println("Navigated page:: "+ title);
			}
			
		}
		Thread.sleep(3000);
		driver.switchTo().window(abc);
		System.out.println("Navigated page: "+ driver.getTitle());
		
		//System.out.println("Check "  +driver.getTitle());
		driver.close();
	}

}
