import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FarmerLoginGUI extends JFrame {
    public FarmerLoginGUI(){
        setTitle("FarmerLoginGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,600);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel id = new JLabel("ID :");
        JTextField idfield = new JTextField();
        JLabel password = new JLabel("Password :");
        JTextField pfield = new JTextField();
        JButton l = new JButton("Login");
        panel.add(id);
        panel.add(idfield);
        panel.add(password);
        panel.add(pfield);
        panel.add(l);
        add(panel);
        l.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int password = Integer.parseInt(pfield.getText());
               int id = Integer.parseInt(idfield.getText());
               Farmer d = Receptionist.getFfCFDB(id);
               if(password==d.FP){
               String name = d.getName();
               String town = d.getTown();
               long phone = d.getPhone();
               FarmerGUI farmerGUI = new FarmerGUI(id,name,town,phone);
               }
               else{
                JOptionPane.showMessageDialog(null, "wrong password");
               }
            }
    });
}
    public static void main(String[] args) {
        FarmerLoginGUI f = new FarmerLoginGUI();
    }
}
