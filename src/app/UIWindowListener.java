package app;

import java.awt.event.*;

public class UIWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent windowEvent) {
       System.exit(0);
    }
}
