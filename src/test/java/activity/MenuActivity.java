package activity;


import appiumControl.Button;
import org.openqa.selenium.By;

public class MenuActivity {
    public Button manageNotebooksButton;

    public MenuActivity(){
        manageNotebooksButton=new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]"));
    }
}
