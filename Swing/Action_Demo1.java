package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action_Demo1 extends JFrame {

    private Container c;
    private JTextField tf3,tf4;
    Action_Demo1()
    {
        initComponents();
    }
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        tf3 = new JTextField();
        tf3.setBounds(50, 50, 150, 50);
        c.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(50, 110, 150, 50);
        c.add(tf4);

        tf3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s = tf3.getText();
                if(s.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"You enter nothing!!");
                }
                else {
                    JOptionPane.showMessageDialog(null,"tf3 = "+s);
                }
            }
        });
    }


    public static void main(String[] args) {
        Action_Demo1 ad= new Action_Demo1();
        ad.setVisible(true);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ad.setBounds(100,50,500,400);
        ad.setTitle("Action_Listener_Demo");
    }
}
