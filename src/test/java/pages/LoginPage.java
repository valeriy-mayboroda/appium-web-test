package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by val on 19.08.2019.
 */

public class LoginPage {
    private AppiumDriver driver;
    private MobileBy login = new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"de.autodoc.gmbh:id/inputLogin\")");
    private MobileBy password = new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"de.autodoc.gmbh:id/inputPassword\")");
    private MobileBy initButton = new MobileBy.ByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\")");
    private final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void setLogin(String value) {
        driver.findElement(login).sendKeys(value);
        logger.info(String.format("Login '%s' is set", value));
    }

    public void setPassword(String value) {
        driver.findElement(password).sendKeys(value);
        logger.info("Password '***' is set");
    }

    public void clickLoginButton() {
        driver.findElement(initButton).click();
        logger.info("Log in button is clicked");
    }
}