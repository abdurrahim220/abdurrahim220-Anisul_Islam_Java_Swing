package Swing;

import javax.swing.*;
import java.awt.*;

public class Label_Demo extends JFrame {
    private Container c;
    private JLabel userLabel1,passlabel;
    private Font f;
    private JLabel ImgLable;
    private ImageIcon img;

    Label_Demo(){
        initComponetns();
    }
    public void initComponetns()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);

        f = new Font("Arial",Font.BOLD,14);

        img =new ImageIcon(getClass().getResource("Private-Label-Icon.png"));
        ImgLable = new JLabel(img);
        ImgLable.setBounds(30 ,130,img.getIconWidth(),img.getIconHeight());
        c.add(ImgLable);


        userLabel1 =new JLabel();
        userLabel1.setText("Enter Your User Nmae : ");
        userLabel1.setBounds(50,20,200,50);
        userLabel1.setFont(f);
        userLabel1.setForeground(Color.red);
        userLabel1.setBackground(Color.yellow);
        userLabel1.setToolTipText("Enter your user name");
        userLabel1.setOpaque(true);
        c.add(userLabel1);

        //System.out.println(" "+userLabel1.getText());
        String s = userLabel1.getToolTipText();
        System.out.println(" "+s);

        passlabel = new JLabel("Enter your Password");
        passlabel.setBounds(50,70,200,50);
        passlabel.setFont(f);
        passlabel.setForeground(Color.MAGENTA);
        passlabel.setOpaque(true);
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
