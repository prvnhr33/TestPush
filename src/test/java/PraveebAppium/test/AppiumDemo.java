package PraveebAppium.test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppiumDemo {

    public static void main(String[] args) {
    	AndroidDriver driver;

        try {
            // Create UiAutomator2Options for configuration
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setPlatformVersion("11"); // Update based on your Android version
            options.setDeviceName("emulator-5554"); // Use `adb devices` to confirm device ID
            options.setAutomationName("UiAutomator2");
            options.setApp("C:\\Users\\SONI\\Downloads\\ApiDemos-debug.apk"); // Provide APK path
            

            // Initialize the Appium Driver
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

            System.out.println("Session started successfully!");
            
            List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView"));
            
            for(WebElement ele : elements) {
            	
            	System.out.println(ele.getAttribute("text"));
            	
            }
            	
            
            

            

            // Quit the driver session
            driver.quit();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL for Appium Server: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
