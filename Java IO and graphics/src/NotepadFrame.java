import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NotepadFrame extends JFrame  {
    NotepadPanel panel;

    NotepadFrame(){
        panel= new NotepadPanel();
        panel.setBackground(Color.gray);
        this.add(panel);
        this.setTitle("Notepad ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(800,800);
        this.setVisible(true);


       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);









    }
}
