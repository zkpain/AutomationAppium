package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class TaskManagerActivity {
    public TextBox title;
    public TextBox notes;
    public Button saveButton;

    public TaskManagerActivity(){
        title= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notes=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton=new Button (new MobileBy.ByAccessibilityId("Guardar"));
    }
}