package it.unibo.mvc;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUIWithFileChooser extends SimpleGUI{

    private final JFrame frame = new JFrame();

    private SimpleGUIWithFileChooser() {
        super();
        final BorderLayout lay = new BorderLayout();
        final JPanel secondPanel = new JPanel();
        secondPanel.setLayout(lay);
    }

}
