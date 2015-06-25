package com.util.tool;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	private WebDriver driver;
	private int timeout = 10;
	public Wait(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementPresent(String locator){
		try{
			(new WebDriverWait(driver,timeout)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void waitForElementable(String locator){
		(new WebDriverWait(driver,timeout)).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
	
	public void waitFor(long timeout){
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String str ="(12)";
		List list = new ArrayList();
		char c = 0;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(c=='('){
				
			}else if(c==')'){
				
			}else{
				list.add(c);
			}
		}
		
		String s = "";
		for (int j = 0; j < list.size(); j++) {
			s += list.get(j).toString();
		}
	}
}
