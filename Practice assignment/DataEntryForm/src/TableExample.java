//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//
//public class TableExample extends JFrame {
//    private final JTable table;
//    private final  JTextField textField1;
//    private final JTextField textField2;
//  //  private final JButton addButton;
//    private final DefaultTableModel model;
//
//    public TableExample() {
//        // Create the table model
//        model = new DefaultTableModel();
//        model.addColumn("Column 1");
//        model.addColumn("Column 2");
//
//        // Create the table and add the model
//        table = new JTable(model);
//
//        // Create the text fields and add to the frame
//        textField1 = new JTextField(10);
//        textField2 = new JTextField(10);
//        add(textField1);
//        add(textField2);
//
//        // Create the button and add to the frame
//        JButton addButton = new JButton("Add");
//        addButton.addActionListener(e -> {
//            // Get the text from the text fields
//            String text1 = textField1.getText();
//            String text2 = textField2.getText();
//
//            // Add a new row to the table model
//            model.addRow(new Object[]{text1, text2});
//
//            // Refresh the table to display the new data
//            table.revalidate();
//            table.repaint();
//        });
//        add(addButton);
//
//        // Add the table to the frame
//        JScrollPane scrollPane = new JScrollPane(table);
//        add(scrollPane);
//
//        // Set the frame properties
//        setTitle("Table Example");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 300);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
////    public static void main(String[] args) {
////        new TableExample();
////    }
//}
