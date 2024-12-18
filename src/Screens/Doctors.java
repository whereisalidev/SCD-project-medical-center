package Screens;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

class Doctors{
    HomePage H = new HomePage();
     void view_doctors(){
        JFrame f8 = new JFrame("Doctors");

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");

//      Labels:
        JLabel l1 = new JLabel("DOCTORS");
        l1.setBounds(330, 10, 350, 120);
        l1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 35));
        l1.setForeground(Color.blue);

        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 395, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f8.setVisible(false);
                Admin A = new Admin();
                H.homepage();
            }
        });

         try {
             String[] column = {"ID", "NAME", "QUALIFICATION", "CONTACT", "ADDRESS"};
             BufferedReader read2a = new BufferedReader(new FileReader("output2a.text"));

             ArrayList<String[]> data = new ArrayList<>();
             String line;
             while ((line = read2a.readLine()) != null) {
                 String[] rowData = new String[5];
                 rowData[0] = line; // ID
                 rowData[1] = read2a.readLine(); // Name
                 rowData[2] = read2a.readLine(); // Qualification
                 rowData[3] = read2a.readLine(); // Contact
                 rowData[4] = read2a.readLine(); // Address
                 data.add(rowData);
             }
             read2a.close();

             String[][] dataArray = new String[data.size()][5];
             for (int i = 0; i < data.size(); i++) {
                 dataArray[i] = data.get(i);
             }

             JTable t = new JTable(dataArray, column);
             JScrollPane p = new JScrollPane(t);
             p.setBounds(20, 150, 800, 200);

             f8.add(p);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }


        f8.add(l1); f8.add(l2);

        f8.setSize(850, 520);
        f8.setLayout(null);
        f8.setVisible(true);
        f8.setLocationRelativeTo(null);
    }
}
