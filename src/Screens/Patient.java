package Screens;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class Patient {
    void view_patient() {
        JFrame f10 = new JFrame("View Patient Details");

        ImageIcon img1 = new ImageIcon("src\\images\\back1.png");

//      Labels:
        JLabel l1 = new JLabel("Patient Details & Appointments");
        l1.setBounds(140, 10, 650, 120);
        l1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 35));
        l1.setForeground(Color.blue);

        JLabel l2 = new JLabel(img1);
        l2.setBounds(20, 395, 150, 100);
        l2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                f10.setVisible(false);
                HomePage H = new HomePage();
                H.homepage();
            }
        });
        try {
            String[] column = {"NAME", "PURPOSE", "ADDRESS", "REF DR.", "APPOINTMENT"};
            BufferedReader read2a = new BufferedReader(new FileReader("output2b.text"));

            ArrayList<String[]> data = new ArrayList<>();
            String line;
            while ((line = read2a.readLine()) != null) {
                String[] rowData = new String[5];
                rowData[0] = line; // name
                rowData[1] = read2a.readLine(); // purpose
                rowData[2] = read2a.readLine(); // address
                rowData[3] = read2a.readLine(); // ref dr
                rowData[4] = read2a.readLine(); // appoint
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

            f10.add(p);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }


        f10.add(l1);
        f10.add(l2);
        f10.setSize(850, 520);
        f10.setLayout(null);
        f10.setVisible(true);
        f10.setLocationRelativeTo(null);
    }
}