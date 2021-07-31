package activities.whenDo;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class DeleteTaskScreen {

    public Button deleteButton= new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button deleteConfirmationButton= new Button(By.id("android:id/button1"));

    public DeleteTaskScreen(){}


}
