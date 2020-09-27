package test;
import activity.MainActivity;
import activity.TaskManagerActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;
public class addTaskTest {
    MainActivity mainActivity= new MainActivity();
    TaskManagerActivity taskManagerActivity= new TaskManagerActivity();

    @Test
    public void VerifyCreateTask() throws MalformedURLException{
        String nameTask = "Tarea 1";
        mainActivity.addTaskButton.click();
        taskManagerActivity.title.type(nameTask);
        taskManagerActivity.notes.type("Entregar el viernes");
        taskManagerActivity.saveButton.click();
    //verification

        Assert.assertTrue("Error tarea no creada",mainActivity.isTaskDisplayed(nameTask));

    }
    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
