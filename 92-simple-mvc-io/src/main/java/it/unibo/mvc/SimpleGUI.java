package it.unibo.mvc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * A very simple program using a graphical interface.
 * 
 */
public class SimpleGUI {

    private final  JFrame frame = new JFrame();

    public SimpleGUI(){
        final JPanel myPanel = new JPanel();
        final BorderLayout layout = new BorderLayout();
        final JTextArea textArea = new JTextArea("write here");
        final JButton save = new JButton("Save");
        final Controller controller = new Controller();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.setLayout(layout);
        myPanel.add(textArea, BorderLayout.CENTER);
        myPanel.add(save, BorderLayout.SOUTH);
        save.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                controller.write(textArea.getText());
            }
        });
        frame.setContentPane(myPanel);
    }

    private void display() {
        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new SimpleGUI().display();
    }
}
