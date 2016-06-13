package actions;

import base.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Qouer on 11.05.2016.
 */
public class UndoAction extends AbstractAction{
    private View view;

    public UndoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }
}
