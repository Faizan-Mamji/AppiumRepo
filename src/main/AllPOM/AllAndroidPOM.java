//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class AllAndroidPOM {

    public AndroidDriver<AndroidElement> driver;

    public AllAndroidPOM(AndroidDriver<AndroidElement> ddriver) {
        this.driver = ddriver;
    }

    public  AndroidElement preferenceclick() {
        By clickpreference = By.xpath("//android.widget.TextView[@text='Preference']");
        return driver.findElement(clickpreference);
    }

    public AndroidElement preferenceDependenciesclick() {
       // By preferenceDependencies = By.xpath("//android.widget.TextView[@text='3. Preference dependencies']");
        //return driver.findElement(preferenceDependencies);
        return driver.findElementByAndroidUIAutomator("text(\"3. Preference dependencies\")");
    }

    public AndroidElement PrefrenceWifiCheckbox() {
        By WifiCheckBox = By.id("android:id/checkbox");
        return driver.findElement(WifiCheckBox);
        //return driver.findElementByAndroidUIAutomator("(\"\")");
    }

    public AndroidElement EnableWifiSettings() {
        By WifiSettings = By.xpath("//android.widget.TextView[@text='WiFi settings']");
        return driver.findElement(WifiSettings);
    }

    public AndroidElement WifiTextBox() {
        By WifiSettings = By.id("android:id/edit");
        return driver.findElement(WifiSettings);
    }

    public AndroidElement WifiBtnClick() {
        By WifiOkBtn= By.id("android:id/button1");
        return driver.findElement(WifiOkBtn);
    }

    public  AndroidElement Viewsclick() {
        return driver.findElementByAndroidUIAutomator("text(\"Views\")");
    }

    public  AndroidElement ExpandableListclick() {
        return driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
    }

    public  AndroidElement CustomAdapterclick() {
        return driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
    }




}
