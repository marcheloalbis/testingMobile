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
        String title="CLEAN";

        //mainScreen.addTaskButton.click();
        //selecciona la tarea
        //edita titulo
        //edita contenido
        //presiona boton de guardar
        updateTaskScreen.titleTextBox.setValue(title);
        updateTaskScreen.descriptionTextBox.setValue("this is a description");
        updateTaskScreen.saveButton.click();
        Assert.assertEquals("ERROR! task was not created",title,mainScreen.nameTaskLabel.getText());
    }

    @Test
    public void verifyDeleteTask() throws MalformedURLException {
        String title="CLEAN";
        //selecciona la tarea
       // presiona boton de eliminar
        //presiona eliminar en notificacion emergente
        mainScreen.addTaskButton.click();
        deleteTaskScreen.titleTextBox.setValue(title);
        deleteTaskScreen.descriptionTextBox.setValue("this is a description");
        deleteTaskScreen.saveButton.click();
        Assert.assertEquals("ERROR! task was not created",title,mainScreen.nameTaskLabel.getText());
    }



    @After
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
