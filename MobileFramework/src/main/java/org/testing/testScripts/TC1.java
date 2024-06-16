package org.testing.testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TC1 extends Base{
	
	public void TestCase1()
	{
		WebElement preference =driver.findElement(AppiumBy.accessibilityId("Preference"));
		   preference.click();
		   
		   WebElement preferenceDepe =driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"));
		   preferenceDepe.click();
		   
		   WebElement Wifi =driver.findElement(By.id("android:id/checkbox"));
		   Wifi.click();
		   
		   WebElement Wifisetting =driver.findElement(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout"));
		   Wifisetting.click();
		   
		   WebElement TextBox =driver.findElement(By.id("android:id/edit"));
		   TextBox.sendKeys("Rupa Anbarasi");
		   
		   WebElement okbtn =driver.findElement(By.id("android:id/button1"));
		   okbtn.click();
		
	}
	
	
	@Test
	public void execution() throws MalformedURLException
	{
		TC1 tc1=new TC1();
		tc1.Configuration("ApiDemo.apk");
		tc1.TestCase1();
	}

}
