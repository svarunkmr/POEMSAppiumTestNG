package Scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by arun on 12/7/17.
 */
public class AndroidSetup {

    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        //File appDir = new File("/home/arun/IdeaProjects/App apk");
        //File app = new File(appDir, "flipkart.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "Android");
        //capabilities.setCapability("device","Android");
        //capabilities.setCapability("platformVersion", "7.0.0");
        capabilities.setCapability("autoLaunch","true");

        //mandatory capabilities
        capabilities.setCapability("deviceName","ENU7N16612000891");
        capabilities.setCapability("platformName","Android");

        //other caps
        //capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("app", "/home/arun/IdeaProjects/App apk/flipkart.apk");
        //capabilities.setCapability("appPackage", "com.flipkart.android-1/base");
        capabilities.setCapability("appActivity", ".SplashActivity");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //driver =  new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

}



//capabilities.setCapability("browserName", "Android");
        //capabilities.setCapability("platformVersion", "6.0.1");
        //capabilities.setCapability("deviceName","96f3b897");
        //capabilities.setCapability("platformName","Android");
        //capabilities.setCapability("autoLaunch","true");

        //capabilities.setCapability("app", "E:\\MBKE\\Poemsapk\\POEMS SG 2.0.apk");
// This package name of your app (you can get it from apk info app)
        //capabilities.setCapability("appActivity","common.features.splash.SplashActivity"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
//        try {
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        } catch (MalformedURLException e) {
//        e.printStackTrace();
//        }