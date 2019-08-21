package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by val on 19.08.2019.
 */

public class MobileWebTest {
    public static AppiumDriver driver;

    @BeforeSuite
    public void initDriver() throws MalformedURLException {
        URL server = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/test/utils/de.autodoc.gmbh_23_apps.evozi.com.apk");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "de.autodoc.gmbh");

        driver = new AndroidDriver(server, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void closeResources() {
        driver.quit();
    }

    @Test
    public void dfhjd() throws MalformedURLException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLogin(System.getenv("siteLogin"));
        loginPage.setPassword(System.getenv("sitePassword"));
        loginPage.clickLoginButton();
    }
}