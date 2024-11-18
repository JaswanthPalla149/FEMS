import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
public class ReceptionistLoginGUI extends JFrame{
    public ReceptionistLoginGUI(){
        setTitle("ReceptionistLogin");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3,1));
        JLabel panellabel = new JLabel("password");
        JTextField password = new JTextField();
        JButton login = new JButton("Login");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(password.getText())==Receptionist.Password){
                    ReceptionistGUI receptionistGUI = new ReceptionistGUI();
                }
                else{
                   JOptionPane.showMessageDialog(login, "incorrect password");
                }
            }
        });
        panel.add(panellabel);
        panel.add(password);
        panel.add(login);
        add(panel);
    }
    public static void main(String[] args) {
        ReceptionistLoginGUI r = new ReceptionistLoginGUI();
    }
}