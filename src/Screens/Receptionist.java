package Screens;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Receptionist {
    void recep_login() {
        JFrame f7 = new JFrame("Receptionist L'ogin");

        //images:'
        ImageIcon bg = new ImageIcon("src\\images\\bg1.jpg");
         ImageIcon img1 = new ImageIcon("src\\images\\recep.jpg");
         ImageIcon img2 = new ImageIcon("src\\images\\back1.png");

        //labels:
         JLabel l1 = new JLabel(img1);
         l1.setBounds(0, 0, 400, 400);

         JLabel l6 = new JLabel(bg);
         l6.setBounds(0, 0, 920, 550);

         JLabel l2 = new JLabel(img2);
        l2.setBounds(80, 380, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f7.setVisible(false);
                HomePage H = new HomePage();
                H.homepage();
            }
        });

        JLabel l3 = new JLabel();
        l3.setBounds(430, 0, 300, 150);
        l3.setText("RECEPTIONIST");
        l3.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 40));
        l3.setForeground(Color.BLUE);

        JLabel l4 = new JLabel("Enter Name");
        l4.setBounds(400, 110, 300, 120);
        l4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l5 = new JLabel(" Password");
        l5.setBounds(400, 165, 300, 120);
        l5.setFont(new Font("Arial", Font.BOLD, 15));

        //textFields:
        JTextField tf1 = new JTextField();
        tf1.setBounds(500, 156, 270, 30);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(500, 210, 270, 30);

        //Button:
        JButton b1 = new JButton("LOGIN");
        b1.setBounds(430, 270, 300, 35);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String pass = pf.getText();
                try {
                    BufferedReader read1 = new BufferedReader(new FileReader("output.text"));
                    String r1 = read1.readLine(); // Read the first line as the name
                    String r2 = read1.readLine(); // Read the second line as the password
                    read1.close();

                    if (r1.equals(name) && r2.equals(pass)) {
                        JOptionPane.showMessageDialog(f7, "Login Successfully!");
                        f7.setVisible(false);
                        manage_patient();
                    } else {
                        JOptionPane.showMessageDialog(f7, "Invalid name or password");
                    }
                } catch (IOException p) {
                    throw new RuntimeException(p);
                }
            }
        });

         f7.add(l2);f7.add(l3); f7.add(l1);
         f7.add(l4);f7.add(l5); f7.add(pf);
         f7.add(b1);f7.add(tf1);f7.add(l6);
         f7.setSize(850, 500);
         f7.setLayout(null);
         f7.setVisible(true);
         f7.setLocationRelativeTo(null);
    }
    void manage_patient() {
        JFrame f9 = new JFrame("Manage Patients");

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");

        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 345, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f9.setVisible(false);
                recep_login();
            }
        });

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(270, 220, 80, 40);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(370, 220, 120, 40);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l = new JLabel("PATIENTS");
        l.setBounds(430, 35, 850, 35);
        l.setFont(new Font("Arial", Font.BOLD, 35));
        l.setForeground(Color.BLUE);

        JLabel l4 = new JLabel("Patient name");
        l4.setBounds(120, 70, 100, 120);
        l4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l5 = new JLabel("Address");
        l5.setBounds(120, 125, 100, 120);
        l5.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l6 = new JLabel("Gender");
        l6.setBounds(120, 180, 100, 120);
        l6.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l7 = new JLabel("Purpose");
        l7.setBounds(555, 70, 100, 120);
        l7.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l8 = new JLabel("Referred Dr.");
        l8.setBounds(555, 125, 100, 120);
        l8.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l9 = new JLabel("Appointment");
        l9.setBounds(555, 180, 100, 120);
        l9.setFont(new Font("Arial", Font.BOLD, 15));

        JTextField tf1 = new JTextField();
        tf1.setBounds(260, 110, 200, 30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(680, 110, 200, 30);

        JTextField tf3 = new JTextField();
        tf3.setBounds(680, 167, 200, 30);

        JTextArea ta1 = new JTextArea();
        ta1.setBounds(260, 160, 200, 50);

        JTextArea ta2 = new JTextArea();
        ta2.setBounds(680, 220, 200, 40);

        JButton b1 = new JButton("Clear");
        b1.setBounds(290, 295, 200, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                ta1.setText("");
                ta2.setText("");
                bg.clearSelection();
            }
        });

        JButton bt = new JButton("Save");
        bt.setBounds(530, 295, 200, 30);
        bt.setFont(new Font("Arial", Font.BOLD, 15));
        bt.setForeground(Color.white);
        bt.setBackground(Color.BLUE);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String purpose = tf2.getText();
                String address = ta1.getText();
                String ref_dr = tf3.getText();
//                String gender = bg.getSelection().getActionCommand();
                String appoint = ta2.getText();
                if (name.isEmpty() && purpose.isEmpty() || address.isEmpty() || ref_dr.isEmpty() || appoint.isEmpty()) {
                    JOptionPane.showMessageDialog(f9, "Kindly fill all fields!");
                } else {
                    try {
                        BufferedWriter write2b = new BufferedWriter(new FileWriter("output2b.text",true));
                        write2b.write(name);
                        write2b.write("\n" + purpose);
                        write2b.write("\n" + address);
                        write2b.write("\n" + ref_dr);
//                        write2b.write("\n" + gender);
                        write2b.write("\n" + appoint + "\n");
                        write2b.close();
                    } catch (IOException p) {
                        throw new RuntimeException(p);
                    }
                    JOptionPane.showMessageDialog(f9, "Patient Added!");
                }

            }
        });
        f9.add(l); f9.add(l2);
        f9.add(l4); f9.add(l8);
        f9.add(l5);f9.add(l6);
        f9.add(r1); f9.add(r2);
        f9.add(tf1); f9.add(tf2);
        f9.add(ta1); f9.add(tf3);
        f9.add(l9); f9.add(ta2);
        f9.add(l7); f9.add(b1);
        f9.add(bt);
        f9.setLayout(null);
        f9.setVisible(true);
        f9.setSize(990,480);
        f9.setLocationRelativeTo(null);
    }

}