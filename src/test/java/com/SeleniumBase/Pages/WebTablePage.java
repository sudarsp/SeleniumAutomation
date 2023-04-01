package com.SeleniumBase.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
	
	WebDriver driver;
	public WebTablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath = "//table[@id='contactList']")
	//WebElement tableid;
	public boolean table()
	{
		WebElement tableid=driver.findElement(By.xpath("//table[@id='contactList']"));
		
		List<WebElement> tr= tableid.findElements(By.xpath("//table[@id='contactList']//tr"));
		List<WebElement> tr1= tableid.findElements(By.xpath("//table[@id='contactList']//tr"));
		System.out.println("trrrr"  +   tr.size());
		System.out.println("trrrr"  +   tr.size());
		for (int i=2;i<=tr.size();i++) {
			driver.findElement(By.xpath("//table[@id='contactList']//tr["+i+"]/td/input")).click();
			//
		}
		boolean ab= false;
		for (int i=2;i<=tr.size();i++) {
			driver.findElement(By.xpath("//table[@id='contactList']//tr["+i+"]/td")).isSelected();
			 ab= true;
		
		}
		return ab;
	}
	
	public boolean tableNameReading1()
	{
		WebElement tableid=driver.findElement(By.xpath("//table[@id='contactList']"));
		
		List<WebElement> tr= tableid.findElements(By.xpath("//table[@id='contactList']//tr"));
		System.out.println("trrrr"  +   tr.size());
		for (int i=2;i<=tr.size();i++) {
			driver.findElement(By.xpath("//table[@id='contactList']//tr["+i+"]/td/input")).click();
			//
		}
		boolean ab= false;
		for (int i=2;i<=tr.size();i++) {
			driver.findElement(By.xpath("//table[@id='contactList']//tr["+i+"]/td")).isSelected();
			 ab= true;
		
		}
		return ab;
	}
	
	public boolean tableNameReading()
	{
		WebElement tableid=driver.findElement(By.xpath("//table[@id='contactList']"));
		
		List<WebElement> tr= tableid.findElements(By.xpath("//table[@id='contactList']//tr"));
		System.out.println("trrrr"  +   tr.size());
		for (int i=2;i<=tr.size();i++) {
			driver.findElement(By.xpath("//table[@id='contactList']//tr["+i+"]/td/input")).click();
			//
		}
		boolean ab= false;
		for (int i=2;i<=tr.size();i++) {
			driver.findElement(By.xpath("//table[@id='contactList']//tr["+i+"]/td")).isSelected();
			 ab= true;
		
		}
		return ab;
	}

}
