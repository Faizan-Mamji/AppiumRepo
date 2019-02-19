import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TestNgClass extends AppiumDefaultClass {

    public AndroidDriver<AndroidElement> mainDriver;


    @BeforeTest
    public void MainExecuteBefore() {
        try {
            mainDriver = testfunc();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @Test(priority = 0)
    public void Preference_Test1() {
        TestFunctionsInClass objtest = new TestFunctionsInClass(mainDriver);
        try {

            objtest.Preference_Action_Section5_Lecture27();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test(priority = 1)
    public void View_Test2() {
        TestFunctionsInClass objtest = new TestFunctionsInClass(mainDriver);
        try {
            objtest.Gesture_Views();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @AfterTest
    public void MainExecuteAfter() {
        //mainDriver.close();
    }
}
