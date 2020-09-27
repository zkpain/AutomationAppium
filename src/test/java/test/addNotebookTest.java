package test;

import activity.AddNotebook;
import activity.MainActivity;
import activity.ManageNotebooks;
import activity.MenuActivity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class addNotebookTest {

    MainActivity mainActivity= new MainActivity();
    MenuActivity menuActivity= new MenuActivity();
    ManageNotebooks manageNotebooks= new ManageNotebooks();
    AddNotebook addNotebook = new AddNotebook();

    @Test
    public void VerifyCreateNotebook()throws MalformedURLException{
        String nameNotebook = "MI CUADERNO";
        mainActivity.menuButton.click();
        menuActivity.manageNotebooksButton.click();
        manageNotebooks.addNotebook.click();
        addNotebook.notebookName.type(nameNotebook);
        addNotebook.saveButton.click();
        // Verification

        Assert.assertTrue("ERROR, el cuaderno no esta creado",manageNotebooks.isDisplayedNotebook(nameNotebook));


    }
    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
