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
public class TC5 extends Base {

	public void swipeGesture() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		
		for(int i=1;i<=3;i++)
		{
		//xpath of 2nd image
		//android.widget.Gallery[@resource-id="io.appium.android.apis:id/gallery"]/android.widget.ImageView[2]
		
		WebElement firstImage=driver.findElement(By.xpath("//android.widget.ImageView[" + i + "]"));
		swipeAction(firstImage, "left");
		Thread.sleep(2000);
		
		}
	}
	
	public void swipeAction(WebElement element,String direction) throws InterruptedException
	{
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
			    "direction", direction,
			    "percent", 1.0
			));	

		
	}


@Test
public void execution() throws MalformedURLException, InterruptedException
{
	TC5 tc5=new TC5();
	tc5.Configuration("ApiDemo.apk");
	tc5.swipeGesture();
}
}
