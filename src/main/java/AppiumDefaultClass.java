import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDefaultClass {

    public AndroidDriver<AndroidElement> driver;
    private final Logger logg = LogManager.getLogger(AppiumDefaultClass.class);
    Properties prop=new Properties();

    public AndroidDriver testfunc() throws IOException {

        FileInputStream FS= new FileInputStream("Config/configuration.properties");

        try {
            prop.load(FS);
            String MobDeviceName=prop.getProperty("Device");
            String TotalWait=prop.getProperty("impicit");
            File f = new File("AndroidApk");
            File fs = new File(f, "ApiDemos-debug.apk");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,MobDeviceName);
            cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(Long.parseLong(TotalWait), TimeUnit.SECONDS);
        } catch (NullPointerException e) {
            logg.info(e.getMessage());
        } catch (IOException exe) {
            logg.info(exe.getMessage());
        } catch (Exception ex) {
            logg.info(ex.getMessage());
        }

        return driver;
    }
}
