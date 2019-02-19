import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestFunctionsInClass extends AppiumDefaultClass {

    public AndroidDriver<AndroidElement> driver;
    private final Logger logg = LogManager.getLogger(TestFunctionsInClass.class);

    public TestFunctionsInClass(AndroidDriver<AndroidElement> ddriver) {
        this.driver = ddriver;
    }

    public void Preference_Action_Section5_Lecture27() throws MalformedURLException {
        AllAndroidPOM objAll = new AllAndroidPOM(driver);

        try {
            logg.info("Testcase 1 Execution of preference starts");
            objAll.preferenceclick().click();
            logg.info("Test1 function 2222");
            TimeUnit.SECONDS.sleep(4);
            objAll.preferenceDependenciesclick().click();
            logg.info("Preference CLicked Successfully");
            TimeUnit.SECONDS.sleep(2);
            objAll.PrefrenceWifiCheckbox().click();
            logg.info("Checkbox CLicked Successfully");
            TimeUnit.SECONDS.sleep(2);
            objAll.EnableWifiSettings().click();
            logg.info("Enable wifi");
            TimeUnit.SECONDS.sleep(2);
            objAll.WifiTextBox().click();
            TimeUnit.SECONDS.sleep(2);
            objAll.WifiTextBox().sendKeys("abc123");
            TimeUnit.SECONDS.sleep(4);
            logg.info("Text enters successfully");
            objAll.WifiBtnClick().click();
            TimeUnit.SECONDS.sleep(3);
            logg.info("Wifi OK button clicked successfully");
            driver.navigate().back();
            TimeUnit.SECONDS.sleep(1);
            driver.navigate().back();
            logg.info("Page comes back");

        } catch (Exception ex) {
            logg.info(ex.getMessage());
        }
    }

    public void Gesture_Views() {
        AllAndroidPOM objAllAnd = new AllAndroidPOM(driver);
        try {
            logg.info("Gesture - 1 Lecture 29 Starts ");
            objAllAnd.Viewsclick().click();
            logg.info("View button clicked successfully");
            objAllAnd.ExpandableListclick().click();
            logg.info("Expandable button clicked successfully");
            objAllAnd.CustomAdapterclick().click();
            logg.info("Custom Adapter button clicked successfully");
        } catch (Exception ex) {
            logg.info(ex.getMessage());
        }

    }
}

