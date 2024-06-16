package org.testing.testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;




public class TC2 extends Base{
	
	public void TestCase2()
	{
		WebElement preference =driver.findElement(AppiumBy.accessibilityId("Preference"));
		   preference.click();
		   
		   WebElement preferenceDepe =driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"));
		   preferenceDepe.click();
		   
		   WebElement Wifi =driver.findElement(By.id("android:id/checkbox"));
		   Wifi.click();
		   
		   WebElement Wifisetting =driver.findElement(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout"));
		   Wifisetting.click();
		   
		   //Divice Rotation
		   DeviceRotation landscape=new DeviceRotation(0,0,90);
		   driver.rotate(landscape);
		   
		   WebElement TextBox =driver.findElement(By.id("android:id/edit"));
		   TextBox.sendKeys("Rupa Anbarasi");
		   
		   WebElement okbtn =driver.findElement(By.id("android:id/button1"));
		   okbtn.click();
		
	}
	
	
	@Test
	public void execution() throws MalformedURLException
	{
		TC2 tc2=new TC2();
		tc2.Configuration("ApiDemo.apk");
		tc2.TestCase2();
	}
}