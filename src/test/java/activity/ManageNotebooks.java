package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ManageNotebooks {
    public Button addNotebook;

    public ManageNotebooks(){
        addNotebook = new Button(new MobileBy.ByAccessibilityId("Agregar Cuaderno"));
    }

    public boolean isDisplayedNotebook(String nameNotebook){
        String locator= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView[@text='"+nameNotebook+"']";
        Label notebook = new Label(By.xpath(locator));
        return notebook.isDisplayed();
    }




}
