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

public class TC3 extends Base {
	
	
	public void TestCase3() throws InterruptedException
	{
	
	  WebElement View =driver.findElement(AppiumBy.accessibilityId("Views"));
	   View.click();
	   WebElement ExpandableList =driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));
	   ExpandableList.click();
	   WebElement CustomerAdapter =driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
	   CustomerAdapter.click();
	   
	 ////android.widget.TextView[@text="People Names"]
	   
	   WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
	   
	     ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
	    		    "elementId", ((RemoteWebElement) element).getId(),"duration",2000
	    		)); 
		Thread.sleep(2000);
		

}
	

	@Test
	public void execution() throws MalformedURLException, InterruptedException
	{
		TC3 tc3=new TC3();
		tc3.Configuration("ApiDemo.apk");
		tc3.TestCase3();
	}
}
