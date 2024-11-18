import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
public class ReceptionistGUI extends JFrame {
    protected static int Password;
    public ReceptionistGUI(){
        Receptionist r = new Receptionist();
        setTitle("ReceptionistGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200,1200);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3,1));
        JButton BookSlots = new JButton("Book Slots");
        JButton Salary = new JButton("Draw Salary");
        JButton cp = new JButton("change password");
        panel.add(BookSlots);
        panel.add(Salary);
        panel.add(cp);
        add(panel);
        BookSlots.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                r.BookSlots();
            }
        });
        cp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ChangePasscode cPasscode = new ChangePasscode();
            }
        });
    }
    public static void main(String[] args) {
        ReceptionistGUI n = new ReceptionistGUI();
    }
}