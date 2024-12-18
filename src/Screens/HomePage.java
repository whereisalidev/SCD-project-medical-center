package Screens;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {
    void homepage(){
        JFrame f1 = new JFrame("Al-Shifa Medical Center");

        //Images:
        ImageIcon img1 = new ImageIcon("src\\images\\admin2(1).png");
        ImageIcon img2 = new ImageIcon("src\\images\\r.jpeg");
        ImageIcon img3 = new ImageIcon("src\\images\\dr.jpg");
        ImageIcon img4 = new ImageIcon("src\\images\\appoint.jpg");
        ImageIcon img5 = new ImageIcon("src\\images\\hospital1.png");
        ImageIcon bg = new ImageIcon("src\\images\\bg1.jpg");

        //Labels:
        JLabel l = new JLabel("Al-Shifa Medical Center");
        l.setBounds(240, 55, 850, 35);
        l.setFont(new Font("Stencil", Font.PLAIN, 35));
        l.setForeground(Color.BLUE);

        JLabel pic = new JLabel(img5);
        pic.setBounds(5,0,200,150);

        JLabel l1 = new JLabel(img1);
        l1.setBounds(20,60,200,400);

        JLabel l2 = new JLabel(img2);
        l2.setBounds(240,60,200,400);

        JLabel l3 = new JLabel(img3);
        l3.setBounds(460,60,200,400);

        JLabel l4 = new JLabel(img4);
        l4.setBounds(680,60,200,400);

        JLabel l5 = new JLabel(bg);
        l5.setBounds(-20, 0, 920, 550);

        //Buttons:
        JButton b1 = new JButton("Admin");
        b1.setBounds(54,360,130,30);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                Admin A = new Admin();
                A.admin_login();
            }
        });

        JButton b2 = new JButton("Receptionist");
        b2.setBounds(274,360,130,30);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                Receptionist R = new Receptionist();
                R.recep_login();
            }
        });

        JButton b3 = new JButton("Doctor");
        b3.setBounds(494,360,130,30);
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLUE);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                Doctors D = new Doctors();
                D.view_doctors();
            }
        });

        JButton b4 = new JButton("Patients");
        b4.setBounds(715,360,135,30);
        b4.setFont(new Font("Arial", Font.BOLD, 15));
        b4.setForeground(Color.white);
        b4.setBackground(Color.BLUE);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                Patient P = new Patient();
                P.view_patient();
            }
        });

        f1.add(l1);f1.add(l);
        f1.add(l2);f1.add(l3);
        f1.add(l4);f1.add(b1);
        f1.add(b2); f1.add(pic);
        f1.add(b3);f1.add(b4);
        f1.add(l5);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(920,550);
        f1.setLocationRelativeTo(null);
    }

}