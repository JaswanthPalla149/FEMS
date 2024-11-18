import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
public class ExpertGUI extends JFrame{
    public ExpertGUI(){
        setTitle("ExpertGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200,1200);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(2,1));
        JButton LoginButton = new JButton("Login");
        JButton RegisterButton = new JButton("Register");
        RegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ExpertRegistrationGUI egui = new ExpertRegistrationGUI();
            }
        });
        LoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ExpertLoginGUI m = new ExpertLoginGUI();
            }
        });
        panel.add(LoginButton);
        panel.add(RegisterButton);
        add(panel);
    }
}
