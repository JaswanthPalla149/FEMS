import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SolutionGUI extends JFrame {
    public SolutionGUI(){
        setTitle("SolutionGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(200,400);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JLabel I = new JLabel("ID");
        JTextField T = new JTextField();
        JButton L = new JButton("See solution");
        panel.add(I);
        panel.add(T);
        panel.add(L);
        add(panel);
       
        L.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int id = Integer.parseInt(T.getText());
                Receptionist r = new Receptionist();
                String s = r.getSolution(id);
                System.out.println(s);
                JOptionPane.showMessageDialog(null,s);
            }
        });
    }
    public static void main(String[] args) throws Exception {
        SolutionGUI s = new SolutionGUI();
    }
}
