import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
    JTable table = new JTable();
    DefaultTableModel model = new DefaultTableModel();






    void render(){
        //name label
        name.setBounds(20,20,50,20);
        frame.add(name);
        //name textbox
        nameBox.setBounds(80,20,200,30);
        frame.add(nameBox);

        //city label
        city.setBounds(20,80,50,20);
        frame.add(city);
        //city textbox
        cityBox.setBounds(80,80,200,30);
        frame.add(cityBox);

        //phone label
        phone.setBounds(20,150,50,20);
        frame.add(phone);
        //phone textbox
        phoneBox.setBounds(80,150,200,30);
        frame.add(phoneBox);


        //insert button
        insert.setBounds(100,200,80,30);
        insert.addActionListener(this);
        frame.add(insert);

        //reset button
        reset.setBounds(190,200,80,30);
        reset.addActionListener(this);
        frame.add(reset);

        //create table with 3 column
        model.addColumn("Name");
        model.addColumn("City");
        model.addColumn("PhoneBook");
        table.setModel(model);



        JScrollPane scrollPane = new JScrollPane(table);
        table.setBounds(150,900,500,500);
        frame.add(table);

        frame.setSize(800,800);
        frame.setTitle("PhoneBook1");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
       // frame.pack();
        frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Get values from textboxes
        String name = nameBox.getText();
        String city = cityBox.getText();
        String phone = phoneBox.getText();

        if(e.getSource()==insert){



            // Add values to the model
            Object[] row = { name, city, phone };
            model.addRow(row);

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

