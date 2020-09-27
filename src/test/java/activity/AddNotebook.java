package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AddNotebook {
    public TextBox notebookName;
    public Button saveButton;

    public AddNotebook(){
        notebookName=new TextBox(By.id("com.vrproductiveapps.whendo:id/notebookTitle"));
        saveButton= new Button(new MobileBy.ByAccessibilityId("Guardar"));
    }
}
