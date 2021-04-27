package baseConfings;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import pages.MainPageShopAE;
import pages.MainPageShopAerie;
import pages.PreMainPages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected AndroidDriver driver;
    protected PreMainPages preMainPages;
    protected MainPageShopAE mainPageShopAE;
    protected MainPageShopAerie mainPageShopAerie;

    @BeforeMethod
    public void setup(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10");

        File app = new File("src/test/resources/", "androidAEO-prod-debug.apk");

        desiredCapabilities.setCapability("app", app.getAbsolutePath());
        desiredCapabilities.setCapability("appPackage", "com.ae.ae.debug");
        desiredCapabilities.setCapability("appActivity", "com.aeo.mvvm.splash.SplashActivity");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        preMainPages = new PreMainPages(driver);
        mainPageShopAE = new MainPageShopAE(driver);
        mainPageShopAerie = new MainPageShopAerie(driver);

    }

    @AfterTest
    public void close(){
        driver.quit();
    }

}
