package org.testing.testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


	
	
	public class TC8 extends Base {
		
		
		public void TestCase8() throws InterruptedException
		{
		
			Thread.sleep(5000);
			driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
			
			driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();		
			//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rupa");
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String ToastMessage=driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please enter your name\"]")).getText();
		System.out.println(ToastMessage);
		
		Assert.assertEquals(ToastMessage,"Please enter your name");
		
		
		}
		

		@Test
		public void execution() throws MalformedURLException, InterruptedException
		{
			TC8 tc8=new TC8();
			tc8.Configuration("General-Store.apk");
			tc8.TestCase8();
		}

}
