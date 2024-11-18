import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
public class ChangePasscode extends JFrame{
    int np;
    public ChangePasscode(){
        setTitle("Change Passcode");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,800);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3,1));
        JLabel l = new JLabel("set password");
        JButton j = new JButton("ok");
        JTextField t = new JTextField();
        panel.add(l);
        panel.add(t);
        panel.add(j);
        add(panel);
        j.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                np = Integer.parseInt(t.getText());
                Receptionist.setPassword(np);
            }
        });
    }
    public int pass(){
        return np;
    }
}
