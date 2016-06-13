package listeners;

import base.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * Created by Qouer on 11.05.2016.
 */
public class UndoMenuListener implements MenuListener {
    View view;
    JMenuItem undoMenuItem;
    JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    @Override
    public void menuSelected(MenuEvent e) {
        undoMenuItem.setEnabled(view.canUndo());
        redoMenuItem.setEnabled(view.canRedo());

    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
