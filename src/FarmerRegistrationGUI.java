import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FarmerRegistrationGUI extends JFrame {
    public FarmerRegistrationGUI(){
        setTitle("FarmerRegistrationGUI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200,1200);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JLabel P = new JLabel("Set your Password :");
        JTextField Pfield = new JTextField();
        JLabel namelabel = new JLabel("Name :");
        JTextField nameField = new JTextField();
        JLabel Phonelabel = new JLabel("Phone :");
         JTextField phonField = new JTextField();
        JLabel Townlabel = new JLabel("Town :");
        JTextField Townfield = new JTextField();
       
        JButton RegisterButton = new JButton("Register");
        JButton confirm = new JButton("Confirm Details");
       
        panel.add(namelabel);
        panel.add(nameField);
        panel.add(Phonelabel);
        panel.add(phonField);
        panel.add(Townlabel);
        panel.add(Townfield);
        panel.add(P);
        panel.add(Pfield);
        panel.add(RegisterButton);
        panel.add(confirm);
        add(panel);
        RegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               
                String name = nameField.getText();
                long ph= Long.parseLong(phonField.getText());
                String town = Townfield.getText();
                int password = Integer.parseInt(Pfield.getText());
                Farmer Dynamic = new Farmer(0,name,ph,town," "," ");
                Receptionist r = new Receptionist();
                int index = r.addFtoCFDB(Dynamic,password);
                JOptionPane.showMessageDialog(null, "Registered Succesfully "+Dynamic.getName()+" and your ID is :"+ index);
                //r.addFramerData(Dynamic);
               // Dynamic2 = Dynamic;
            }
        });
}
public static void main(String[] args) {
    FarmerRegistrationGUI f =new FarmerRegistrationGUI();
}
}
