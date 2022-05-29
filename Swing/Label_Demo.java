package Swing;

import javax.swing.*;
import java.awt.*;

public class Label_Demo extends JFrame {
    private Container c;
    private JLabel userLabel1,passlabel;
    private Font f;

    Label_Demo(){
        initComponetns();
    }
    public void initComponetns()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);

        f = new Font("Arial",Font.BOLD,14);


        userLabel1 =new JLabel();
        userLabel1.setText("Enter Your User Nmae : ");
        userLabel1.setBounds(50,20,200,50);
        userLabel1.setFont(f);
        c.add(userLabel1);

        passlabel = new JLabel("Enter your Password");
        passlabel.setBounds(50,70,200,50);
        passlabel.setFont(f);
        c.add(passlabel);
    }
    public static void main(String[] args) {
        Label_Demo ld= new Label_Demo();
        ld.setVisible(true);
        ld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ld.setBounds(200,50,400,500);
        ld.setTitle("Label Demo");
    }
}
