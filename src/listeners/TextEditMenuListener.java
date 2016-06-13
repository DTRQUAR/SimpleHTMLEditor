package listeners;

import base.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

/**
 * Created by Qouer on 11.05.2016.
 */
public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        JMenu jMenu = (JMenu) menuEvent.getSource();
        Component[] menuComponents = jMenu.getMenuComponents();
        boolean enabled = view.isHtmlTabSelected();
        for (int i = 0; i < menuComponents.length; i++) {
            menuComponents[i].setEnabled(enabled);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
