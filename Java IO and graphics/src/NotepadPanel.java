import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadPanel extends JPanel implements ActionListener {
    FileCreate create;
    JTextArea textArea = new JTextArea();
    NotepadPanel(){
        JButton saveButton = new JButton("Save");

        saveButton.setPreferredSize(new Dimension(200, 50));
        saveButton.addActionListener(this);


        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        //this.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setPreferredSize(new Dimension(780, 700));


        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel saveButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        saveButtonPanel.add(saveButton);
        wrapperPanel.add(saveButtonPanel, BorderLayout.SOUTH);
        add(wrapperPanel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       create =new FileCreate();


        try {
            create.saveToFile("note.txt", textArea.getText());
            textArea.setText(" ");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
