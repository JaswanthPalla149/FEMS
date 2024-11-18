import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ExpertLoginGUI extends JFrame{
    public ExpertLoginGUI() {
            setTitle("ExpertLoginGUI");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(200,400);
            setLocationRelativeTo(null);
            setVisible(true);
            JPanel panel = new JPanel(new GridLayout(5, 1));
            JLabel I = new JLabel("ID");
            JTextField T = new JTextField();
            JLabel P = new JLabel("Password");
            JTextField p = new JTextField();
            JButton L = new JButton("Login");
            panel.add(I);
            panel.add(T);
            panel.add(P);
            panel.add(p);
            panel.add(L);
            add(panel);
            
            L.addActionListener(new ActionListener() {
               
                public void actionPerformed(ActionEvent e){
                    int index = Integer.parseInt(T.getText());
            int code = Integer.parseInt(p.getText());
            Receptionist r = new Receptionist();
                    System.out.println("in action listener");
                    int l = r.getExpertData(index).passcode;
                    if(l==code){
                        String o = "you have no Cases yet!!";
                       
                        JOptionPane.showMessageDialog(null,r.getExpertData(code).getCases());
                        r.setCase(o, index);

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "please enter the correct password");
                    }
                }
            });
    }
    public static void main(String[] args) {
        ExpertLoginGUI e = new ExpertLoginGUI();
    }
}
