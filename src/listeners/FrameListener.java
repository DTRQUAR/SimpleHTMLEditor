package listeners;

import base.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Qouer on 09.05.2016.
 */
public class FrameListener extends WindowAdapter {
    View view;

    public FrameListener(View view) {
        this.view = view;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        view.exit();
    }
}
