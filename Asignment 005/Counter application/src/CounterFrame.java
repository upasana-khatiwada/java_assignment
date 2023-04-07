import javax.swing.*;
import java.awt.*;

public class CounterFrame extends JFrame  {


    CounterPanel counterPanel ;
    CounterFrame(){
        counterPanel = new CounterPanel();
        this.setSize(600,600);
        this.setTitle("Counter");
        this.add(counterPanel);
        counterPanel.setSize(600,600);
        counterPanel.setBackground(Color.BLACK);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
