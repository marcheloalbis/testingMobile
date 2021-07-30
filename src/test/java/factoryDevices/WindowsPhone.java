package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WindowsPhone implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        return null;
    }
}
