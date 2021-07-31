package cleanTest;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.DeleteTaskScreen;
import activities.whenDo.MainScreen;
import activities.whenDo.UpdateTaskScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    private MainScreen mainScreen= new MainScreen();
    private CreateTaskScreen createTaskScreen= new CreateTaskScreen();
    private UpdateTaskScreen updateTaskScreen= new UpdateTaskScreen();
    private DeleteTaskScreen deleteTaskScreen= new DeleteTaskScreen();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String title="TESTING1";

        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("Description of a test");
        createTaskScreen.saveButton.click();
        Assert.assertEquals("ERROR! task was not created",title,mainScreen.nameTaskLabel.getText());
    }

    @Test
    public void verifyUpdateTask() throws MalformedURLException {
        verifyCreateTask();
        String title="new tittle";
        String description="UPdated description";
        mainScreen.selectTask.click();
        updateTaskScreen.updateTitleTextBox.setValue(title);
        updateTaskScreen.updateDescriptionTextBox.setValue(description);
        updateTaskScreen.saveButton.click();
        Assert.assertEquals("ERROR! task was not created",title,mainScreen.nameTaskLabel.getText());
    }

    @Test
    public void verifyDeleteTask() throws MalformedURLException {
        verifyCreateTask();
        String title="new tittle";
        mainScreen.selectTask.click();
        deleteTaskScreen.deleteButton.click();
        deleteTaskScreen.deleteConfirmationButton.click();
//        Assert.assertFalse(mainScreen.isItemDisplayed());

    }



    @After
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
