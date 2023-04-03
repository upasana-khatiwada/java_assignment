//import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        new DataForm();
         //form.DataForm();


    }
}


//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create a JFrame to hold the components
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800, 800);
//        frame.setLayout(new BorderLayout());
//
//        // Create a JPanel to hold the text boxes and button
//        JPanel panel = new JPanel(new FlowLayout());
//
//        // Create text boxes for name, city, and phone
//        JTextField nameField = new JTextField(20);
//        JTextField cityField = new JTextField(20);
//        JTextField phoneField = new JTextField(20);
//
//        // Create a button to add the data to the table
//        JButton button = new JButton("Add to table");
//
//        // Add the text boxes and button to the panel
//        panel.add(new JLabel("Name:"));
//        nameField.setPreferredSize(new Dimension(200, 30));
//        panel.add(nameField);
//        panel.add(new JLabel("City:"));
//        cityField.setBounds(80,80,200,30);
//        panel.add(cityField);
//        panel.add(new JLabel("Phone:"));
//        phoneField.setBounds(80,150,200,30);
//        panel.add(phoneField);
//        button.setBounds(100,200,80,30);
//        panel.add(button);
//        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
//
//        // Create a table model to hold the data
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("Name");
//        model.addColumn("City");
//        model.addColumn("Phone");
//
//        // Create a JTable to display the data
//        JTable table = new JTable(model);
//
//        // Add the table to the frame
//        frame.add(new JScrollPane(table), BorderLayout.SOUTH);
//
//        // Add an action listener to the button
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Get the text from the text fields
//                String name = nameField.getText();
//                String city = cityField.getText();
//                String phone = phoneField.getText();
//
//                // Add the data to the table model
//                model.addRow(new Object[]{name, city, phone});
//
//                // Clear the text fields
//                nameField.setText("");
//                cityField.setText("");
//                phoneField.setText("");
//            }
//        });
//
//        // Add the panel to the frame
//        frame.add(panel, BorderLayout.NORTH);
//
//        // Display the frame
//        frame.setVisible(true);
//    }
//}
