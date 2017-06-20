package boutiqaat.ios.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeClass
	
	public void setup() throws InterruptedException, MalformedURLException
	
	{
		
		
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest" );
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3.2");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		
			cap.setCapability(MobileCapabilityType.UDID, "10f342c8e010fae33493117d2409ae412ea2bd59");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
			cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.test.boutiqaat");
			cap.setCapability(MobileCapabilityType.NO_RESET, "false");
			cap.setCapability(MobileCapabilityType.FULL_RESET,"false");
		//cap.setCapability(IOSMobileCapabilityType.XCODE_CONFIG_FILE, "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/xcodeConfigFile.xcconfig");
cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "0");
			

driver= new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			Thread.sleep(3000);
			
		}
	
	@AfterClass
	
	
	public void teardown() throws InterruptedException
	
	{
		Thread.sleep(5000);
		
	
		
	driver.quit();
	}
		
		
		
		
	}


