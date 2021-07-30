package activities.whenDo;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class UpdateTaskScreen {
    public TextBox titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox descriptionTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public UpdateTaskScreen(){}
}
