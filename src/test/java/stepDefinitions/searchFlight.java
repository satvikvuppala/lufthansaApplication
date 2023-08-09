package stepDefinitions;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.appium.java_client.MobileElement;

public class searchFlight {
	
	static AppiumDriver<MobileElement> driver;
	URL url;
	static DesiredCapabilities cap = new DesiredCapabilities();
	
	@Before
	public static void lufthansa() throws Exception {
		
//		Device details		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("udid", "emulator-5554");
		
//		Application details
//		cap.setCapability("app", "C://Users//Admin//Desktop//Automation//APK's//lufthansa.apk");
		cap.setCapability("appPackage", "com.lufthansa.android.lufthansa");
		cap.setCapability("appActivity", "com.lufthansa.android.lufthansa.ui.activity.HomeActivity");
		
		cap.setCapability("appReset", false);
		
//		Appium mobile driver details	
		
		System.out.println("Application started");
		Thread.sleep(5000);
		
	}
	
	@After
	public static void closeDriver() {
		driver.quit();
		System.out.println("Application closed");
	}
	

	@Given("Open lufthansa application on android emulator")
	public void open_lufthansa_application() throws Exception {
		System.out.println("1");
		url = new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("2");
		driver = new AppiumDriver<>(url,cap);
		System.out.println("3");
		Thread.sleep(5000);
		System.out.println("Application started");
	}
	
	@And("Navigate to Book flight page")
	public void navigate_to_book_flight_page() throws Exception {
		
//      Agree and save selection section
        String agreeAll = "Save selection";
        By scrollableElement = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().textContains(\"" + agreeAll + "\").instance(0))");
        driver.findElement(scrollableElement).click();
        
//      Continue as guest
        driver.findElement(By.id("not_now_button")).click();
        System.out.println("Contiued as a guest");
        driver.findElement(By.id("button2")).click();
        Thread.sleep(2000);
        driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
        System.out.println("Location permission granted");
		Thread.sleep(5000);
	}
	
	@When("User enters FROM city")
	public void user_enters_from_city() throws Exception {
        driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Of\"]/android.widget.TextView[2]")).click();
        MobileElement el_from = (MobileElement) driver.findElementById("com.lufthansa.android.lufthansa:id/airportPickerSearch");
        el_from.sendKeys("Mumbai");
        driver.findElementById("com.lufthansa.android.lufthansa:id/airportPickerViewIconTextView").click();
        System.out.println("From city selected");
		Thread.sleep(2000);
	}
	
	@And("User enters TO city")
	public void user_enters_to_city() throws Exception {
		Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"To\"]/android.widget.TextView[2]").click();
        driver.findElementById("com.lufthansa.android.lufthansa:id/airportPickerSearch").sendKeys("Frankfurt");
        driver.findElementById("com.lufthansa.android.lufthansa:id/airportPickerViewIconTextView").click();
        System.out.println("To city selected");
		Thread.sleep(2000);
    }
	
	@And("User selects DATE")
	public void user_selects_date() throws Exception {
		driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"From date\"]/android.widget.TextView[2]").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[3]/android.widget.TextView").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[6]/android.widget.TextView").click();
		driver.findElementById("com.lufthansa.android.lufthansa:id/confirm_button").click();
		System.out.println("Date selected");
		Thread.sleep(2000);
	}
	
	/*
	   MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[3]/android.widget.TextView");
el2.click();
MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[6]/android.widget.TextView");
el3.click();
	  
	 
	 */
	
	
	
	
	@And("User selects passengers and seat type")
	public void user_selects_passengers_and_seat_type() {
		System.out.println("When and 3");
	}
	
	@And("User clicks on Search")
	public void user_clicks_on_search() throws Exception {
		driver.findElementByAccessibilityId("Search button").click();
		System.out.println("Clicked search button");
		Thread.sleep(3000);
	}
	
	@Then("User taken to Flight Search page")
	public void user_taken_to_flight_search_page() {
		System.out.println("Then");
	}

}