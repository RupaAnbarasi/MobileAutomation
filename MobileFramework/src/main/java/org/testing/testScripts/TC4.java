package org.testing.testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class TC4 extends Base {
	
	
	public void TestCase4() throws InterruptedException
	{
	
		
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
		    Thread.sleep(2000);
		    System.out.println("Scrooling is completed till WebViewb Text");
		
		
		
		/*
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			
			boolean ScrollMore;
			do
			{
			 ScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 1.75
				));
			}while(ScrollMore);
			
			System.out.println("Scrolling Down");*/
	}
	

	@Test
	public void execution() throws MalformedURLException, InterruptedException
	{
		TC4 tc4=new TC4();
		tc4.Configuration("ApiDemo.apk");
		tc4.TestCase4();
	}
}
