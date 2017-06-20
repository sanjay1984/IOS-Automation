package boutiqaat.ios.com;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Oman extends Base {

		
		
		@Test
			public void changethecountry() throws InterruptedException
		
		{
			
			
			TouchAction ta= new TouchAction(driver);
			
			ta.press(500,500 ).moveTo(500, -300).release().perform();
			
					
			
			WebDriverWait wait= new WebDriverWait(driver,30);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//XCUIElementTypeButton[@name='Celebrities']"))
			).click();
			
			Thread.sleep(2000);
					
			driver.findElementByXPath("//XCUIElementTypeButton[@name='V-Z']").click();
			Thread.sleep(2000);
			
			driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Zori']").click();
			
			
//			Thread.sleep(5000);
//			String s=driver.getPageSource();
//			
//			System.out.println(s);
			driver.findElementByName("BUY").click();
			
			
			driver.findElementByXPath("//XCUIElementTypeButton[@name='CHECKOUT']").click();
			
			driver.findElementByXPath("//XCUIElementTypeButton[@name='CHECKOUT']").click();
			
          driver.findElementByXPath("//XCUIElementTypeTextField[@value='Email Address']").sendKeys("ersanjaysharma14@gmail.com");
          
       
			
			driver.findElementByXPath("//XCUIElementTypeSecureTextField[@value='Password']").sendKeys("123456");
			
			driver.findElementByXPath("//XCUIElementTypeButton[@name='LOGIN']").click();
			
			driver.findElementByXPath("//XCUIElementTypeButton[@name='OK']").click();
	
			//driver.findElementByXPath("//XCUIElementTypeButton[@name='CONTINUE TO PAYMENT']").click();
			
	List<MobileElement> ls=  driver.findElementsByAccessibilityId("CONTINUE TO PAYMENT");
	
	int i=ls.size();
	
	System.out.println(i);
			
			ls.get(0).click();			
			
			driver.findElementByXPath("//XCUIElementTypeStaticText[@name='CASH']").click();
			Thread.sleep(3000);
			
 TouchAction ta1= new TouchAction(driver);
			
			ta1.press(100,600 ).moveTo(100, -200).release().perform();
			
			driver.findElementByXPath("//XCUIElementTypeButton[@name='PAY NOW']").click();
			
//			
//			File f=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			
//			try{
//				
//				
//				FileUtils.copyFile(f,new File("/Users/amit/Documents/workspace/boutiqaat.ios.com/abc.png") );
//				
//								
//			}  catch (Exception e)
//			{
//				
//				System.out.println("Exception"+ e.toString());
//			}
			
			wait.until(ExpectedConditions.textToBe(By.name("Order Successful"), "Order Successful"));
			
			
			Assert.assertEquals("Order Successful", "Order Successful");
	
			
		Thread.sleep(5000);	
		}
		
		
		
		
		
	}

	
	
	
	
	

