package activity;

import appiumControl.Button;
import appiumControl.ComboBox;
import appiumControl.Label;
import appiumControl.TextBox;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addTaskButton;
    public Button menuButton;

    public MainActivity(){
    addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    menuButton=new Button(By.xpath("//android.widget.ImageButton[@class=\"android.widget.ImageButton\"]"));
    }

    public boolean isTaskDisplayed(String nameTask){
        String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text= '"+nameTask+"']";
        Label task = new Label(By.xpath(locator));
        return task.isDisplayed();
    }
}
