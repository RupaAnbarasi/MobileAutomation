package org.testing.Base;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class Base {
	
	

	public static AndroidDriver driver;
	
	public  void Configuration(String apkname) throws MalformedURLException
	{
		
		
		File app =new File("C:\\Users\\user\\Desktop\\selenium notes",apkname);
		 
		 //Starting the Appium Server
		  
		 File js = new File("C:\\Users\\user\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
          
		  AppiumDriverLocalService service =
		  new AppiumServiceBuilder()
		  .withAppiumJS(js)
		  .withIPAddress("0.0.0.0")
		  .withArgument(GeneralServerFlag.BASEPATH, "wd/hub")
		  .usingPort(4723)
		  .build();
		  
		  service.start();
		  
		  
		  
		 //Device configuration
		  
		 DesiredCapabilities cap = new DesiredCapabilities();
			 
		  cap.setCapability("app", app.getAbsolutePath());
		  cap.setCapability("deviceName", "68b486a462a9");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("automationName","UiAutomator2"); 
		  
		  // Appium Server details
		  
		   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}
	
	


}

