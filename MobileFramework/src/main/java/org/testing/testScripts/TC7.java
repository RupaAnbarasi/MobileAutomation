package org.testing.testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TC7 extends Base {
	
	
	public void TestCase7() throws InterruptedException
	{
	
		
		Thread.sleep(5000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rupa");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	}
	

	@Test
	public void execution() throws MalformedURLException, InterruptedException
	{
		TC7 tc7=new TC7();
		tc7.Configuration("General-Store.apk");
		tc7.TestCase7();
	}
}
