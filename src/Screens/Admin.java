package Screens;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Admin {
    void admin_login() {

        JFrame f2 = new JFrame("Admin Login");

        //images:
        ImageIcon img1 = new ImageIcon("src\\images\\admin3(1).png");
        ImageIcon img2 = new ImageIcon("src\\images\\back1.png");
        ImageIcon bg = new ImageIcon("src\\images\\bg1.jpg");

        //labels:
        JLabel l1 = new JLabel(img1);
        l1.setBounds(0, 0, 400, 400);

        JLabel l2 = new JLabel(img2);
        l2.setBounds(80, 380, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f2.setVisible(false);
                HomePage H = new HomePage();
                H.homepage();
            }
        });

        JLabel l3 = new JLabel();
        l3.setBounds(500, 0, 300, 150);
        l3.setText("ADMIN");
        l3.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 40));
        l3.setForeground(Color.BLUE);

        JLabel l4 = new JLabel("Enter Name");
        l4.setBounds(400, 110, 300, 120);
        l4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l5 = new JLabel(" Password");
        l5.setBounds(400, 165, 300, 120);
        l5.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l6 = new JLabel(bg);
        l6.setBounds(0, 0, 920, 550);

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
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String pass = pf.getText();
                if (name.equals("admin") && pass.equals("admin")) {
                    JOptionPane.showMessageDialog(f2, "Login successful!");
                    f2.setVisible(false);
                    admin_homepage();
                } else {
                    JOptionPane.showMessageDialog(f2, "Invalid name or password!");
                }
            }
        });

        f2.add(l1);f2.add(l2);
        f2.add(l3);f2.add(l4);
        f2.add(l5);f2.add(b1);
        f2.add(l6);
        f2.add(tf1);f2.add(pf);
        f2.setSize(850, 500);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setLocationRelativeTo(null);
    }
    void admin_homepage() {
        JFrame f3 = new JFrame("Admin Home page");

        //Labels:
        JLabel l1 = new JLabel("ADMIN PANEL");
        l1.setBounds(290, 0, 300, 100);
        l1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 35));
        l1.setForeground(Color.blue);

        //image:
        ImageIcon bg = new ImageIcon("src\\images\\bg1.jpg");
        JLabel l3 = new JLabel(bg);
        l3.setBounds(-20, 0, 920, 550);

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");
        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 350, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f3.setVisible(false);
                admin_login();
            }
        });

        //Buttons:
        JButton b1 = new JButton("Add Receptionist");
        b1.setBounds(250, 150, 300, 35);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(false);
                add_receptionist();
            }
        });

        JButton b2 = new JButton("View Receptionist");
        b2.setBounds(250, 200, 300, 35);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(false);
                view_recep();
            }
        });

        JButton b3 = new JButton("Add Doctors");
        b3.setBounds(250, 250, 300, 35);
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(false);
                add_doctors();
            }
        });


        f3.add(l1);
        f3.add(l2);
        f3.add(b1);
        f3.add(b2);
        f3.add(b3);
        f3.add(l3);
        f3.setSize(800, 500);
        f3.setLayout(null);
        f3.setVisible(true);
        f3.setLocationRelativeTo(null);
    }
    void add_receptionist() {
        JFrame f4 = new JFrame("Add Receptionist");

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");

        JLabel l1 = new JLabel("ADD RECEPTIONIST");
        l1.setBounds(240, 10, 350, 120);
        l1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 35));
        l1.setForeground(Color.blue);

        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 470, 150, 100);
        l2.addMouseListener(
                new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f4.setVisible(false);
                admin_homepage();
            }
        });

        JLabel l3 = new JLabel("Name");
        l3.setBounds(200, 110, 300, 120);
        l3.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l4 = new JLabel("Password");
        l4.setBounds(200, 165, 300, 120);
        l4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l5 = new JLabel("Email ID");
        l5.setBounds(200, 220, 300, 120);
        l5.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l6 = new JLabel("Contact");
        l6.setBounds(200, 275, 300, 120);
        l6.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l7 = new JLabel("Address");
        l7.setBounds(200, 330, 300, 120);
        l7.setFont(new Font("Arial", Font.BOLD, 15));


        JTextField tf1 = new JTextField();
        tf1.setBounds(350, 150, 270, 30);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(350, 203, 270, 30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(350, 260, 270, 30);

        JTextField tf3 = new JTextField();
        tf3.setBounds(350, 315, 270, 30);

        JTextArea ta = new JTextArea();
        ta.setBounds(350, 368, 270, 50);

        JButton b = new JButton("Submit");
        b.setBounds(250, 450, 300, 35);
        b.setFont(new Font("Arial", Font.BOLD, 15));
        b.setForeground(Color.white);
        b.setBackground(Color.blue);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String pass = pf.getText();
                String email = tf2.getText();
                String contact = tf3.getText();
                String address = ta.getText();
                if (name.isEmpty() || pass.isEmpty() || email.isEmpty() || contact.isEmpty() || address.isEmpty()) {
                    JOptionPane.showMessageDialog(f4, "Kindly fill all fields!");
                    tf1.setText("");pf.setText("");
                    tf2.setText("");tf3.setText("");ta.setText("");
                } else {
                try {
                    BufferedWriter write1 = new BufferedWriter(new FileWriter("output.text"));
                    write1.write(name);
                    write1.write("\n"+pass);
                    write1.write("\n"+email);
                    write1.write("\n"+contact);
                    write1.write("\n"+address);
                    write1.close();
                } catch (IOException p) {
                    throw new RuntimeException(p);
                }
                    JOptionPane.showMessageDialog(f4, "Submitted!");
                    tf1.setText("");pf.setText("");
                    tf2.setText("");tf3.setText("");ta.setText("");
                    f4.setVisible(false);
                    admin_homepage();
                }
            }
        });
        f4.add(l1);f4.add(l3);
        f4.add(l2);f4.add(l4);
        f4.add(l5);f4.add(l6);
        f4.add(l7);f4.add(tf1);
        f4.add(tf2);f4.add(pf);
        f4.add(ta);f4.add(tf3);
        f4.add(b);
        f4.setSize(800, 650);
        f4.setLayout(null);
        f4.setVisible(true);
        f4.setLocationRelativeTo(null);
    }
    void view_recep() {
        JFrame f5 = new JFrame("View Receptionist");

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");

        JLabel l1 = new JLabel("VIEW RECEPTIONIST");
        l1.setBounds(240, 10, 350, 120);
        l1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 35));
        l1.setForeground(Color.blue);

        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 395, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f5.setVisible(false);
                admin_homepage();
            }
        });

        JLabel l3 = new JLabel();
        l3.setBounds(450, 40, 350, 420);
        l3.setFont(new Font("Arial", Font.PLAIN, 18));
        try {
            BufferedReader read1 = new BufferedReader(new FileReader("output.text"));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = read1.readLine()) != null) {
                content.append(line).append("<br><br>"); // Add a line break after each line
            }
            read1.close();
            l3.setText("<html>" + content.toString() + "</html>"); // Set the content as HTML text
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JLabel l4 = new JLabel("NAME :");
        l4.setBounds(250, 97, 350, 120);
        l4.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel l5 = new JLabel("PASSWORD :");
        l5.setBounds(250, 140, 350, 120);
        l5.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel l6 = new JLabel("EMAIL ID : ");
        l6.setBounds(250, 185, 350, 120);
        l6.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel l7 = new JLabel("CONTACT NO : ");
        l7.setBounds(250, 228, 350, 120);
        l7.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel l8 = new JLabel("ADDRESS : ");
        l8.setBounds(250, 270, 350, 120);
        l8.setFont(new Font("Arial", Font.BOLD, 18));

        f5.add(l1); f5.add(l2);f5.add(l3);
        f5.add(l4); f5.add(l5);f5.add(l6);
        f5.add(l7); f5.add(l8);
        f5.setSize(850, 520);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.setLocationRelativeTo(null);
    }
    void add_doctors(){
        JFrame f4 = new JFrame("Add Doctor");

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");

        JLabel l1 = new JLabel("ADD DOCTORS");
        l1.setBounds(240, 10, 350, 120);
        l1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 35));
        l1.setForeground(Color.blue);

        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 470, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f4.setVisible(false);
                admin_homepage();
            }
        });

        JLabel l3 = new JLabel("Doctor ID");
        l3.setBounds(200, 110, 300, 120);
        l3.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l4 = new JLabel("Name");
        l4.setBounds(200, 165, 300, 120);
        l4.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l5 = new JLabel("Qualifications");
        l5.setBounds(200, 220, 300, 120);
        l5.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l6 = new JLabel("Contact");
        l6.setBounds(200, 275, 300, 120);
        l6.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel l7 = new JLabel("Address");
        l7.setBounds(200, 330, 300, 120);
        l7.setFont(new Font("Arial", Font.BOLD, 15));

