import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadPanel extends JPanel implements ActionListener {
    FileCreate create;
    JTextArea textArea = new JTextArea();
    NotepadPanel(){
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(0,710,200,50);
        saveButton.addActionListener(this);
        add(saveButton, BorderLayout.SOUTH);
        //textArea.setBounds(0,600,500,700);
        textArea.setLineWrap(true);
        //textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        this.add(scrollPane, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       create =new FileCreate();


        try {
            create.saveToFile("note.txt", textArea.getText());
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
