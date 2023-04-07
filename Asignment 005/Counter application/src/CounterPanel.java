import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CounterPanel extends JPanel implements ActionListener {
    JButton incrButton = new JButton("Increase");
    JButton decrButton = new JButton("Decrease");
    JLabel countNum= new JLabel("Current Counter: 1");

        public static int  counter = 1;

    CounterPanel(){
        setLayout(null);

//        add(Box.createVerticalStrut(50));
//        add(incrButton);
//        incrButton.addActionListener(this);
//        add(Box.createVerticalStrut(50));
//        add(decrButton);
//        decrButton.addActionListener(this);
//        add(Box.createVerticalStrut(50));
//
//        add(countNum);
        incrButton.setBounds(200,100,200,50);
        add(incrButton);
        incrButton.addActionListener(this);
        decrButton.setBounds(200,200,200,50);
        add(decrButton);
        decrButton.addActionListener(this);
        countNum.setBounds(200,300,300,50);
        countNum.setForeground(Color.WHITE);
        countNum.setFont(new Font("Arial", Font.BOLD, 20));
        add(countNum);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == incrButton) {
            counter++;
            countNum.setText("Current Counter: " + counter);
        } else if (e.getSource()==decrButton) {
            counter--;
            countNum.setText("Current Counter: "+ counter);
        }

    }
}
