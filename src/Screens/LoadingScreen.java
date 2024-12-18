package Screens;
import javax.swing.*;
import java.awt.*;

public class LoadingScreen {
        static JProgressBar pb;

        public static void main(String args[]){

        JFrame f = new JFrame("Al-Shifa Medical Center");

        ImageIcon bg = new ImageIcon("src\\images\\bg1.jpg");
        JLabel l2 = new JLabel(bg);
        l2.setBounds(-20, 0, 920, 550);

        JLabel l = new JLabel("Al-Shifa Medical Center");
        l.setBounds(100, 50, 850, 35);
        l.setFont(new Font("Stencil", Font.PLAIN, 35));
        l.setForeground(Color.BLUE);

        pb = new JProgressBar(0,100);
        pb.setBounds(180,180,300,40);
        pb.setBorderPainted(false);
        pb.setValue(0);
        pb.setForeground(new Color(0,0,255));

        f.add(l);
        f.add(l2);
        f.add(pb);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(700, 350);
        f.setLocationRelativeTo(null);

            //Now calling the method:
            updateProgressBar();
            f.setVisible(false);
            HomePage H = new HomePage();
            H.homepage();
    }
        static void updateProgressBar() {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(25);
                pb.setValue(i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