//      textfields:
        JTextField tf1 = new JTextField();
        tf1.setBounds(350, 150, 270, 30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(350, 203, 270, 30);

        JTextField tf3 = new JTextField();
        tf3.setBounds(350, 260, 270, 30);

        JTextField tf4 = new JTextField();
        tf4.setBounds(350, 315, 270, 30);

        JTextArea ta = new JTextArea();
        ta.setBounds(350, 368, 270, 50);

        JButton b = new JButton("Submit");
        b.setBounds(250, 450, 300, 35);
        b.setFont(new Font("Arial", Font.BOLD, 15));
        b.setForeground(Color.white);
        b.setBackground(Color.blue);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = tf1.getText();
                String name2 = tf2.getText();
                String qualify = tf3.getText();
                String contact2 = tf4.getText();
                String address2 = ta.getText();
                if (id.isEmpty() && name2.isEmpty() || qualify.isEmpty() || contact2.isEmpty() || address2.isEmpty()) {
                    JOptionPane.showMessageDialog(f4, "Kindly fill all fields!");
                } else {
                try {
                    BufferedWriter write2 = new BufferedWriter(new FileWriter("output2a.text",true));
                    write2.write(id);
                    write2.write("\n" + name2);
                    write2.write("\n" + qualify);
                    write2.write("\n" + contact2);
                    write2.write("\n" + address2+"\n");
                    write2.close();
                } catch (IOException p) {
                    throw new RuntimeException(p);
                }
                    JOptionPane.showMessageDialog(f4, "Doctor Added!");
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    ta.setText("");
                    f4.setVisible(false);
                    admin_homepage();
                }
            }
        });

        f4.add(l1);f4.add(l3);
        f4.add(l2);f4.add(l4);
        f4.add(l5);f4.add(l6);
        f4.add(l7);f4.add(tf1);
        f4.add(tf2);f4.add(tf4);
        f4.add(ta);f4.add(tf3);
        f4.add(b);
        f4.setSize(800, 650);
        f4.setLayout(null);
        f4.setVisible(true);
        f4.setLocationRelativeTo(null);
    }
}

