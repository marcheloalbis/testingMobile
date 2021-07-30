package basicTest;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicAppium {

    private AppiumDriver driver;


    @BeforeEach()
    public void setup() throws  MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Mi A2");
        capabilities.setCapability("platformVersion","10");
        //capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
       // capabilities.setCapability("appActivity",".ui.HomeActivity");
        capabilities.setCapability("appPackage","com.google.android.dialer");
        capabilities.setCapability("appActivity",".extensions.GoogleDialtactsActivity");
        capabilities.setCapability("platformName","Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        // implicit wait

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @AfterEach()
    public void cleanup() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void createTaskWhenDo(){

        // Click +
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        // Set Title
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("REMOVE");
        // Set Notas
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("esta es una descripcion");
        // Click Save
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
        // Verificacion
        String expectedResult="REMOVE";
        String actualResult=driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals("ERROR tarea no fue creado!",expectedResult,actualResult);
    }


}
