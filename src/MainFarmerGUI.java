import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainFarmerGUI extends JFrame{
    public MainFarmerGUI(){
        setTitle("MainFarmerGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200,1200);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JButton N = new JButton("Sign up");
        JButton L = new JButton("Login");
        JButton S = new JButton("Solution");
        panel.add(N);
        panel.add(L);
        panel.add(S);
        add(panel);
        N.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                FarmerRegistrationGUI f = new FarmerRegistrationGUI();
            }
        });
        L.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                FarmerLoginGUI f = new FarmerLoginGUI();
            }
        });
        S.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SolutionGUI s = new SolutionGUI();
            }
        });
            
    }
}
