package cleanTest;

import controlAppium.Button;
import controlAppium.Label;
import org.junit.Test;
import org.openqa.selenium.By;
import session.Session;

import java.net.MalformedURLException;

public class ContactTest {

    @Test
    public void testSwipeEvent() throws MalformedURLException {
        Button contact = new Button(By.id("com.google.android.dialer:id/contacts_tab"));
        contact.click();
        Session.getInstance().swipe();
        Session.getInstance().closeSession();
    }
}