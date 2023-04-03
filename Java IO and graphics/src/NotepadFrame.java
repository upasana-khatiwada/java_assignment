import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NotepadFrame extends JFrame  {
    NotepadPanel panel;

    NotepadFrame(){
        panel= new NotepadPanel();
        this.add(panel);
        this.setTitle("Notepad ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(800,800);

       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);









    }
}
