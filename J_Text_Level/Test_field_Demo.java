package J_Text_Level;

import javax.swing.*;
import java.awt.*;

public class Test_field_Demo extends JFrame {

    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    Test_field_Demo(){
        intiComponent();
    }
    public void intiComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        f = new Font("Arial",Font.ITALIC + Font.BOLD,18);

        tf1 = new JTextField();
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f);
        tf1.setForeground(Color.yellow);
        tf1.setBackground(Color.GREEN);
        tf1.setHorizontalAlignment(JTextField.CENTER);
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
