package stepDefinitions;

import java.net.URL;
import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class searchRentalCar {
	
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
        
//      Navigating to Rental cars
        driver.findElementByAccessibilityId("Navigate up").click();
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.TextView").click();
        String planTrip = "Plan Trip";
        By scrollableElement1 = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().textContains(\"" + planTrip + "\").instance(0))");
        driver.findElement(scrollableElement1).click();
        String targetText = "Rental Car";
        By scrollableElement2 = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().textContains(\"" + targetText + "\").instance(0))");
        driver.findElement(scrollableElement2).click();
        
        System.out.println("Rental Car Clicked");
        Thread.sleep(50000);
        System.out.println("Browser Opened");   
        
//      Search for Rental cars
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button").click();
//        driver.findElementById("dropdown-pickupLocation-input").sendKeys("Amsterdam");
//        driver.findElementById("dropdown-pickupLocation-item-0").click();
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]").click();
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.app.Dialog/android.view.View/android.widget.GridView[2]/android.view.View[2]/android.view.View[6]").click();
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.app.Dialog/android.view.View/android.widget.GridView[2]/android.view.View[5]/android.view.View[6]").click();
//        driver.findElementById("search-0").click();
//        Thread.sleep(5000);
        
        
        
	}
	
}


/*

MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
el1.click();
MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.TextView");
el2.click();
(new TouchAction(driver))
  .press({x: 224, y: 1966})
  .moveTo({x: 280: y: 1055})
  .release()
  .perform()
  
MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout[2]/android.widget.LinearLayout[5]/android.widget.TextView");
el3.click();
("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.TextView





MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
el1.click();
MobileElement el2 = (MobileElement) driver.findElementById("dropdown-pickupLocation-input");
el2.sendKeys("Amsterdam");
MobileElement el3 = (MobileElement) driver.findElementById("dropdown-pickupLocation-item-0");
el3.click();
MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]");
el4.click();
MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.app.Dialog/android.view.View/android.widget.GridView[2]/android.view.View[2]/android.view.View[6]");
el5.click();
MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[8]/android.view.View/android.app.Dialog/android.view.View/android.widget.GridView[2]/android.view.View[5]/android.view.View[6]");
el6.click();
MobileElement el7 = (MobileElement) driver.findElementById("search-0");
el7.click();




*/

