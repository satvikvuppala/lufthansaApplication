package stepDefinitions;

import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class searchHotel {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
			lufthansa();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}

	public static void lufthansa() throws Exception {
		

		DesiredCapabilities cap = new DesiredCapabilities();
		
//		Device details		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("udid", "emulator-5554");
//		cap.setCapability("udid", "b0d3f02a");
		
//		b0d3f02a
//		emulator-5554
		
//		Application details
		
		cap.setCapability("app", "C://Users//Admin//Desktop//Automation//APK's//lufthansa.apk");
		cap.setCapability("appPackage", "com.lufthansa.android.lufthansa");
		cap.setCapability("appActivity", "com.lufthansa.android.lufthansa.ui.activity.HomeActivity");
		
		cap.setCapability("appReset", false);
		
//		Appium mobile driver details	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<>(url,cap);
		System.out.println("Application started");
		Thread.sleep(5000);
		
//		Get the available context handles
        Set<String> contextHandles = driver.getContextHandles();
        for (String contextHandle : contextHandles) 
        {
            System.out.println("Context Handle: " + contextHandle);
        }
        
//      Cross-check if the application has been successfully opened
        if (driver != null && driver.getContextHandles().size() > 0) {
            System.out.println("Application opened successfully");
        } else {
            System.out.println("Failed to open the application");
        }
		
//		Application functionality starts here
       
//      Agree and save selection section
        String agreeAll = "Save selection";
        By scrollableElement = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().textContains(\"" + agreeAll + "\").instance(0))");
        driver.findElement(scrollableElement).click();
        
//      Continue as guest
        driver.findElement(By.id("com.lufthansa.android.lufthansa:id/not_now_button")).click();
        System.out.println("Contiued as a guest");
        driver.findElement(By.id("button2")).click();
        Thread.sleep(2000);
        driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
        System.out.println("Location permission granted");
        
        
		
	}
	
}

