package J_Text_Level;

import javax.swing.*;
import java.awt.*;

public class Test_field_Demo extends JFrame {

    private Container c;
    private JTextField tf1,tf2;
    Test_field_Demo(){
        intiComponent();
    }
    public void intiComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        tf1 = new JTextField();
        tf1.setBounds(50,50,200,50);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setText("Rahim");
        tf2.setBounds(50,110,200,50);
        c.add(tf2);
    }

    public static void main(String[] args) {
        Test_field_Demo frame2 = new Test_field_Demo();
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(100,50,500,400);
        frame2.setTitle("JTextField_Demo");

    }
}
