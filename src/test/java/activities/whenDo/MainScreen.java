package activities.whenDo;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.net.MalformedURLException;

public class MainScreen {
      public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
      public Label nameTaskLabel = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
      public Label selectTask = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
      public MainScreen(){}

      public boolean isItemDisplayed(){
            try{
                  selectTask.getText();
                  return true;

            } catch (MalformedURLException e) {
                  e.printStackTrace();
                  return false;
            }
      }
}
