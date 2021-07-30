package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "marceloalbis_kzqpaM");
        caps.setCapability("browserstack.key", "CqU7xw6ppmT5xxxYP4dq");

        // Set URL of the application under test
        caps.setCapability("app", "bs://e498d2d26dcc8f2c22321e41c5abcc2c7d6924aa");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "UCB Diplomado Testing");
        caps.setCapability("build", "Modulo 3");
        caps.setCapability("name", "WhenDo");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        return driver;

    }
}