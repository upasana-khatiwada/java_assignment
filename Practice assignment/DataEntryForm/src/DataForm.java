import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataForm implements ActionListener {
    JFrame frame = new JFrame();
    JLabel name =new JLabel("Name");
    JTextField nameBox = new JTextField();
    JLabel city= new JLabel("City");
    JTextField cityBox = new JTextField();

    JLabel phone = new JLabel("Phone");
    JTextField phoneBox = new JTextField();

    JButton insert = new JButton("Insert");
    JButton reset = new JButton("Reset");



    JPanel panel = new JPanel(new FlowLayout());


    DefaultTableModel model = new DefaultTableModel();
    // model = (DefaultTableModel) table.getModel();





    public DataForm(){
        //name label
        name.setBounds(20,20,50,20);
        panel.add(name);
        //name textbox
        nameBox.setBounds(80,20,200,30);
        panel.add(nameBox);

        //city label
        city.setBounds(20,80,50,20);
        panel.add(city);
        //city textbox
        cityBox.setBounds(80,80,200,30);
        panel.add(cityBox);

        //phone label
        phone.setBounds(20,150,50,20);
        panel.add(phone);
        //phone textbox
        phoneBox.setBounds(80,150,200,30);
        panel.add(phoneBox);


        //insert button
        insert.setBounds(100,200,80,30);
        insert.addActionListener(this);
        panel.add(insert);

        //reset button
        reset.setBounds(190,200,80,30);
        reset.addActionListener(this);
        panel.add(reset);

        //create table with 3 column
        model.addColumn("Name");
        model.addColumn("City");
        model.addColumn("PhoneBook");
       // table.setModel(model);

        JTable table = new JTable(model);



        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        table.setBounds(150,900,500,500);


        //frame.add(table);

        frame.setSize(800,800);
        frame.setTitle("PhoneBook1");
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.pack();
        // Add the panel to the frame
        frame.add(panel, BorderLayout.NORTH);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        // Display the frame
        frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Get values from textboxes
        String name = nameBox.getText();
        String city = cityBox.getText();
        String phone = phoneBox.getText();

        if(e.getSource()==insert){



            // Add a new row to the table model
// Add a new row to the table model with the data


            model.addRow(new Object[]   { name, city, phone });


            // Refresh the table to display the new data
//            table.revalidate();
//            table.repaint();

            // Clear textboxes
            nameBox.setText("");
            cityBox.setText("");
            phoneBox.setText("");






        }

        if(e.getSource()==reset){
            // Clear textboxes
            nameBox.setText("");
            cityBox.setText("");
            phoneBox.setText("");
        }
    }
}

