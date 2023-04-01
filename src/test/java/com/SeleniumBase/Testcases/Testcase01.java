package com.SeleniumBase.Testcases;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SeleniumBase.Pages.WebTablePage;
import com.SeleniumBase.Pages.WindowsHandlePage;
import com.SeleniumBase.Utils.ExcelReadWrite;
import com.SeleniumBase.com.project.BaseClass;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase01 extends BaseClass{
//static ExtentReports report= new ExtentReports();
//static ExtentTest test=report.createTest("Extent");

	
	public  void TC1() throws InterruptedException
	{
		BaseClass bc= new BaseClass();
		WebDriver abc= bc.login("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WindowsHandlePage whp= new WindowsHandlePage(abc);
		whp.f1();
		//test.log(LogStatus.Pass, "Navigated to the specified URL");
		//(Log.PASS, "Navigated to the specified URL");
		//Extenthtml
		
		//System.setProperty("webdriver.chrome.driver", "D://Chromedrivers//chromedriver.exe");
		
		System.out.println("Logged in Successfully");
	}
	
	
	public  void TC2()
	{
		BaseClass bc= new BaseClass();
		WebDriver abc= bc.login("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebTablePage wtp= new WebTablePage(abc);
		boolean ab= wtp.table();
		Assert.assertEquals(ab, true);

		
		System.out.println("Logged in Successfully");
	}
	
	@Test
	public  void TC3() throws IOException
	{
		ExcelReadWrite er= new ExcelReadWrite();
		String av=er.read("df","Stringgggg");
		System.out.println("av "+  av);
	}
	
	
	
	
/*	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
*/
}
