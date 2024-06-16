package org.testing.testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testing.Base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TC9 extends Base {
	
	
	public void TestCase9() throws InterruptedException
	{
	
		Thread.sleep(5000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rupa");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//scroll into Jordan 6 Rings
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
        
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		
		String FirstItemPrice=driver.findElement
				(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\""
						+ " and @text=\"$165.0\"]")).getText().replace("$","");
		
		//click on Cart items
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_back")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")).click();
		
		String SecondItemPrice=driver.findElement
				(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\" and @text=\"$115.0\"]")).getText().replace("$","");
		
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
	String TotalAmt= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl"))	.getText().replace("$", "")	;
	
	Double S1=Double.parseDouble(FirstItemPrice);
	Double S2=Double.parseDouble(SecondItemPrice);
	Double S3=S1+S2;
	System.out.println(S3);
	Double S4=Double.parseDouble(TotalAmt);
	System.out.println(S4);
	if(S3.equals(S4))
	{
		System.out.println("Prices in the cart is matching");
	}
	else
	{
		System.out.println("Prices in the cart is not matching");
	}
	
	}
	

	@Test
	public void execution() throws MalformedURLException, InterruptedException
	{
		TC9 tc9=new TC9();
		tc9.Configuration("General-Store.apk");
		tc9.TestCase9();
	}

}

